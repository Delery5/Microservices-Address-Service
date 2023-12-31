package com.delery.service;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delery.entity.Address;
import com.delery.repository.AddressRepository;
import com.delery.request.CreateAddressRequest;
import com.delery.response.AddressResponse;

@Service
public class AddressService {
	
	static Logger log = LoggerFactory.getLogger(AddressService.class);
	
	@Autowired
	AddressRepository addressRepository;
	

	public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
		
		Address address = new Address();
		address.setStreet(createAddressRequest.getStreet());
		address.setCity(createAddressRequest.getCity());
		addressRepository.save(address);
		return new AddressResponse(address);
	}
	
	public AddressResponse getById(long id) {
		log.info("Inside getById" + id);
		Address address = addressRepository.findById(id).get();
		return new AddressResponse(address);
	}
}
