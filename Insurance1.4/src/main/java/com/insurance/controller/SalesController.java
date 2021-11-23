package com.insurance.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SalesController {
	
	@RequestMapping(value = "/salesOpen", method = RequestMethod.GET)
	public String salesOpen(Locale locale, Model model) {
				
		return "salesOpen";
	}

}
