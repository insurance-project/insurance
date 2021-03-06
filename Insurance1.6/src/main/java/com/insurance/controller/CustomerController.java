package com.insurance.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.insurance.model.customer.Customer;
import com.insurance.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/customerInfo", method = RequestMethod.GET)
	public String customerInfo(Locale locale, Model model) throws Exception {
				
		return "customerInfo";
	}
	
	@RequestMapping(value = "/customerInfo.do", method = RequestMethod.POST)
	public String doCustomerInfo(Model model, HttpServletRequest request, Customer customer) throws Exception {
		int age = Integer.parseInt(request.getParameter("Age"));
		String job = ((String) request.getParameter("Job"));
		String name = ((String) request.getParameter("CustomerName"));
		String gender = ((String) request.getParameter("Gender"));
		String number = ((String) request.getParameter("PhoneNum"));
		String residentNumber = ((String) request.getParameter("ResidentNum"));
		
		customer.setCustomerAge(age);
		customer.setCustomerJob(job);
		customer.setCustomerName(name);
		customer.setCustomerGender(gender);
		customer.setPhoneNumber(number);
		customer.setResidentNumber(residentNumber);
		
		customerService.InsertCustomer(customer);
		
		return "home";
	}
	
	@RequestMapping(value = "/insuranceContract", method = RequestMethod.GET)
    public String insuranceContract(Model model) throws Exception {
        List<Customer> customerList = customerService.CustomerList(); 
        model.addAttribute("customerList", customerList); 
        return "insuranceContract"; 
    }
	
	@RequestMapping(value = "/joinInsurance", method = RequestMethod.GET)
	public String joinInsurance(Locale locale, Model model) throws Exception {
				
		return "joinInsurance";
	}
	
	@RequestMapping(value = "/customerInfoOpen", method = RequestMethod.GET)
	public String customerInfoOpen(Locale locale, Model model) throws Exception {
				
		return "customerInfoOpen";
	}
	

}
