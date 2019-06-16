package com.mypack.crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.mypack._03one2many.Department;
import com.mypack._03one2many.Employee;
import com.mypack.util.JPAUtil;

public class Test3 {
    @Before
    public void testSave() {
        Employee e1 = new Employee();
        e1.setName("Neld");
        Employee e2 = new Employee();
        e2.setName("Lily");

        Department d = new Department();
        d.setName("研发部");

        List<Employee> employees = new ArrayList<>();
//        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);

        d.setEmployees(employees);

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(e1);
        em.persist(e2);
        em.persist(d);
        em.getTransaction().commit();
        em.close();
    }

    @Test
    public void testGet() {
        EntityManager em = JPAUtil.getEntityManager();
        Department d = em.find(Department.class, 1L);
        System.out.println(d);
        System.out.println(d.getEmployees());
      //  List<Employee> es = d.getEmployees();
//        Set<Employee> es = d.getEmployees();
      //  System.out.println(es.getClass());
        //在真正使用many方的数据的时候才发送SQL执行查询,延迟加载
      //  System.out.println(es);
        em.close();
    }
}
