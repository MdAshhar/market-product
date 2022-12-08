package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.DTO.LeadData;
import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;
import com.marketingapp.util.EmailService;
import com.marketingapp.util.EmailServiceImpl;

@Controller
public class LeadController {
	@Autowired
	private EmailService emailservice ;
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewLeadPage")
	public String viewcreateLeadPage() {
		return "create_lead";
	}
//	first approach
	@RequestMapping(value="/savelead",method = RequestMethod.POST)
	public String savelead(@ModelAttribute("lead") Lead l, ModelMap model) {
		leadService.saveOneLead(l);
	
		emailservice.sendSimpleMail(l.getEmail(),"Test" , "Test Email");
		model.addAttribute("msg", "Lead is saved");
		return "create_lead";
	}
	
//	second approach
//	@RequestMapping("/savelead")
//	public String savelead(@RequestParam("firstName")String fname,@RequestParam("lastName")String lname,@RequestParam("email")String email,@RequestParam("mobiles")String mobiles) {
//		Lead l=new Lead();
//		l.setFirstName(fname);
//		l.setlastName(lname);
//		l.setEmail(email);
//		l.setMobiles(mobiles);
//		leadService.saveOneLead(l);
//		return "create_lead";
//	}
	
//	third approach
//	@RequestMapping(value="/savelead",method = RequestMethod.POST)
//	public String savelead(LeadData a) {
//		Lead l=new Lead();
//		l.setFirstName(a.getFirstName());
//		l.setlastName(a.getLastName());
//		l.setEmail(a.getEmail());
//		l.setMobiles(a.getMobiles());
//		
//		leadService.saveOneLead(l);
//		return "create_lead";
//	}
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listAllLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	@RequestMapping("/deletelead")
	public String deleteOneLead(@RequestParam("id")long id, ModelMap model) {
		
		leadService.deleteOneLead(id);
		List<Lead> leads = leadService.listAllLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	@RequestMapping("/updatelead")
	public String updateLead(@RequestParam("id")long id, Model model) {
		Lead lead = leadService.getById(id);
		model.addAttribute("lead",lead);
		return"update_lead";
	}
	@RequestMapping(value="/updateOneLead",method = RequestMethod.POST)
	public String updateOneLead(@ModelAttribute("lead") Lead l, ModelMap model) {
		leadService.saveOneLead(l);
		List<Lead> leads = leadService.listAllLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	
}
