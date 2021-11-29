package com.insurance.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.insurance.model.insurance.Insurance;
import com.insurance.model.insurance.PredictProfit;
import com.insurance.service.InsuranceService;
import com.insurance.service.PredictProfitService;

@Controller
@RequestMapping("/design/*")
public class PredictProfitController {
	
	@Autowired
	private PredictProfitService predictProfitService;
		
	@RequestMapping(value = "/predictProfit", method = RequestMethod.GET)
	public String predictProfit(Locale locale, Model model) throws Exception {		
		return "design/predictProfit";
	}
	
	@RequestMapping(value = "/predict.do", method = RequestMethod.POST)
	public String CalPredictProfit(Model model, HttpServletRequest request) throws Exception {		
		int Profit = Integer.parseInt(request.getParameter("Profit"));
		int Subscribers = Integer.parseInt(request.getParameter("Subscribers"));		
		
		int TotalProfit = Profit*Subscribers;		
		model.addAttribute("profit",Profit);
		model.addAttribute("subscribers",Subscribers);
		model.addAttribute("totalProfit",TotalProfit);		
		
		return "design/predictProfit";
	}
	
	@RequestMapping(value = "/setPredict.do", method = RequestMethod.POST)
	public String deleteInsurance(Model model, HttpServletRequest request,PredictProfit predictProfit) throws Exception {
		//int InsuranceID = Integer.parseInt(request.getParameter("InsuranceID"));
		int InsuranceID = InsuranceDesignController.insuranceID;
		int Profit = Integer.parseInt(request.getParameter("Profit"));
		int Subscribers = Integer.parseInt(request.getParameter("Subscribers"));	
		int TotalProfit = Integer.parseInt(request.getParameter("TotalProfit"));	 
		predictProfit.setPredictProfitID(InsuranceID);
		predictProfit.setProfit(Profit);
		predictProfit.setSubscribers(Subscribers);
		predictProfit.setTotalProfit(TotalProfit);	
		predictProfitService.InsertPredictProfit(predictProfit);	
		
		return "redirect:/design/insuranceList";
	}
	
}
