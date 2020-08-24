package com.fg.web.controller.pay.pay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

@Controller
@RequestMapping("/pay/pay")
public class payNotice extends BaseController {

	@RequestMapping("/payNotice")
	public String custData(Model model) {
		return "page/pay/pay/payNotice/payNotice";
	}
	
}
