package com.ssh.query;

import lombok.Getter;
import lombok.Setter;

/*
 *	员工的高级查询对象，封装了高级查询信息 
 */
public class EmployeeQueryObject extends QueryObject {
	@Getter@Setter
	private String keyword;//查询名称或者邮箱
	@Getter@Setter
	private Long deptId = -1L;
	
	public void customizedQuery() {
		if(hasLength(keyword)) {
			setKeyword(keyword);
			String key = "%" +keyword+ "%";
			super.addQuery("(obj.name like ? or obj.email like ?)", key,key);
			System.out.println("key----->"+key);
		}
		if(deptId > 0) {
			setDeptId(deptId);
			super.addQuery("obj.dept.id = ?", deptId);
			System.out.println("deptId----->"+deptId);
		}
	}

	@Override
	public String toString() {
		return "EmployeeQueryObject [keyword=" + keyword + ", deptId=" + deptId + "]";
	}
	
	//带有查询条件的HQL，如： where (obj.name like ? or obj.email like ?) and obj.dept.id = ?
	
	
}
