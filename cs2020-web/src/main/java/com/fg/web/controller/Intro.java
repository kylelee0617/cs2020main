package com.fg.web.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fg.web.utils.CookiesUtil;

@Controller
public class Intro extends BaseController {
	
	private final static String USERACCOUNT = "kyle";
	private final static String USERPASSWORD = "lee0123";

	@RequestMapping("/烘培雞")
	public String goHomePage(HttpServletRequest request, @RequestParam(value = "title", required = false, defaultValue = "GO") String title, Model model) {
		String goPage = "page/index";
		
		Cookie ckLogInfo = CookiesUtil.getCookieByName(request, "userLogInfo");
		if(ckLogInfo == null) {
			goPage = "testLogin";
			return goPage;
		} 
		
		Cookie ckJSESSIONID = CookiesUtil.getCookieByName(request, "JSESSIONID");
		logger.info(">>Jid:" + ckJSESSIONID.getValue());
		
		//TODO: 解密cookie , 驗證sql中使用者帳密
		
		model.addAttribute("user", USERACCOUNT);
		model.addAttribute("sessionId", request.getSession().getId());
		
		return goPage;
	}
	
	@RequestMapping("/doLogin")
	public String login(HttpServletRequest request, @RequestParam(value = "title", required = false, defaultValue = "GO") String title, Model model) {
		
		
		
		return "";
	}
	
	
}
