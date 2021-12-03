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
	
	public static int customerID;
	public static int insuranceID;
	
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
	public String accidentReceipt(Model model, HttpServletRequest request, Contract contract) throws Exception {
		
		insuranceID = Integer.parseInt(request.getParameter("no"));
	
		model.addAttribute("InsuranceName", insuranceID);
		model.addAttribute("CustomerName", customerID);
		
		contract.setCustomerID(customerID);
		contract.setInsuranceID(insuranceID);
		
		int contractID = accidentService.SelectContractID(contract);
		
		List<ContractDTO> contractList = accidentService.SelectContract(contractID); 
		model.addAttribute("contractList", contractList);
		
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
		
		accidentService.InsertAccident(accident);
		
		return "redirect:/home";
	}
}
