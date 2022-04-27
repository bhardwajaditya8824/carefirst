package com.springboot.carefirst.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.carefirst.model.Manager;
import com.springboot.carefirst.repository.ManagerRepository;

@Service
public class ManagerService implements IManagerService{

	@Autowired
	ManagerRepository ManagerRepository;

	public List<Manager> getAll() {
		return ManagerRepository.findAll();
	}

	public String register(Manager manager) {
		try {
			ManagerRepository.save(manager);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Success!";
	}

	public Manager viewProfileInfo(long id) {

		Manager manager = new Manager();
		try {
			Optional<Manager> searchRecord = ManagerRepository.findById(id);
			manager = searchRecord.get();
		} catch (Exception e) {
			manager = null;
			return manager;
		}

		return manager;
	}

	public String updateProfileInfo(long manager, Object[] fieldsToUpd) {
		Optional<Manager> clien = ManagerRepository.findById(manager);
		Manager cli = clien.get();

		try {
			ManagerRepository.save(cli);
		} catch (Exception e) {
			return e.getMessage();
		}
		return ("Successfully saved");
	}

	public String removeManager(long manager) {
		// might need to send Manager to an archive repository + set state to deceased?
		// or add the reason why Manager is being archived
		try {
			ManagerRepository.deleteById(manager);
		} catch (Exception e) {
			return e.getMessage();
		}

		return ("Successfully removed");
	}

	@Override
	public String updateManager(Manager manager) {
		Optional<Manager> searchRecord = ManagerRepository.findById(manager.getManagerId());

		if (searchRecord.isPresent()) {
			try {

				Manager updateManager = searchRecord.get();

				updateManager.setManagerName(manager.getManagerName());
				updateManager.setManagerEmail(manager.getManagerEmail());
				updateManager.setManagerDob(manager.getManagerDob());
				updateManager.setManagerContactNo(manager.getManagerContactNo());
				

				ManagerRepository.save(updateManager);

			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Manager Doesn't Exist";
		}
		return "Manager Updated";
	}

	
}
