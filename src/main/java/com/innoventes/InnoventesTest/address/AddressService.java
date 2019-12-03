package com.innoventes.InnoventesTest.address;

import java.util.List;
import java.util.Optional;

public interface AddressService {

	void addAddress(Address address);
	Optional<Address> getAddress(Integer addressId);
	List<Address> getAddress();
	void updateAddress(Integer addressId, Address address);
	void deleteAddress(Integer addressId);
}
