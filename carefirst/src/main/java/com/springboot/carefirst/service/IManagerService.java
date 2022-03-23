package com.springboot.carefirst.service;

import java.util.List;

import javax.validation.Valid;

import com.springboot.carefirst.model.Manager;

public interface IManagerService {

	List<Manager> getAll();

	Manager viewProfileInfo(@Valid long managerid);

	String register(@Valid Manager manager);

	String removeManager(@Valid long manager);

	String updateProfileInfo(@Valid long manager, @Valid Object[] fields);

	String updateManager(@Valid Manager manager);

}
