package com.searchLead.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.searchLead.DTO.Lead;

@Component
public class RestClient {
	
	public Lead getLeadInfo(long id) {
		RestTemplate restTemplate=new RestTemplate();
		Lead lead = restTemplate.getForObject("http://localhost:8080/api/leads/lead/"+id, Lead.class);
		return lead;
	}
}
