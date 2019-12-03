package com.innoventes.InnoventesTest.address;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employees/{employeeId}/adress")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public Address addAddress(@RequestBody Address address) {
		addressService.addAddress(address);
		return address;
	}
	@RequestMapping("/")
	public List<Address> getAddresses(){
		return addressService.getAddress();
	}
	@RequestMapping(value="/{addressId}")
	public Address getAddress(@PathVariable Integer addressId) {
		Optional<Address> optional = addressService.getAddress(addressId);	
		return optional.get();
	}
	
	@RequestMapping(value="/{addressId}", method=RequestMethod.PUT)
	public void updateAddress(@PathVariable Integer addressId, @RequestBody Address address) {
		addressService.updateAddress(addressId, address);
	}
	
	@RequestMapping(value="/{addressId}", method =RequestMethod.DELETE)
	public void deleteAddress(@PathVariable Integer addressId) {
		addressService.deleteAddress(addressId);
	}
}
