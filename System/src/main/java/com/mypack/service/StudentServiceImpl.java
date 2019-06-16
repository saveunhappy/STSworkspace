package com.mypack.service;

import java.beans.IntrospectionException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypack.dao.StudentDao;
import com.mypack.entity.ExcelBean;
import com.mypack.entity.Student;
import com.mypack.util.ExcelUtil;

@Transactional
@Service
public class StudentServiceImpl implements StudentServiceIF {
	@Autowired
	StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mypack.service.StudentServiceIF#listAllStu()
	 */
	@Override
	public List<Student> listAllStu() {

		return studentDao.queryAllStudents();
	}
	@Override
	public PageInfo<Student> listAllStuByPage(int currentPage, int pageSize) {

		PageHelper.startPage(currentPage, pageSize);
		List<Student> stulst = studentDao.queryAllStudents();
		PageInfo<Student> pageInfo = new PageInfo<Student>(stulst);
		return pageInfo;
	}

	@Override
	public List<Student> queryOneStudent(Student stu) {
		return studentDao.queryOneStudent(stu);
	}

	@Override
	public Integer addOneStu(Student stu) {
		return studentDao.addOneStudent(stu);
	}

	@Override
	public Integer delOneStu(int id) {
		return studentDao.delOneStudent(id);
	}

	@Override
	public Student queryOne(int id) {
		return studentDao.queryOneStudentById(id);
	}

	@Override
	public void update(Student stu) {
        	studentDao.updateStudent(stu);	
	}


	
}
