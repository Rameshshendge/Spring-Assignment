package com.mavenspring.rest03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mavenspring.rest03.entities.Address;
import com.mavenspring.rest03.services.ZipInfoService;

@RestController
public class AddressController {
	@Autowired
	private ZipInfoService zipInfoService;
	
	@GetMapping("/zipinfo")
	public List<Address> getAddress()
	{
		return this.zipInfoService.getAddress();
	}
	@GetMapping("/zipinfo/{zipCode}")
	public Address getAddressById(@PathVariable String zipCode)
	{
		return this.zipInfoService.getAddressById(Integer.parseInt(zipCode));
	}
}
