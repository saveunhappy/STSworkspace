package com.mypack.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.mypack.entity.Student;

public interface StudentServiceIF {

	public abstract List<Student> listAllStu();

	public PageInfo<Student> listAllStuByPage(int currentPage, int pageSize);
	public List<Student> queryOneStudent(Student stu);
	public Integer addOneStu(Student stu);
	public Integer delOneStu(int id);
	public Student queryOne(int id);
	public void update(Student stu);

}