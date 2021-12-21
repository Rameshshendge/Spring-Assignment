package com.mavenspring.rest03.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mavenspring.rest03.entities.Address;

@Service
public class ZipInfoServiceImpl implements ZipInfoService {
	
	List<Address> list;
	
	public ZipInfoServiceImpl() {
		list=new ArrayList<Address>();
		list.add(new Address(85055,"Phoenix","AZ","US"));
		list.add(new Address(80239,"Denver","CO","US"));
		
	}

	@Override
	public List<Address> getAddress() {
		
		return list;
	}

	@Override
	public Address getAddressById(int zipCode) {
		
		Address a=null;
		for(Address address:list)
		{
			if(address.getZipCode()==zipCode)
			{
				a=address;
				break;
			}
		}
		return a;
	}
}
