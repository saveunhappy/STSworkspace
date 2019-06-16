package com.mypack.crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import com.mypack._05many2many.Student;
import com.mypack._05many2many.Teacher;
import com.mypack.util.JPAUtil;


public class Test5 {
	 @Test
	    public void testSave(){
	        Teacher t1 = new Teacher();
	        t1.setName("Neld");
	        Teacher t2 = new Teacher();
	        t2.setName("Will");

	        Student s1 = new Student();
	        s1.setName("Lucy");
	        Student s2 = new Student();
	        s2.setName("Lily");

	        List<Student> students = new ArrayList<>();
	        students.add(s1);
	        students.add(s2);

	        t1.setStudents(students);
	        t2.setStudents(students);

	        List<Teacher> teachers = new ArrayList<>();
	        teachers.add(t1);
	        teachers.add(t2);
	        s1.setTeachers(teachers);
	        s2.setTeachers(teachers);

	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();
	        em.persist(t1);
	        em.persist(t2);
	        em.persist(s1);
	        em.persist(s2);

	        em.getTransaction().commit();
	        em.close();

	    }
}
