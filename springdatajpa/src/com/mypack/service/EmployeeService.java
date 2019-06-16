package com.mypack.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.domain.Employee;
import com.mypack.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Transactional(readOnly=true)
	public Employee getByLastName(String lastName) {
		return employeeRepository.getByLastName(lastName);
	}
	@Transactional
	public void delete(Integer id) {
		employeeRepository.delete(id);
	}
	
	
	@Transactional(readOnly=true)
	public Employee get(Integer id) {
		return employeeRepository.findOne(id);
	}
	
	
	public void save(Employee employee) {
		//设置创建时间
		if(employee.getId() == null) {
			
			employee.setCreateTime(new Date());
		}
		employeeRepository.saveAndFlush(employee);
	}
	
	@Transactional(readOnly=true)
	public Page<Employee> getPage(int pageNo,int pageSize){
		
		PageRequest pageable = new PageRequest(pageNo - 1, 5);
			
		return employeeRepository.findAll(pageable);
	}
	
	
}
