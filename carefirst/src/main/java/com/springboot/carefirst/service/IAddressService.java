package com.springboot.carefirst.service;

import java.util.List;

import javax.validation.Valid;

import com.springboot.carefirst.model.Address;

public interface IAddressService {

	List<Address> getAll();

	String addAddress(@Valid Address address);

	String updateAddress(@Valid Address address);

	String deleteAddress(Long addressID);

}
