package com.capestart.workflow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loadIndexPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView loadAdminHomePage() {
		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Admministrator Control Panel");
        model.addObject("message", "This page demonstrates how to use Spring security.");
		return model;
	}
}
