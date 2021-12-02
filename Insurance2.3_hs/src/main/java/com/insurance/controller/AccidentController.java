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
public class AccidentController {
	
	public static int customerID = 0;
	public static int insuranceID = 0;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AccidentService accidentService;
	
	@RequestMapping(value = "/forReceiptList", method = RequestMethod.GET)
    public String insuranceContract(Model model) throws Exception {
        List<Customer> forReceiptList = customerService.CustomerList(); 
        model.addAttribute("forReceiptList", forReceiptList); 
        return "accident/forReceiptList"; 
    }
	
	@RequestMapping(value="/contractList", method=RequestMethod.GET)
	public String contractList(Locale locale, Model model, HttpServletRequest request, Contract contract) throws Exception {	
		customerID = Integer.parseInt(request.getParameter("no"));
		
		List<Insurance> contractList  = accidentService.SelectContractInsuranceList(customerID);
		model.addAttribute("contractList", contractList);	
		
		return "accident/contractList";
	}
	
	@RequestMapping(value="/accidentReceipt", method=RequestMethod.GET)
	public String accidentReceipt(Model model, HttpServletRequest request) throws Exception {
		
		insuranceID = Integer.parseInt(request.getParameter("no"));
		model.addAttribute("insuranceID", insuranceID);
		
		ContractDTO contractDTO = new ContractDTO();
		contractDTO.setCustomerID(customerID);
		contractDTO.setInsuranceID(insuranceID);
		
		int contractID = accidentService.SelectContractID(contractDTO);
		contractDTO.setContractID(contractID);
		
		String insuranceName = accidentService.SelectInsurance(contractDTO);
		model.addAttribute("InsuranceName", insuranceName);
		
		String customerName = accidentService.SelectCustomer(contractDTO);
		model.addAttribute("CustomerName", customerName);
		
		return "accident/accidentReceipt";
	}
	
	@RequestMapping(value="/receipt.do", method=RequestMethod.POST)
	public String doAccidentReceipt(Model model, HttpServletRequest request, Accident accident) throws Exception {	
		
		String kind = ((String)request.getParameter("AccidentKind"));
		String date = ((String)request.getParameter("AccidentDate"));
		int damagePrice = Integer.parseInt(request.getParameter("DamagePrice"));
		boolean contingency = request.getParameter("Contingency") != null;
		
		accident.setAccidentKind(kind);
		accident.setAccidentDate(date);
		accident.setDamagePrice(damagePrice);
		accident.setContingency(contingency);
		accident.setCustomerID(customerID);
		
		accidentService.InsertCustomerToAccident(accident);
		
		return "redirect:/home";
	}
}
