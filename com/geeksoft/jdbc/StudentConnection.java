package com.geeksoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentConnection {

	public static void main(String[] args) {

		Student stud = new Student();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:system@//localhost:1521/ORCL", "system",
					"Sree533633");

			System.out.println("Successfully connected: " + con.toString());
			Statement stmt = con.createStatement();
			System.out.println("STUDENT_ID: STUDENT_NAME: STUDENT_ADDERSS:");
			
			ResultSet rs = stmt.executeQuery("SELECT*FROM STUDENT");
			
			while (rs.next())
			System.out.println(""+rs.getInt(1)+ ""+ ""+rs.getString(2)+""+ ""+rs.getString(3));
			/*stud.setStudentId(rs.getInt(1));
		    stud.setStudentName(rs.getString(2));
		    stud.setStudentAddress(rs.getString(3));
		    System.out.println(""+stud.getStudentId()+ ""+ ""+stud.getStudentName()+""+""+stud.getStudentAddress());*/
			con.close();

		} catch (Exception e) {
			System.out.println("Exception getting the connection." + e);
		}

	}

}
