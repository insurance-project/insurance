package com.insurance.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.insurance.model.insurance.Insurance;
import com.insurance.model.insurance.SalePerform;
import com.insurance.service.InsuranceService;
import com.insurance.service.SalePerformService;

@Controller
@RequestMapping("/design/*")
public class InsuranceDesignController {
	
	public static int insuranceID;
	
	@Autowired
	private InsuranceService insuranceService;
	@Autowired
	private SalePerformService salePerformService;
	
	@RequestMapping(value = "/insuranceDesign", method = RequestMethod.GET)
	public String insuranceDesign(Model model) throws Exception {
				
		return "design/insuranceDesign";
	}
	
	
	@RequestMapping(value = "/insuranceDesign.do", method = RequestMethod.POST)
	public String DoInsuranceDesign(HttpServletRequest request, Insurance insurance, SalePerform salePerform) throws Exception {
		String Name = ((String)request.getParameter("InsuraceName"));
		String Kind = ((String) request.getParameter("Kind"));
		int Premium = Integer.parseInt(request.getParameter("Premium"));
		int Warranty = Integer.parseInt(request.getParameter("Warranty"));
		int RewardCost = Integer.parseInt(request.getParameter("Reward"));
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
		insuranceID = insurance.getInsuranceID();
		
		// salePerform profit 추가해줘야함 <db에도 추가하기 insert>
		salePerform.setProfit(Premium);
		salePerformService.InsertSalePerform(salePerform);
		
		return "design/predictProfit";
	}
	

	@RequestMapping(value = "/insuranceList", method = RequestMethod.GET)
	public String insuranceList(Model model) throws Exception {
		List<Insurance> insuranceList = insuranceService.SelectInsuranceList(); 
		model.addAttribute("insuranceList", insuranceList);		
		return "design/insuranceList";
	}
	
	@RequestMapping(value = "/insuranceModify", method = RequestMethod.GET)
	public String insuranceModify(Model model, HttpServletRequest request, Insurance insurance) throws Exception {
		int insuranceID = Integer.parseInt(request.getParameter("no"));
		insurance = insuranceService.SelectInsuranceInfo(insuranceID);
		
		model.addAttribute("InsuranceName", insurance.getInsuranceName());
		model.addAttribute("Kind", insurance.getKind());
		model.addAttribute("Premium", insurance.getPremium());
		model.addAttribute("PremiumRate", insurance.getPremiumRate());
		model.addAttribute("Warranty", insurance.getWarranty());
		model.addAttribute("Reward", insurance.getRewardCost());
		model.addAttribute("RewardRate", insurance.getRewardRate());
		model.addAttribute("InsuranceID", insurance.getInsuranceID());

		return "design/insuranceModify";
	}
	
	@RequestMapping(value = "/insuranceModify.do", method = RequestMethod.POST)
	public String DoInsuranceModify(Model model, HttpServletRequest request, Insurance insurance, SalePerform salePerform) throws Exception {
				
		String Name = ((String) request.getParameter("InsuraceName"));
		String Kind = ((String) request.getParameter("Kind"));
		int Premium = Integer.parseInt(request.getParameter("Premium"));
		int Warranty = Integer.parseInt(request.getParameter("Warranty"));
		int RewardCost = Integer.parseInt(request.getParameter("Reward"));
		float PremiumRate = Float.parseFloat(request.getParameter("PremiumRate"));
		float RewardRate = Float.parseFloat(request.getParameter("RewardRate"));
		int InsuranceID = Integer.parseInt(request.getParameter("InsuranceID"));
		insurance.setInsuranceName(Name);
		insurance.setKind(Kind);
		insurance.setPremium(Premium);
		insurance.setWarranty(Warranty);
		insurance.setRewardCost(RewardCost);
		insurance.setPremiumRate(PremiumRate);
		insurance.setRewardRate(RewardRate);
		insurance.setInsuranceID(InsuranceID);
		
		insuranceService.UpdateInsuranceInfo(insurance);
		
		// salePerform 수정
		int salePerformID = insurance.getInsuranceID();
		salePerform.setProfit(Premium);
		salePerform.setSalePerformID(salePerformID);
		salePerformService.UpdateSalePerform(salePerform);
		
		return "redirect:/design/insuranceList";
	}

	@RequestMapping(value = "/deleteInsurance", method = RequestMethod.GET)
	public String deleteInsurance(@RequestParam("insuranceID") int insuranceID, SalePerform salePerform) throws Exception {
		insuranceService.DeleteInsurance(insuranceID);
		int salePerformID = insuranceID;
		salePerform.setSalePerformID(salePerformID);
		salePerformService.DeleteSalePerform(salePerformID);
		return "redirect:/design/insuranceList";
	}
	
		
}
