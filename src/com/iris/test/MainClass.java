package com.iris.test;

import java.util.Scanner;

import com.iris.daos.EmployeeDaos;
import com.iris.daosimpl.EmployeeDaosImpl;
import com.iris.models.Employee;

public class MainClass {
		 static Scanner sc=new Scanner(System.in);
		 static EmployeeDaos obj=new EmployeeDaosImpl();
		 static void insertEmployee() throws Exception{
			 System.out.println("Enter Employee details");
			 int id=sc.nextInt();
			 String name=sc.next();
			 String gender=sc.next();
			 String password=sc.next();
			 double salary=sc.nextDouble();
			 
			 Employee e=new Employee();
			 e.setEmployeeId(id);
			 e.setEmployeeName(name);
			 e.setGender(gender);
			 e.setPassword(password);
			 e.setSalary(salary);
			 boolean r=obj.addEmployee(e);
			 
			 if(r==true) {
				 System.out.println("Employee Added");
			 }
			 else {
				 System.out.println("Error While adding!!!");
			 }
		 }
		public static void main(String []arsg) {
			System.out.println("Enter ur Choice u wnat to do");
			System.out.println("1. Insert  Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. To get Employee details");
			System.out.println("4  Validate Employee");
			System.out.println("5  to get all employeesDetails");
			try {
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					insertEmployee();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
					default:
						System.out.println("Invalid Choice");
				}}
				catch(Exception e) {
					e.printStackTrace();
				}
				}
			
		}
		
		
		
	
	


