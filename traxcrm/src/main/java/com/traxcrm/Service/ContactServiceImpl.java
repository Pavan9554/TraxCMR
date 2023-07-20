package com.traxcrm.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.Entity.Contact;
import com.traxcrm.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private  ContactRepository contactRepo;
	@Override
	public void saveContact(Contact  contact) {
//		System.out.println(contact);
//		System.out.println("Wellcome");
		contactRepo.save(contact);
		
	}
	@Override
	public List<Contact> listAll() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}
	@Override
	public Contact getOneContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contacts = findById.get();
		return contacts;
	}
	
	
	
	
}
