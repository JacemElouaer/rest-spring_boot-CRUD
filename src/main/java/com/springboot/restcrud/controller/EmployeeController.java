package com.springboot.restcrud.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restcrud.model.Employee;
import com.springboot.restcrud.service.EmployeeService;

@RestController 
@RequestMapping("/api/employees")
public class EmployeeController { 
	private EmployeeService employeeservice;

	public EmployeeController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}  
	//buils crate api rest API 
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return  new ResponseEntity<Employee>(employeeservice.saveEmployee(employee), HttpStatus.CREATED);  
	}
	//build all employees rest api
	
	@GetMapping() 
	public List<Employee> getallEmployees(){ 
		return employeeservice.getallEmployee(); 
	} 
	@GetMapping("{id}")
	public ResponseEntity<Employee>  getEmployeeById(@PathVariable("id") Long emplid){
		return  new ResponseEntity<Employee>(employeeservice.getEmployeebyid(emplid), HttpStatus.OK);
	}  
	
	@DeleteMapping("{id}") 
	public String deleteE(@PathVariable("id") Long id) { 
		employeeservice.deleteE(id); 
		return  "deleted successefuly"; 
	} 
	@PutMapping() 
	public ResponseEntity<Employee> updateE(@RequestBody Employee employee){
		return  new ResponseEntity<Employee>(employeeservice.saveEmployee(employee), HttpStatus.CREATED);  
	}	
	@GetMapping("/all") 
	public List<Employee> getAllEmp() 
	{
		return employeeservice.getEmp();
		
	} 
	@PutMapping("{id}") 
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id  ,@RequestBody Employee empl){ 
		return  new ResponseEntity<Employee>(employeeservice.updateEmployee(empl, id) ,HttpStatus.OK);    
	} 
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id){  
		employeeservice.deleteEmployee(id);
		return  new ResponseEntity<String>("employee has been deleted", HttpStatus.OK); 
		
	}
}	
	