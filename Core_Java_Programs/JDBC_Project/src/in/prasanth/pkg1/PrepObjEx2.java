package in.prasanth.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepObjEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Thumm8393@");
		String q1="update std_tbl set stdid=? where stdid=?";
		String q2="select * from std_tbl";
		PreparedStatement prepStmt = con.prepareStatement(q2);
		//Scanner sc = new Scanner(System.in);
//		int i = stmt.executeUpdate("create table std_tbl(stdid number, stdname varchar(255),stdloc varchar(255))");
//		int i = stmt.executeUpdate("insert into std_tbl values(111,'Rani','varadaiah palem')");
//		prepStmt.setInt(1,444);
//		prepStmt.setInt(2,2);
			
//			prepStmt.executeUpdate();
		 boolean b = prepStmt.execute();
		 if(b) {
			 ResultSet set = prepStmt.getResultSet();
		while(set.next())
		{
			System.out.println(set.getInt(1) + " " + set.getString(2) + " "/* +set.getString(3) */);
		}
		 }
		 else
		 {
			 int i = prepStmt.getUpdateCount();
			 System.out.println("The total inserted count is :"+i);
		 }
			//System.out.println("Student data got updated successfully");
		//sc.close();
		prepStmt.close();
		con.close();
		
	}

}
