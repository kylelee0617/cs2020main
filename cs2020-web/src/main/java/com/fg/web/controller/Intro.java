package com.fg.web.controller;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.entity.UsersEntity;
import com.fg.service.UsersService;
import com.fg.web.Enum.EnumRESCode;
import com.fg.web.utils.AES;
import com.fg.web.utils.CookiesUtil;

@Controller
public class Intro extends BaseController {
	
	@Autowired
	UsersService userServ;
	
	UsersEntity user;

	@RequestMapping("/home")
	public String goHomePage(HttpServletRequest req, Model model) {
		user = new UsersEntity();
		model.addAttribute("user", user);

		//取得token
		Cookie ckLogInfo = CookiesUtil.getCookieByName(req, "FGlogInfo");
		if (ckLogInfo == null) {
			logger.info(">>> no user info");
			return "redirect:/login";
		}

		// 解密token
		String[] dyToken = AES.AESDncode(RULEKEY, ckLogInfo.getValue()).split("&&");
		String time = dyToken[0];
		String useracc = dyToken[1];
		String userpsw = dyToken[2];
		
		//驗證時間有效
		EnumRESCode validToken = this.validTime(Long.parseLong(time));
		if(validToken.getCode() != EnumRESCode.SUCCESS.getCode()) {
			model.addAttribute("result", validToken);
			return "redirect:/login";
		}
		
		//帳密檢核
		EnumRESCode validAccPsw = this.validUser(useracc, userpsw);
		if(validAccPsw.getCode() != EnumRESCode.SUCCESS.getCode()) {
			model.addAttribute("result", validAccPsw);
			return "redirect:/login";
		}
		
		model.addAttribute("user", user);

		return "page/index";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new UsersEntity());
		return "page/login";
	}

	@RequestMapping("/doLogin")
	public String doLogin(HttpServletResponse res, Model model, @ModelAttribute(value = "user") UsersEntity user) {
		String useracc = user.getUseracc();
		String userpsw = user.getUserpsw();
		logger.info(">>>useracc : " + useracc);
		logger.info(">>>userpsw : " + userpsw);
		
		

		//帳密檢核
		EnumRESCode validAccPsw = this.validUser(useracc, userpsw);
		if(validAccPsw.getCode() != EnumRESCode.SUCCESS.getCode()) {
			model.addAttribute("result", validAccPsw);
			return "redirect:/login";
		}
		
		// 無誤，處理後允許登入
		//組成加密token
		StringBuilder aesLoginMsg = new StringBuilder();
		aesLoginMsg.append(System.currentTimeMillis());
		aesLoginMsg.append("&&");
		aesLoginMsg.append(useracc);
		aesLoginMsg.append("&&");
		aesLoginMsg.append(userpsw);
		CookiesUtil.setCookie(res, "FGlogInfo", AES.AESEncode(RULEKEY, aesLoginMsg.toString()), 300);

		return "redirect:/home";
	}
	
	private EnumRESCode validUser(String useracc , String userpsw) {
		// 輸入空白
		if (StringUtils.pathEquals(useracc, "") || StringUtils.pathEquals(userpsw, "")) {
			return EnumRESCode.LOGINFAIL;
		}
		
		// 資料庫檢核
		List<UsersEntity> usersList = userServ.getUserByUseracc(useracc);
		if(usersList.size() != 1) {
			return EnumRESCode.LOGINFAIL;	//不為一筆 = 有問題
		}
		
		if(!StringUtils.pathEquals(userpsw, usersList.get(0).getUserpsw())) {
			return EnumRESCode.ACCPSWFAIL;	//密碼錯誤
		}
		
		this.user = usersList.get(0);
		return EnumRESCode.SUCCESS;
	}
	
	/**
	 * 驗證token是否過期
	 * @param time
	 * @return
	 */
	public EnumRESCode validTime(Long tokenTime) {
		long crrTime = System.currentTimeMillis();
		
		//取得原戳記N天後的時間戳記
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTimeInMillis(tokenTime);
		calendar1.add(Calendar.DATE, TOKENDAY);
		long validTime = calendar1.getTimeInMillis();
		
		//現在戳記 > 原+30天 = 超過
		if(crrTime > validTime) {
			return EnumRESCode.TOKENOUTOFTIME;
		}
			
		return EnumRESCode.SUCCESS;
	}
	
}
