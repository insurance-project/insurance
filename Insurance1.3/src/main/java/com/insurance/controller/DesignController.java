package com.insurance.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.insurance.model.insurance.Insurance;
import com.insurance.model.insurance.PredictProfit;
import com.insurance.service.InsuranceService;

@Controller
public class DesignController {
	
	@Autowired
	private InsuranceService insuranceService;
	
	@RequestMapping(value = "/design", method = RequestMethod.GET)
	public String design(Locale locale, Model model) {
				
		return "design";
	}
	
	
	@RequestMapping(value = "/design.do", method = RequestMethod.POST)
	public String DoDesign(Model model, HttpServletRequest request, Insurance insurance, PredictProfit predictProfit) {
		String Name = request.getParameter("InsuraceName");
		String Kind = ((String) request.getParameter("Kind"));
		int Premium = Integer.parseInt(request.getParameter("Premium"));
		int Warranty = Integer.parseInt(request.getParameter("Warranty"));
		int RewardCost = Integer.parseInt(request.getParameter("Reward"));
		int Subscribers = Integer.parseInt(request.getParameter("Subscribers"));
		float PremiumRate = Float.parseFloat(request.getParameter("PremiumRate"));
		float RewardRate = Float.parseFloat(request.getParameter("RewardRate"));
		insurance.setInsuranceName(Name);
		insurance.setKind(Kind);
		insurance.setPremium(Premium);
		insurance.setWarranty(Warranty);
		insurance.setRewardCost(RewardCost);
		insurance.setPremiumRate(PremiumRate);
		insurance.setRewardRate(RewardRate);
		
		insuranceService.InsertInsurance(insurance);
		
//		predictProfit.setProfit(Premium);
//		predictProfit.setSubscribers(Subscribers);
//		int TotalProfit = Premium * Subscribers;
//		predictProfit.setTotalProfit(TotalProfit);
//		
//		model.addAttribute("TotalProfit", TotalProfit);
//		System.out.println(Premium);
//		System.out.println(Subscribers);
//		System.out.println(TotalProfit);
		
		
		return "home";
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
