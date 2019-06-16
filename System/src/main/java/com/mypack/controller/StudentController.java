package com.mypack.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypack.entity.Student;
import com.mypack.service.StudentServiceIF;

@Controller
public class StudentController {

	@Autowired
	StudentServiceIF studentService;

	public StudentServiceIF getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentServiceIF studentService) {
		this.studentService = studentService;
	}

	// 未按分页
	/*
	 * @RequestMapping("/listall") public String listAllStu(Model model){
	 * 
	 * List<Student> stulst=studentService.listAllStu();
	 * model.addAttribute("lst", stulst); return "list"; }
	 */
	@RequestMapping("/listall")
public String listAllStu(Integer currentPage,Model model){
		PageHelper.startPage(1, 3);
		//List<Student> stulst=studentService.listAllStu();
		// 第一次登录没有当前页，默认第一页
		if (currentPage == null) {
			currentPage = 1;
		}
		PageInfo<Student> pageInfo = studentService.listAllStuByPage(currentPage,3);
		// 控制页面显示风格 首页的上一页及尾页的下一页
		if (pageInfo.getPageNum() == pageInfo.getFirstPage()) {
			pageInfo.setPrePage(1);
		}
		if (pageInfo.getPageNum() == pageInfo.getPages()) {
			pageInfo.setNextPage(pageInfo.getPages());
		}
		model.addAttribute("pageInfo", pageInfo);
		//model.addAttribute("lst", stulst);
		return "index";
	}
@RequestMapping("/listOne")
public String listOneStu(Student stu,Model model){
	List<Student> stulst=studentService.queryOneStudent(stu);
	model.addAttribute("lst", stulst);
	return "details";
}	
@RequestMapping("/listOne1")
public String listOneStu1(int id,Model model){
	Student stulst=studentService.queryOne(id);
	model.addAttribute("stu", stulst);
	return "details";
}	
@RequestMapping("/add")
public String addOneStu(Student stu){
	Integer a=studentService.addOneStu(stu);
	System.out.println(a);
	return "redirect:listall";
}
@RequestMapping("/del")
public String delOneStu(int id){
	Integer a=studentService.delOneStu(id);
	return "redirect:listall";
}
@RequestMapping("/load")
public String loadStu(int id, Model model) {
	Student stu = studentService.queryOne(id);
	model.addAttribute("stu", stu);
	return "details";
}
@RequestMapping("/load1")
public String loadStu1(int id, Model model) {
	Student stu = studentService.queryOne(id);
	model.addAttribute("stu", stu);
	return "update";
}
@RequestMapping("/update")
public String editStu(Student stu) {
	studentService.update(stu);
	System.out.println("123456");
	    return "redirect:listall";
}
}
