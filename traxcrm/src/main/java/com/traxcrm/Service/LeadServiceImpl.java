package com.traxcrm.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.Entity.Lead;
import com.traxcrm.Repository.LeadRopository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRopository leadRepo;
	
	@Override
	public void SaveLead(Lead lead) {
		leadRepo.save(lead);
	}
	
	@Override
	public Lead getOneLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public List<Lead> listAll() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteOneLeadById(long id) {
		leadRepo.deleteById(id);
		
	}
}
