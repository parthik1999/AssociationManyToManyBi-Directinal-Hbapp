package com.parthik.usecase;



import org.hibernate.Session;

import com.parthik.beans.Department;
import com.parthik.beans.Employee;
import com.parthik.util.SessionUtil;

public class Main {

	
	public static void main(String[] args) {
		
		Session ses = SessionUtil.getSession();
		
		
		
		//for access the data from database
		
		//departent thorugh aceess the employee details
		
		 Department dept = ses.get(Department.class, 1);
		 dept.getEmployees().forEach(emp->{
			 System.out.println(emp.getName());
			 
		 });
		 
		 Employee emp = ses.get(Employee.class, 3);
		 emp.getDept().forEach(d->{
			 
			 System.out.println(d.getDname());
		 });
		
		//===============================================
		//for storing
//		Department d1 = new Department();
//		d1.setDname("sales");
//		d1.setLocation("Gandhinagar");
//		
//		Department d2 = new Department();
//		d2.setDname("marketing");
//		d2.setLocation("Ahemdabad");
//		
//		Employee emp1 = new Employee();
//		emp1.setName("Parthik");
//		emp1.setSalary(10800);
//		
//		Employee emp2 = new Employee();
//		emp2.setName("Shubham");
//		emp2.setSalary(12000);
//		 
//	
//		emp1.getDept().add(d1);
//		emp2.getDept().add(d1);
//		
//		d1.getEmployees().add(emp1);
//		d1.getEmployees().add(emp2);  
//		
//		//shubham works in sales as well as marketing
//		 
//		emp2.getDept().add(d2);
//		d2.getEmployees().add(emp2);
//		
//		
//		ses.getTransaction().begin();
//		
//		ses.save(d1);
//		ses.save(d2); 
//		
//		ses.getTransaction().commit();
		
		System.out.println("done");
	}
	
}
