package com.traxcrm.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.Entity.Billing;

import com.traxcrm.Repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void SaveBilling(Billing billing) {
		billingRepo.save(billing);
		
	}

	@Override
	public Billing getOneBillingById(long id) {
		Optional<Billing> findById = billingRepo.findById(id);
		Billing billing = findById.get();
		return billing;
	}

	@Override
	public List<Billing> listAll() {
		List<Billing> billings = billingRepo.findAll();
		return billings;
	}

	

}
