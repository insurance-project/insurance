package com.insurance.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.insurance.dto.ContractDTO;
import com.insurance.model.contract.Contract;
import com.insurance.model.customer.Customer;
import com.insurance.model.insurance.Insurance;
import com.insurance.service.ContractService;
import com.insurance.service.CustomerService;
import com.insurance.service.InsuranceService;

@Controller
@RequestMapping("/sales/*")
public class ContractController {
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private InsuranceService insuranceService;
	@Autowired
	private ContractService contractService;
	

	@RequestMapping(value = "/insuranceContract", method = RequestMethod.GET)
    public String insuranceContract(Model model) throws Exception {
        List<Customer> customerList = customerService.CustomerList(); 
        model.addAttribute("customerList", customerList); 
        return "sales/insuranceContract"; 
    }
	
	@RequestMapping(value = "/joinInsurance", method = RequestMethod.GET)
	public String joinInsurance(Locale locale, Model model, HttpServletRequest request, Contract contract) throws Exception {
		
		int customerID = Integer.parseInt(request.getParameter("no"));
		model.addAttribute("customerID", customerID);
		contract.setCustomerID(customerID);
		List<Insurance> insuranceList = insuranceService.SelectInsuranceStandardList();
		model.addAttribute("insuranceList", insuranceList);
				
		return "sales/joinInsurance";
	}
	
	@RequestMapping(value = "/joinInsurance.do", method = RequestMethod.POST)
	public String doJoinInsurance(Model model, HttpServletRequest request, Contract contract) throws Exception {
		
		int customerID = Integer.parseInt(request.getParameter("CustomerID"));
		contract.setCustomerID(customerID);
		
		int insuranceID = Integer.parseInt(request.getParameter("Join"));
		contract.setInsuranceID(insuranceID);
		
		contractService.InsertContractInfo(contract);
		 
		return "redirect:/home";
	}
	
	@RequestMapping(value = "/customerInfoOpen", method = RequestMethod.GET)
	public String customerInfoOpen(Model model) throws Exception {
		List<ContractDTO> customerContractList = contractService.CustomerContractList();
		model.addAttribute("customerContractList", customerContractList);
		
		return "sales/customerInfoOpen";
	}
	

}
