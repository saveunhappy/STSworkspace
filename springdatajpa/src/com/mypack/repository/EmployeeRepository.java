package com.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypack.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	Employee getByLastName(String lastName);
}
