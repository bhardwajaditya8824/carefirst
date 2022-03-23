package com.springboot.carefirst.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.carefirst.model.Registration;
import com.springboot.carefirst.service.IRegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	IRegistrationService registrationService;

	@CrossOrigin
	@PostMapping("/addRegistration")
	public String addRegistration(@RequestBody @Valid Registration registration) {
		String response = registrationService.addRegistration(registration);

		return response;
	}

}
