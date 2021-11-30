package com.insurance.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.insurance.dto.ContractDTO;
import com.insurance.service.ContractService;

@Controller
@RequestMapping("/design/*")
public class SalesController {
	
	@Autowired
	private ContractService contractService;
	
	@RequestMapping(value = "/salesOpen", method = RequestMethod.GET)
	public String salesOpen(Model model) throws Exception {

		List<ContractDTO> insuranceContractList = contractService.InsuranceContractList();
		model.addAttribute("insuranceContractList", insuranceContractList);
		
		return "design/salesOpen";
	}
	

}
