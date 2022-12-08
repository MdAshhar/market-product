package com.searchLead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchLead.DTO.Lead;


@Controller
public class SearchLeadController {
	
	@Autowired
	RestClient restClient;
	
	//localhost:9090/viewSearch
	@RequestMapping("/viewSearch")
	public String viewSearchLeadPage() {
		return "search";
	}
	@RequestMapping("/searchById")
	public String searchById(@RequestParam("id")long id, Model model) {
		Lead lead = restClient.getLeadInfo(id);
		model.addAttribute("lead",lead);
		return"lead_info";
	}
}
