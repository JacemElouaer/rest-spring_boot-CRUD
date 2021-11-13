package com.springboot.restcrud.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.restcrud.model.Employee;
import com.springboot.restcrud.reposotery.EmployeeRepo;
import com.springboot.restcrud.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo  employeerepo ; 
	
	public EmployeeServiceImpl(EmployeeRepo employeerepo) {
		super();
		this.employeerepo = employeerepo;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeerepo.save(employee);
	}


	@Override
	public List<Employee> getallEmployee() {
		return employeerepo.findAll();   
	}


	@Override
	public Employee getEmployeebyid(Long id) {
	/*	Optional<Employee> em =  employeerepo.findById(id);  
		if(em.isPresent()) { 
			return  em.get();	 
		}
		else {
			return null; 
		}*/ 
	return employeerepo.findById(id).orElseThrow(()-> null);   
 		 
	}


	@Override
	public Employee updateEmlpoyee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	public Optional<Employee> getE(Long id) {
		//return  employeerepo.findById(id).orElseThrow(()-> null); 
		Optional<Employee>  em = employeerepo.findById(id); 
		if(em==null) {
			return null; 
		}
		else {
			return em; 
		}
		
	}

	@Override
	public Void deleteE(Long id) {
			 employeerepo.deleteById(id);  
		return null;
	} 
	
	public Void updateE(Employee em) {  
		employeerepo.save(em) ; 
	return null; 
}


	@Override
	public List<Employee> getEmp() {
		return employeerepo.getEmp();  	
		
	}


	@Override
	public Employee updateEmployee(Employee employee, Long id) {
		Employee existingEmployee =  employeerepo.getById(id);
		
		existingEmployee.setEmail(employee.getEmail()); 
		existingEmployee.setFirstname(employee.getFirstname()); 
		existingEmployee.setLastname(employee.getLastname()); 
		employeerepo.save(existingEmployee);  
		return (existingEmployee);  
	}


	@Override
	public void deleteEmployee(Long id) { 
		if (employeerepo.existsById(id)) {
			employeerepo.deleteById(id); 			
		}
		
	} 
 



	


	/*public Employee updateEmlpoyee(Long id) { 
		return ;
	}*/ 
	
 
	
}
