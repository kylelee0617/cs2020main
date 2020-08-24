package com.fg.web.controller.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

@Controller
@RequestMapping("/basic")
public class Basic extends BaseController {

	@RequestMapping("/basic/custData")
	public String custData(Model model) {
		
		return "page/basic/basic/custData/custData";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		return "page/test";
	}
	
}
