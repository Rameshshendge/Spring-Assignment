package com.mavenspring.rest03.services;

import java.util.List;

import com.mavenspring.rest03.entities.Address;

public interface ZipInfoService {
	
	public List<Address> getAddress();
	public Address getAddressById(int zipCode);
}
