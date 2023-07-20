package com.traxcrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.traxcrm.dto.Email;
import com.traxcrm.utileforemail.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService  emailservice;
	@PostMapping("/sendemail")
	public String getEmailId(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("email", email);
		return"compose_email";
	}

	@PostMapping("/triggeremail")
	public String triggeremail(Email email,ModelMap model) {
		emailservice.sendSimpleMessage(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("mesg", "Send email");
		return"compose_email";
	}
}
