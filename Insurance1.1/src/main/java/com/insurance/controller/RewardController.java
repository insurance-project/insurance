package com.insurance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RewardController {
	@RequestMapping(value="/receipt", method=RequestMethod.GET)
	public String receipt() {		
		return "receipt";
	}
	
	@RequestMapping(value="/payment", method=RequestMethod.GET)
	public String payment() {		
		return "payment";
	}
}
