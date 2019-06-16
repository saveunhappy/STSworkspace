package com.mypack.service.impl;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mypack.domain.Employee;
import com.mypack.service.IEmployeeService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceImplTest {
	@Autowired
	private IEmployeeService employeeService;
	@Test
	public void testSave() {
		Employee emp = new Employee();
		emp.setPassword("111");
		employeeService.save(emp);
		System.out.println(emp);
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testDelete() {
	}

	@Test
	public void testGet() {
	}

	@Test
	public void testSelectAll() {
	}

	@Test
	public void testSelectByCondition() {
		double sum = 0;
		double[] arr = new double[30];
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			int a = input.nextInt();
			arr[i] = a;
			sum+=arr[i];
		}
		//
		System.out.println(Arrays.toString(arr));
		System.out.println("总和"+sum);
		//排序
		Arrays.sort(arr);
		System.out.print("排序之后");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+",");
		}
		System.out.println("---------------------");
		//最小值
		System.out.println("最小值");
		System.out.println(arr[0]);
		//最大值
		System.out.println("最大值");
		System.out.println(arr[arr.length-1]);
		System.out.println("平均值");
		double avg = sum/arr.length;
		System.out.println(avg);
	}

}
