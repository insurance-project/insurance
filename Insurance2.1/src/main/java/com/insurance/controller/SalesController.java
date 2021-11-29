package com.insurance.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.insurance.model.contract.ContractCount;
import com.insurance.model.insurance.Insurance;
import com.insurance.model.insurance.SalePerform;
import com.insurance.service.ContractService;
import com.insurance.service.InsuranceService;
import com.insurance.service.SalePerformService;

@Controller
@RequestMapping("/design/*")
public class SalesController {
	
	@Autowired
	private ContractService contractService;
	@Autowired
	private InsuranceService insuranceService;
	@Autowired
	private SalePerformService salePerformService;
	
	@RequestMapping(value = "/salesOpen", method = RequestMethod.GET)
	public String salesOpen(Model model) throws Exception {

		List<ContractCount> insuranceContractList = contractService.InsuranceContractList();
		model.addAttribute("insuranceContractList", insuranceContractList);
		
		return "design/salesOpen";
	}
	
	@RequestMapping(value = "/salesPerformOpen", method = RequestMethod.GET)
	public String salesPerformOpen(Model model, HttpServletRequest request, Insurance insurance, SalePerform salePerform) throws Exception {
		int insuranceID = Integer.parseInt(request.getParameter("no"));
		// insurance에 salePerform id 추가
		insurance = insuranceService.SelectInsuranceInfo(insuranceID);
		insurance.setSalePerformID(insuranceID);
		insuranceService.UpdateSalePerfomID(insurance);
		
		int salePerformID = insuranceID;
		System.out.println(salePerformID);
		// 보험 정보 가져오기
		salePerform = salePerformService.SelectInsuranceSaleInfo(salePerformID);
		
		return "design/salesPerformOpen";
	}

}
