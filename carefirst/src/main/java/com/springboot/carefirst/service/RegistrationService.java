package com.springboot.carefirst.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.carefirst.model.Registration;

@Service
public class RegistrationService implements IRegistrationService {

	@Override
	@Transactional
	public String addRegistration(@Valid Registration registration) {
		// TODO Auto-generated method stub
		return null;
	}

}
