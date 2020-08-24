package com.fg.web.controller.pay.get;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

@Controller
@RequestMapping("/pay/get")
public class getMoney extends BaseController {

	@RequestMapping("/getMoney")
	public String custData(Model model) {
		return "page/pay/get/getMoney/getMoney";
	}
	
}
