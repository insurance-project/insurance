package com.insurance.controller;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.insurance.model.insurance.Insurance;
import com.insurance.service.InsuranceService;

@Controller
public class DesignController {
	
	@Autowired
	private InsuranceService insuranceService;
	
	@RequestMapping(value = "/design", method = RequestMethod.GET)
	public String design(Locale locale, Model model, HttpServletRequest request, Insurance insurance) {
		String Name = request.getParameter("InsuraceName");
		String Kind = request.getParameter("Kind");
		int Premium = Integer.parseInt(request.getParameter("Premium"));
		
		insurance.setName(Name);
		insuranceService.InsertBoard(insurance);
		return "design";
	}
	
	@RequestMapping(value = "/salesOpen", method = RequestMethod.GET)
	public String salesOpen(Locale locale, Model model) {
				
		return "salesOpen";
	}
	
	@RequestMapping(value = "/insuranceList", method = RequestMethod.GET)
	public String insuranceList(Locale locale, Model model) {
				
		return "insuranceList";
	}
	
	@RequestMapping(value = "/insuranceModify", method = RequestMethod.GET)
	public String insuranceModify(Locale locale, Model model) {
				
		return "insuranceModify";
	}
		
}
