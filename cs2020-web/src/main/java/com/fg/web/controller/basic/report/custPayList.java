package com.fg.web.controller.basic.report;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fg.web.controller.BaseController;

@Controller
@RequestMapping("/basic/report")
public class custPayList extends BaseController {

	@RequestMapping("/custPayList")
	public String index(Model model) {
		return "page/basic/report/custPayList/custPayList";
	}
	
}
