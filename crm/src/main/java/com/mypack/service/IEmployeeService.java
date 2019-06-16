package com.mypack.service;

import java.util.List;

import com.mypack.domain.Employee;
import com.mypack.query.PageResult;
import com.mypack.query.QueryObject;

public interface IEmployeeService {
	int save(Employee emp);
	int update(Employee emp);
	int delete(Long id);
	Employee get(Long id);
	List<Employee> selectAll();
	PageResult selectByCondition(QueryObject qo);
}
