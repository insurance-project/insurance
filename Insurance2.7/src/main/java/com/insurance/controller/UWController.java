package com.insurance.controller;


import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.insurance.dto.AllowStandardDTO;
import com.insurance.dto.ContractDTO;
import com.insurance.model.contract.Contract;
import com.insurance.model.customer.Customer;
import com.insurance.model.insurance.AllowStandard;
import com.insurance.model.insurance.Insurance;
import com.insurance.service.AllowStandardService;
import com.insurance.service.ContractService;
import com.insurance.service.CustomerService;
import com.insurance.service.InsuranceService;


@Controller
@RequestMapping("/uw/*")
public class UWController {
   
   @Autowired
   private AllowStandardService allowStandardService;
   @Autowired
   private CustomerService customerService;
   @Autowired
   private ContractService contractService;
   @Autowired
   private InsuranceService insuranceService;
   
   public static int Result = 0;
   
   @RequestMapping(value = "/referenceList", method = RequestMethod.GET)
    public String referenceList(Model model) throws Exception {
      List<AllowStandardDTO> allowStandardList = allowStandardService.NonAllowStandardInsuranceList(); 
      model.addAttribute("referenceList", allowStandardList);      
        return "uw/referenceList"; 
    }
      
   @RequestMapping(value = "/standardSetting", method = RequestMethod.GET)
   public String allowStandard(Locale locale,HttpServletRequest request,Model model) throws Exception {      
      int insuranceID = Integer.parseInt(request.getParameter("no"));      
      model.addAttribute("AllowStandardID", insuranceID);      
      return "uw/standardSetting";
   }   
   
   @RequestMapping(value = "/standardSetting.do", method = RequestMethod.POST)
   public String addAllowStandard(Model model, HttpServletRequest request,AllowStandard allowStandard, Insurance insurance) throws Exception {      
      int allowStandardID = Integer.parseInt(request.getParameter("AllowStandardID"));
      int MinAge = Integer.parseInt(request.getParameter("CustomerMinAge"));
      int MaxAge = Integer.parseInt(request.getParameter("CustomerMaxAge"));   
      int Gender = Integer.parseInt(request.getParameter("CustomerGender"));    
      allowStandard.setAllowStandardID(allowStandardID);
      allowStandard.setCustomerMinAge(MinAge);
      allowStandard.setCustomerMaxAge(MaxAge);
      allowStandard.setCustomerGender(Gender);   
      allowStandardService.InsertAllowStandard(allowStandard);   
      
      int insuranceID = allowStandardID;
      insurance.setAllowStandardID(allowStandardID);
      insurance.setInsuranceID(insuranceID);
      insuranceService.UpdateAllowStandard(insurance);
      
      return "redirect:/home";
   }
   
   @RequestMapping(value = "/judgeList", method = RequestMethod.GET)
    public String judgeList(Model model) throws Exception {
      List<ContractDTO> customerList = contractService.NonJudgeCustomerList();
      model.addAttribute("judgeList",customerList);
        return "uw/judgeList"; 
    }
   
   @RequestMapping(value = "/contractJudge", method = RequestMethod.GET)
   public String contractJudge(Model model, HttpServletRequest request,Customer customer,AllowStandard allowStandard) throws Exception {   
      int insNo = Integer.parseInt(request.getParameter("insNo"));
      int cusNo = Integer.parseInt(request.getParameter("cusNo"));
      int conNo = Integer.parseInt(request.getParameter("conNo"));
      model.addAttribute("insuranceID2",insNo);
      model.addAttribute("customerID2",cusNo);      
      model.addAttribute("contractID2",conNo);      
      
      customer = customerService.SelectCustomerInfo(cusNo);      
      model.addAttribute("CustomerName",customer.getCustomerName());
      model.addAttribute("CustomerAge",customer.getCustomerAge());
      model.addAttribute("CustomerGender",customer.getCustomerGender());      
      
      allowStandard = allowStandardService.SelectAllowStandardInfo(insNo);
      model.addAttribute("CustomerMinAge",allowStandard.getCustomerMinAge());
      model.addAttribute("CustomerMaxAge",allowStandard.getCustomerMaxAge());
      model.addAttribute("JoinGender",allowStandard.getCustomerGender());
      return "uw/contractJudge";
   }
      
   @RequestMapping(value = "/judgeCheck.do", method = RequestMethod.POST)
   public String contractJudge(Model model, HttpServletRequest request,AllowStandard allowStandard,Customer customer,Contract contract) throws Exception {   
      int allowStandardID = Integer.parseInt(request.getParameter("insuranceID2"));
      allowStandard = allowStandardService.SelectAllowStandardInfo(allowStandardID);
      int customerID = Integer.parseInt(request.getParameter("customerID2"));
      customer = customerService.SelectCustomerInfo(customerID);
      
      model.addAttribute("CustomerName",customer.getCustomerName());
      model.addAttribute("CustomerAge",customer.getCustomerAge());
      model.addAttribute("CustomerGender",customer.getCustomerGender());      
      
      int contraID = Integer.parseInt(request.getParameter("contractID2"));
      contract.setContractID(contraID);
      
      if(customer.getCustomerAge()<=allowStandard.getCustomerMaxAge()&&
            customer.getCustomerAge()>=allowStandard.getCustomerMinAge()) {
         if(allowStandard.getCustomerGender()==3){               
            contract.setJudge(1);   
            Result = 1;
            model.addAttribute("result",Result);
            contractService.SetContractJudge(contract);                  
            return "uw/contractJudgeResult";
         }
         else {
            if(customer.getCustomerGender().equals("Men")&&allowStandard.getCustomerGender()==1) {
               contract.setJudge(1);   
               Result = 1;
               model.addAttribute("result",Result);
               contractService.SetContractJudge(contract);                  
               return "uw/contractJudgeResult";
            }
            else if(customer.getCustomerGender().equals("Women")&&allowStandard.getCustomerGender()==2) {
               contract.setJudge(1);   
               Result = 1;
               model.addAttribute("result",Result);
               contractService.SetContractJudge(contract);               
               return "uw/contractJudgeResult";
            }
            else {
               contract.setJudge(2);   
               Result = 3;
               model.addAttribute("result",Result);
               contractService.SetContractJudge(contract);                  
               return "uw/contractJudgeResult";
            }
         }         
      }   
      contract.setJudge(2);      
      Result = 2;
      model.addAttribute("result",Result);
      contractService.SetContractJudge(contract);         
      return "uw/contractJudgeResult";
   }
}