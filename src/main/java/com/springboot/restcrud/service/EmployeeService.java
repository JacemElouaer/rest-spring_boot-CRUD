package com.springboot.restcrud.service;

import java.util.List;
import java.util.Optional;

import com.springboot.restcrud.model.Employee;

public interface EmployeeService { 

	Employee saveEmployee(Employee employee); 
	List<Employee> getallEmployee ();  
	Employee getEmployeebyid(Long id);  
	Employee updateEmlpoyee(Long id);  
	Optional<Employee> getE(Long id);  
	Void deleteE(Long id);  
	Void updateE(Employee employee);   
	Employee updateEmployee (Employee employee , Long id);  
	List<Employee>  getEmp();  
	void deleteEmployee(Long id );  


	

}
