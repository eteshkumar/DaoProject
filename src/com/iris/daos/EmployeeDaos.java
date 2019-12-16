package com.iris.daos;

import java.util.List;
import com.iris.models.Employee;
public interface EmployeeDaos {
	public boolean addEmployee(Employee e) throws Exception;
	public boolean deleteEmployee( int EmployeeId ) throws Exception;
	public Employee getEmployeeById(int EmployeeId) throws Exception;
	//public boolean  ValidateEmployee(int EmpId,String password) throws Exception;
	//public list<Employee> getAllEmployees() throws Exception;
	
	

}
