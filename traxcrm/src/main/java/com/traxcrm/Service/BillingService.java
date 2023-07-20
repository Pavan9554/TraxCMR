package com.traxcrm.Service;

import java.util.List;

import com.traxcrm.Entity.Billing;


public interface BillingService {

	public void SaveBilling(Billing billing);

	public Billing getOneBillingById(long id);

	public List<Billing> listAll();

 

}
