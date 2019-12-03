package com.innoventes.InnoventesTest.address;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public void addAddress(Address address) {
		addressRepository.save(address);
	}

	@Override
	public Optional<Address> getAddress(Integer addressId) {
		return addressRepository.findById(addressId);
	}

	@Override
	public List<Address> getAddress() {
		return (List<Address>) addressRepository.findAll();
	}

	@Override
	public void updateAddress(Integer addressId, Address address) {
		addressRepository.save(address);

	}

	@Override
	public void deleteAddress(Integer addressId) {
		addressRepository.deleteById(addressId);
	}

}
