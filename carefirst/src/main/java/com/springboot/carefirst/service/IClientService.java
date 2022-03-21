package com.springboot.carefirst.service;

import java.util.List;

import javax.validation.Valid;

import com.springboot.carefirst.model.Client;



public interface IClientService {

	List<Client> getAll();

	Client viewProfileInfo(@Valid long clientid);

	String register(@Valid Client client);

	String removeClient(@Valid long client);

	String updateProfileInfo(@Valid long client, @Valid Object[] fields);

	String updateClient(@Valid Client client);

}
