package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.Entity.Contact;
import com.traxcrm.Entity.Lead;
import com.traxcrm.Service.ContactService;
import com.traxcrm.Service.LeadService;


@Controller
public class LeadController {

	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/viewleadpage")
	public String ViewLeadPage(){
		return "view_lead_page";
	}
	
	@RequestMapping("/savelead")
	public String SaveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
//		System.out.println(lead);
		leadservice.SaveLead(lead);
		model.addAttribute("lead", lead);
		return"Lead_Info";
	}
	
	 @RequestMapping("/delete")
	    public String DeleteOneLead(@RequestParam("id") long id,ModelMap model) {
	    	leadservice.deleteOneLeadById(id);
	    	List<Lead>leads = leadservice.listAll();
	    	model.addAttribute("leads", leads);
	    	return"Search_Lead";
	    }
	
	@RequestMapping("/convertlead")
	public String ConvertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getOneLeadById(id);//It get data based on Id
		//Here we achive based on lead(reference variable) data would be transfer in 
		//to  contact here contact object would be created and data would be stored 
		//in tocontact object
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setSecondName(lead.getSecondName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setLeadsource(lead.getLeadsource());
		contact.setGender(lead.getGender());
		
//		contactservice.saveContact(contact);
//		System.out.println(contact);
		contactservice.saveContact(contact);
		leadservice.deleteOneLeadById(id);
		
		List<Contact> contacts = contactservice.listAll();
		model.addAttribute("contacts", contacts);
		
		return"All_Contacts_details";
	}
	
	@RequestMapping("/listLeads")
	public String getAllLeads(ModelMap model) {
	List<Lead>leads = leadservice.listAll();
	model.addAttribute("leads", leads);
    return "All_leads_details";
	}
	
	@RequestMapping("/getLeadById")
	public String getOneLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getOneLeadById(id);
//		System.out.println(lead);
		model.addAttribute("lead", lead);
		return"Lead_Info";
	}	
}
