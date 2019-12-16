package com.iris.daosimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iris.daos.EmployeeDaos;
import com.iris.models.Employee;
import com.iris.utility.ConnectionProvider;


public class EmployeeDaosImpl implements EmployeeDaos{
	Connection conn=ConnectionProvider.getConn();
	public boolean addEmployee(Employee e) throws Exception{
		PreparedStatement ps=conn.prepareStatement("insert into EmployeeEx values(?,?,?,?,?)");
		ps.setInt(1, e.getEmployeeId());
		ps.setString(2, e.getEmployeeName());
		ps.setString(3, e.getGender());
		ps.setString(4, e.getPassword());
		ps.setDouble(5, e.getSalary());
		int i=ps.executeUpdate();
		if(i!=0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean deleteEmployee(int EmployeeId) throws Exception{
		Connection conn=ConnectionProvider.getConn();
		PreparedStatement ps=conn.prepareStatement("delete from EmployeeEx where id=?");
		ps.setInt(1, EmployeeId);
		int i=ps.executeUpdate();
		if(i!=0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public Employee getEmployeeById(int EmployeeId) throws Exception{
		PreparedStatement ps=conn.prepareStatement("select * from EmployeeEx where id=?");
		ps.setInt(1, EmployeeId);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String gender=rs.getString(3);
			String password=rs.getString(4);
			double salary=rs.getDouble(5);
			
			Employee e=new Employee();
			e.setEmployeeId(id);
			e.setEmployeeName(name);
			e.setGender(gender);
			e.setPassword(password);
			e.setSalary(salary);
			return e;
		}
		else {
			return null;
		}
		
		
	}
	

}
