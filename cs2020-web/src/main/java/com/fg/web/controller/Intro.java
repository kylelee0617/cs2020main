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
	
//	CookiesUtil cookieUtil = new CookiesUtil();

	@RequestMapping("/GO")
	public String goHomePage(HttpServletRequest request, @RequestParam(value = "title", required = false, defaultValue = "GO") String title, Model model) {
		String goPage = "view/index";
		
//		Cookie cookie = CookiesUtil.getCookieByName(request, "userLogInfo");
		if(CookiesUtil.getCookieByName(request, "userLogInfo") == null) {
			goPage = "view/login";
		}
		
		model.addAttribute("title", title);
		model.addAttribute("sessionId", request.getSession().getId());
		
		return goPage;
	}
	
	
}
