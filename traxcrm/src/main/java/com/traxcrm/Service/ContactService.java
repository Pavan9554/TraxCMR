package com.traxcrm.Service;

import java.util.List;

import com.traxcrm.Entity.Contact;


public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> listAll();

	public Contact getOneContactById(long id);



	
	
	
}
