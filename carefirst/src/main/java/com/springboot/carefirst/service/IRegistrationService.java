package com.springboot.carefirst.service;

import javax.validation.Valid;

import com.springboot.carefirst.model.Registration;

public interface IRegistrationService {

	String addRegistration(@Valid Registration registration);

}
