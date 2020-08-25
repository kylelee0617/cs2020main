package com.fg.web.controller.basic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

@Controller
@RequestMapping("/basic/basic")
public class BasicCode extends BaseController {

	@RequestMapping("/basicCode")
	public String custData(Model model) {
		return "page/basic/basic/basicCode/basicCode";
	}
	
}
