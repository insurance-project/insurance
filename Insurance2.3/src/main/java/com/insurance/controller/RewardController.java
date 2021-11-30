package com.insurance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/accident/*")
public class RewardController {
	
	@RequestMapping(value="/forReceiptList", method=RequestMethod.GET)
	public String forReceiptList() {		
		return "accident/forReceiptList";
	}
	
	@RequestMapping(value="/contractList", method=RequestMethod.GET)
	public String contractList() {		
		return "accident/contractList";
	}
	
	@RequestMapping(value="/accidentReceipt", method=RequestMethod.GET)
	public String accidentReceipt() {		
		return "accident/accidentReceipt";
	}
	
	@RequestMapping(value="/receiptList", method=RequestMethod.GET)
	public String receiptList() {		
		return "accident/receiptList";
	}
	
	@RequestMapping(value="/payment", method=RequestMethod.GET)
	public String payment() {		
		return "accident/payment";
	}
}
