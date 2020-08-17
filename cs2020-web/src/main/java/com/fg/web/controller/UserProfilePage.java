package com.fg.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserProfilePage extends BaseController {
	
	@RequestMapping("/MyFirstPage")
	public String greeting(@RequestParam(value = "title", required = false, defaultValue = "good") String title, Model model) {
		model.addAttribute("title", title);
		return "index";
	}
}
