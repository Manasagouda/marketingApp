package com.marketingapp.services;

import java.util.List;

import com.marketingapp.entities.Lead;

public interface LeadService {

	public void saveLeadInfo(Lead lead);

	public List<Lead> listAllLeads();

	public void deleteLead(long id);

	public Lead updateOneLead(long id);
}
