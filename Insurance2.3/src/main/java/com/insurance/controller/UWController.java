package com.insurance.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/uw/*")
public class UWController {
	
	@RequestMapping(value = "/referenceList", method = RequestMethod.GET)
    public String referenceList(Model model) throws Exception {
        return "uw/referenceList"; 
    }
	
	@RequestMapping(value = "/standardSetting", method = RequestMethod.GET)
    public String standardSetting(Model model) throws Exception {
        return "uw/standardSetting"; 
    }
	
	@RequestMapping(value = "/judgeList", method = RequestMethod.GET)
    public String judgeList(Model model) throws Exception {
        return "uw/judgeList"; 
    }
	
	@RequestMapping(value = "/contractJudge", method = RequestMethod.GET)
    public String contractJudge(Model model) throws Exception {
        return "uw/contractJudge"; 
    }
	
}
