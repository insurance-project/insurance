package com.insurance.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.insurance.dto.ContractDTO;
import com.insurance.dto.ReceiptDTO;
import com.insurance.model.accident.Accident;
import com.insurance.model.accident.Reward;
import com.insurance.model.contract.Contract;
import com.insurance.model.customer.Customer;
import com.insurance.model.insurance.Insurance;
import com.insurance.model.insurance.PredictProfit;
import com.insurance.service.AccidentService;
import com.insurance.service.CustomerService;
import com.insurance.service.RewardService;

@Controller
@RequestMapping("/accident/*")
public class RewardController {
	
	public static int accidentID;
	
	@Autowired
	private RewardService rewardService;
	

	@RequestMapping(value="/receiptList", method=RequestMethod.GET)
	public String receiptList(Model model, HttpServletRequest request) throws Exception {	
		List<ReceiptDTO> receiptList = rewardService.SelectAccidentInfoList();
		model.addAttribute("receiptList", receiptList);
		return "accident/receiptList";
	}
	
	@RequestMapping(value="/payment", method=RequestMethod.GET)
	public String payment(Model model, HttpServletRequest request) throws Exception {	
		
		accidentID = Integer.parseInt(request.getParameter("no"));
		model.addAttribute("accidentID", accidentID);
		
		List<ReceiptDTO> accidentList = rewardService.SelectAccident(accidentID);
		model.addAttribute("accidentList", accidentList);
		
		return "accident/payment";
	}
	
	@RequestMapping(value = "/checkPrice.do", method = RequestMethod.POST)
	public String doCheckPrice(Model model, HttpServletRequest request) throws Exception {			
		String rewardDate = ((String)request.getParameter("RewardDate"));
		int rewardPrice = Integer.parseInt(request.getParameter("RewardPrice"));
		int rewardCost = rewardService.SelectRewardCost(accidentID);
		
		model.addAttribute("RewardPrice", rewardPrice);
		model.addAttribute("RewardDate", rewardDate);

		if(rewardPrice <= rewardCost) {
			String possibility = "가능";
			model.addAttribute("Possibility", possibility);
		}else {
			String possibility = "불가능";
			model.addAttribute("Possibility", possibility);
		}
		return "/accident/payment";
	}
	
	@RequestMapping(value = "/payment.do", method = RequestMethod.POST)
	public String doPayment(Model model, HttpServletRequest request, Reward reward, Accident accident) throws Exception {
		
		String rewardDate = ((String)request.getParameter("RewardDate"));
		int rewardPrice = Integer.parseInt(request.getParameter("RewardPrice"));
		String possibility = ((String)request.getParameter("Possibility"));
		
		if(possibility.equals("가능")) {
			
			reward.setDate(rewardDate);
			reward.setRewardPrice(rewardPrice);
			
			int rewardID = rewardService.InsertRewardInfo(reward);
			
			accident.setAccidentID(accidentID);
			accident.setRewardID(rewardID);
			
			rewardService.InsertAccidentReward(accident);
			
		}
		return "redirect:/home";

		
	}
}
