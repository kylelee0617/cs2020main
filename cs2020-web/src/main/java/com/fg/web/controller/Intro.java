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
		String goPage = "testIndex";
		
		Cookie cookie = CookiesUtil.getCookieByName(request, "userLogInfo");
		if(cookie == null) {
			goPage = "testLogin";
		} else {
			logger.info(">>>" + cookie.getValue());
		}
		
		model.addAttribute("title", title);
		model.addAttribute("sessionId", request.getSession().getId());
		
		return goPage;
	}
	
	
}
