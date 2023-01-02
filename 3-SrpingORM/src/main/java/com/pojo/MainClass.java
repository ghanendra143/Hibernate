package com.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pojo/emp.xml");
		EmpDao empDao = (EmpDao) context.getBean("empDao");
		Employee emp = new Employee();
		
		// insert data
		//empDao.InsertEmp(emp);
		
		// update data
		// empDao.UpdateEmp(emp);
		
		// delete data
		//empDao.DelEmp();
		
		// getOneEmp
		//empDao.GetOneEmp();

		// getAllEmp
		 empDao.GetAllEmp();
	}

}
