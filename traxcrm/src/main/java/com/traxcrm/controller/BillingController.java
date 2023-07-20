package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.Entity.Billing;
import com.traxcrm.Entity.Contact;

import com.traxcrm.Service.BillingService;
import com.traxcrm.Service.ContactService;



@Controller
public class BillingController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String ViewBillPage(@RequestParam("id") long id,ModelMap model) {
		System.out.println(id);
		Contact contact = contactService.getOneContactById(id);
		model.addAttribute("contact", contact);
		return"create_bill";
	}
	@RequestMapping("/saveBill")
	public String SaveOneBilling(@ModelAttribute("Billing") Billing billing,ModelMap model) {
//		System.out.println(billing);
		billingService.SaveBilling(billing);
		model.addAttribute("billing", billing);
		return"Billing_Info";
	}
	
	@RequestMapping("/getBillingById")
	public String getOneBillingById(@RequestParam("id") long id,ModelMap model) {
		Billing billing = billingService.getOneBillingById(id);//It get data baced on Id
		model.addAttribute("billing", billing);
			return"Billing_Info";
	}
	
	@RequestMapping("/ListBillings")
	public String getAllBillings(ModelMap model) {
		List<Billing> billings = billingService.listAll();
//		System.out.println(billings);
		model.addAttribute("billings", billings);
		return"All_billings_details";
		}
}
