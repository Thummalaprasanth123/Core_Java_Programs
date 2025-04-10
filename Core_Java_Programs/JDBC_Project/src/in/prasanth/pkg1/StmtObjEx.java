package in.prasanth.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StmtObjEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Thumm8393@");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
//		int i = stmt.executeUpdate("create table std_tbl(stdid number, stdname varchar(255),stdloc varchar(255))");
//		int i = stmt.executeUpdate("insert into std_tbl values(111,'Rani','varadaiah palem')");
		while(true)
		{
			System.out.println("Enter student sid : ");
			int sid=sc.nextInt();
			System.out.println("Enter student name : ");
			String sname=sc.next();
			System.out.println("Enter student location : ");
			String sloc=sc.next();
			String q1="insert into std_tbl values("+sid+",'"+sname+"','"+sloc+"')";
			System.out.println(q1);
			stmt.executeUpdate(q1);
			System.out.println("Student data inserted successfully");
			System.out.println("Enter yes/No");
			String option=sc.next();
			if(option.equalsIgnoreCase("no"))
			  break;
		}
		//System.out.println("Query execution completed  " + i);
		sc.close();
		con.close();
		stmt.close();
	}

}
