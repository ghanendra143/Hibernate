package com.employee.main;

import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Add Employee \n"+
				"2. Update Employee \n"+
				"3. Delete Employee \n"+
				"4. View Single Employee \n" + 
				"5. View All Employees \n");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.print("\n");
		switch(choice)
		{	
		case 1:
			// add employee
			MainClass.InsertEmp();
			break;
		case 2:
			// update eployee
			MainClass.UpdateEmp();
			break;
		case 3:
			// delete employee
			MainClass.delEmp();
			break;
		case 4:
			// view single employee
			MainClass.viewOneEmp();
			break;
		case 5:
			// view all employees
			MainClass.ViewAllEmp();
			break;
		default : 
			System.out.println("invalid choice !!");
		}
   }
}
