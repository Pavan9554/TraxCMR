package com.traxcrm.Service;

import java.util.List;

import com.traxcrm.Entity.Lead;

public interface LeadService {

	public void SaveLead(Lead lead);
	
	public Lead getOneLeadById(long id);

	public List<Lead> listAll();

	public void deleteOneLeadById(long id);
	
}
