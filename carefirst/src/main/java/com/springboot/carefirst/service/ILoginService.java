package com.springboot.carefirst.service;

import javax.validation.Valid;

import com.springboot.carefirst.model.Login;

public interface ILoginService {

	Login getLoginDetails(Long loginId);

	long addLogin(@Valid Login login);

	String updateLoginDetails(@Valid Login login);

	String deleteLogin(Long loginId);

	long validateLogin(@Valid Login login);

	String lockUser(String username);

	String unlockUser(Long loginId);

	String checkedLocked(String username);

	String validateUsername(@Valid Login login);

}
