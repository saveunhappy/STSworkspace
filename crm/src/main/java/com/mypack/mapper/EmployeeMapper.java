package com.mypack.mapper;

import com.mypack.domain.Employee;
import com.mypack.query.QueryObject;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    Employee selectByPrimaryKey(Long id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);

	Long queryByConditionCount(QueryObject qo);

	List<Employee> queryByCondition(QueryObject qo);
}