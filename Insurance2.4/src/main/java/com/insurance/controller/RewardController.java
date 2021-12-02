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
	
	// 임시
	static int rewardCost = 400;
	
	@Autowired
	private RewardService rewardService;
	
	@Autowired
	private AccidentService accidentService;

	@RequestMapping(value="/receiptList", method=RequestMethod.GET)
	public String receiptList(Model model, HttpServletRequest request) throws Exception {	
		List<ReceiptDTO> receiptList = rewardService.SelectAccidentInfoList();
		model.addAttribute("receiptList", receiptList);
		return "accident/receiptList";
	}
	
	@RequestMapping(value="/payment", method=RequestMethod.GET)
	public String payment(Model model, HttpServletRequest request) throws Exception {	
		
		int accidentID = Integer.parseInt(request.getParameter("no"));
		model.addAttribute("accidentID", accidentID);
		
		ContractDTO contractDTO = new ContractDTO();
		contractDTO.setCustomerID(AccidentController.customerID);
		contractDTO.setInsuranceID(AccidentController.insuranceID);
		
		int contractID = accidentService.SelectContractID(contractDTO);
		contractDTO.setContractID(contractID);
		
		String insuranceName = accidentService.SelectInsurance(contractDTO);
		model.addAttribute("InsuranceName", insuranceName);
		
		String customerName = accidentService.SelectCustomer(contractDTO);
		model.addAttribute("CustomerName", customerName);
		return "accident/payment";
	}
	
	@RequestMapping(value = "/checkPrice.do", method = RequestMethod.POST)
	public String doCheckPrice(Model model, HttpServletRequest request) throws Exception {	
//		int accidentID = Integer.parseInt(request.getParameter("AccidentID"));
//		// 임시로 static 씀
//		int payCheck = Integer.parseInt(request.getParameter("PayCheck"));
//		
//		if(payCheck < rewardCost) {
//			String possibility = "가능";
//			model.addAttribute("Possibility", possibility);
//		}else {
//			String possibility = "불가능";
//			model.addAttribute("Possibility", possibility);
//		}
		return "redirect:/home";
	}
	
	@RequestMapping(value = "/payment.do", method = RequestMethod.POST)
	public String doPayment(Model model, HttpServletRequest request, Reward reward) throws Exception {
		
		String rewardDate = ((String)request.getParameter("RewardDate"));
		int payCheck = Integer.parseInt("PayCheck");
		int accidentID = Integer.parseInt("AccidentID");
		
		reward.setDate(rewardDate);
		reward.setRewardPrice(payCheck);
		reward.setCustomerID(accidentID);
		
		rewardService.InsertRewardInfo(reward);
		
		return "redirect:/home";
	}
}
