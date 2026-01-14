package com.jdbc;
import java.sql.*;
import java.util.Scanner;

public class Update2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollno; String name; float per;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc.mysql://localhost:3306/school","root","");
			
			System.out.println("Enter rollno,name and per");
			rollno=sc.nextInt();
			name=sc.next();
			per=sc.nextFloat();
			
			PreparedStatement st=con.prepareStatement("Update student set name=?,per=?,where rollno=?");
			st.setString(1, name);
			st.setFloat(2, per);
			st.setInt(3, rollno);
			
			
			st.executeUpdate();
			System.out.println("Record Updated");
			
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		

	}

}
