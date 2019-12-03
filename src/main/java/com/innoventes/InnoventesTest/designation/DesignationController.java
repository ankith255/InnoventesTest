package com.innoventes.InnoventesTest.designation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employees/designations")
public class DesignationController {

	@Autowired
	private DesignationService designationService;
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public Designation addEmployee(@RequestBody Designation designation) {
		System.out.println("posted"+ designation);
		designationService.addDesignation(designation);
		return designation;
	}
	@RequestMapping("/")
	public List<Designation> getDesignations(){
		return designationService.getDesignations();
	}
	@RequestMapping(value="/{designationId}")
	public Designation getEmployee(@PathVariable Integer designationId) {
		Optional<Designation> optional = designationService.getDesignation(designationId);	
		return optional.get();
	}
	
	@RequestMapping(value="/{designationId}", method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable Integer designationId, @RequestBody Designation designation) {
		designationService.updateDesignation(designationId, designation);
	}
	
	@RequestMapping(value="/{designationId}", method =RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable Integer designationId) {
		designationService.deleteDesignation(designationId);
	}
}
