package com.springboot.restcrud.reposotery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.restcrud.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> { 
	
	@Query ("select em from  Employee em") 
	List<Employee>  getEmp(); 
}
