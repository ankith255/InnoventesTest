package com.innoventes.InnoventesTest.employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

	void addEmployee(Employee employee);
	Optional<Employee> getEmployee(Integer employeeId);
	List<Employee> getEmployees();
	void updateEmployee(Integer employeeId, Employee employee);
	void deleteEmployee(Integer employeeId);
	

}
