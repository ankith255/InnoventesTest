package com.innoventes.InnoventesTest.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> getEmployee(Integer employeeId) {
		return employeeRepository.findById(employeeId);
	}

	@Override
	public List<Employee> getEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void updateEmployee(Integer employeeId, Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
