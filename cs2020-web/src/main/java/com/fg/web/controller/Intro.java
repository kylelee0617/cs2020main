package com.fg.web.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fg.web.utils.CookiesUtil;
import com.fg.web.vo.UserInfo;

@Controller
public class Intro extends BaseController {
	
	private final static String USERACCOUNT = "kyle";
	private final static String USERPASSWORD = "lee0123";

	@RequestMapping("/烘培雞")
	public String goHomePage(HttpServletRequest request, @RequestParam(value = "title", required = false, defaultValue = "GO") String title, Model model) {
		goPage = "page/index";
		
		Cookie ckLogInfo = CookiesUtil.getCookieByName(request, "userLogInfo");
		if(ckLogInfo == null) {
			logger.info(">>> no user info");
			return "page/login";
		}
		
		Cookie ckJSESSIONID = CookiesUtil.getCookieByName(request, "JSESSIONID");
		logger.info(">>Jid:" + ckJSESSIONID.getValue());
		
		//TODO: 解密cookie , 驗證sql中使用者帳密
		
		model.addAttribute("user", USERACCOUNT);
		model.addAttribute("sessionId", request.getSession().getId());
		
		return goPage;
	}
	
	@RequestMapping("/doLogin")
	public String doLogin(HttpServletResponse res , Model model, 
			@RequestParam(value = "useracc", required = true) String useracc, 
			@RequestParam(value = "userpsw", required = true) String userpsw) {
		
		logger.info(">>>useracc : " + useracc);
		logger.info(">>>userpsw : " + userpsw);
		
		//輸入錯誤，踢回LOGIN
		if(StringUtils.pathEquals(useracc, "") || StringUtils.pathEquals(userpsw, "")) {
			return "page/login";
		}
		
		//TOFO: 資料庫檢核
		if( !StringUtils.pathEquals(useracc, USERACCOUNT) || !StringUtils.pathEquals(userpsw, USERPASSWORD)) {
			return "page/login";
		}
		
		//無誤，處理後允許登入
		CookiesUtil.setCookie(res, "userLogInfo", useracc + userpsw, 300);
		UserInfo userInfo = new UserInfo();
		userInfo.setUseracc(useracc);
		userInfo.setUserpsw(userpsw);
		model.addAttribute("userInfo", userInfo);
		goPage = "page/index";
		
		return goPage;
	}
	
	
}
