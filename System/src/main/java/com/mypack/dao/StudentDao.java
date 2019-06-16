package com.mypack.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.mypack.entity.Student;

public interface StudentDao {
	
	public List<Student> queryAllStudents();
	
    public List<Student> queryOneStudent(Student stu);
    
    public Integer addOneStudent(Student stu);
    
    public Integer delOneStudent(int id);
    
    public Student queryOneStudentById(int id);
    
    public  void updateStudent(Student stu);
}
