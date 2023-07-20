package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.Entity.Contact;

import com.traxcrm.Service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
    private ContactService contactService;
	
	@RequestMapping("/ListContacts")
	public String getAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("contacts", contacts);
		return"All_Contacts_details";
		}
	@RequestMapping("/getContactById")
	public String getOneContactById(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.getOneContactById(id);
		model.addAttribute("contact", contact);
		return"Contact_Info";
	}
}
