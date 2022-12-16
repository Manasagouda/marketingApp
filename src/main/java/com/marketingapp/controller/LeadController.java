package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;
import com.marketingapp.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		return "create_lead";
	}

	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("l")Lead lead,Model model) {
		leadService.saveLeadInfo(lead);
		emailService.sendEmail(lead.getEmail(), "welcome", "test from spring");
		model.addAttribute("msg", "recorded");
		return "create_lead";
	}
	@RequestMapping("/listAll")
	public String listAllLeads(Model model) {
		List<Lead> leads = leadService.listAllLeads();
		model.addAttribute("leads", leads);
		return "listLeads";
		
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id")long id,Model model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.listAllLeads();
		model.addAttribute("leads", leads);
		return "listLeads";
	}
	@RequestMapping("/update")
	public String updateLeadInfo(@RequestParam("id")long id,Model model) {
		Lead lead = leadService.updateOneLead(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}
	@RequestMapping("/updateLead")
	public String updateLead(LeadData leadData, Model model) {
		Lead lead= new Lead();
		lead.setId(leadData.getId());
		lead.setFirstName(leadData.getFirstName());
		lead.setLastName(leadData.getEmail());
		lead.setMobile(leadData.getMobile());
		leadService.saveLeadInfo(lead);
		List<Lead> leads = leadService.listAllLeads();
		model.addAttribute("leads", leads);
		return "listLeads";
	
		
	}
	
}
