package com.innoventes.InnoventesTest.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employees")
public class EmployeeController {
	

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("posted"+ employee);
		employeeService.addEmployee(employee);
		return employee;
	}
	@RequestMapping("/")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	@RequestMapping(value="/{employeeId}")
	public Employee getEmployee(@PathVariable Integer employeeId) {
		Optional<Employee> optional = employeeService.getEmployee(employeeId);	
		return optional.get();
	}
	
	@RequestMapping(value="/{employeeId}", method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable Integer employeeId, @RequestBody Employee employee) {
		employeeService.updateEmployee(employeeId, employee);
	}
	
	@RequestMapping(value="/{employeeId}", method =RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
}
