package com.mypack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.domain.Employee;
import com.mypack.mapper.EmployeeMapper;
import com.mypack.query.PageResult;
import com.mypack.query.QueryObject;
import com.mypack.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeMapper dao;
	public int save(Employee emp) {
		return dao.insert(emp);
	}

	public int update(Employee emp) {
		return dao.updateByPrimaryKey(emp);
	}

	public int delete(Long id) {
		return dao.deleteByPrimaryKey(id);
	}

	public Employee get(Long id) {
		return dao.selectByPrimaryKey(id);
	}

	public List<Employee> selectAll() {
		return dao.selectAll();
	}

	public PageResult selectByCondition(QueryObject qo) {
		Long count = dao.queryByConditionCount(qo);
		
		if(count > 0) {
			List<Employee> result = dao.queryByCondition(qo);
			return new PageResult(count, result);
		}else {
			
			return PageResult.EMPTY;		
		}
				
	}

}
