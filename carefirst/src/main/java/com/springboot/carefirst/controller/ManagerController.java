package com.springboot.carefirst.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.carefirst.model.Manager;
import com.springboot.carefirst.service.IManagerService;

@RestController
public class ManagerController {

	@Autowired // no need to add confirmations or properties for this class
	IManagerService ManagerService; // reference of Managerservice

	@CrossOrigin
	@GetMapping("/allManager")
	public List<Manager> getAllManagers() {
		System.out.println("Getting all data..");

		return ManagerService.getAll();
	}

	@CrossOrigin
	@GetMapping("/ManagerProfile")
	public Manager seeProfile(@RequestParam @Valid long Managerid) {
		return ManagerService.viewProfileInfo(Managerid);
	}

	@CrossOrigin // transferring from web browser to application
	@PostMapping("/registerManager") // create retrieve update and delete
	public String addUser(@RequestBody @Valid Manager manager) {
		String contact = ManagerService.register(manager);
		return contact;
	}

	@CrossOrigin
	@DeleteMapping("/removeManager")
	public String removeManager(@RequestParam @Valid long managerId) {
		return ManagerService.removeManager(managerId);
	}

	@CrossOrigin
	@PutMapping("/updateManagerProfileInfo")
	public String updateManager(@RequestParam @Valid long manager, @RequestParam @Valid Object[] fields) {
		return ManagerService.updateProfileInfo(manager, fields);
	}

	@CrossOrigin
	@PostMapping("/updateManager")
	public String updateManager(@RequestBody @Valid Manager manager) {
		String response = ManagerService.updateManager(manager);
		return response;
	}

}
