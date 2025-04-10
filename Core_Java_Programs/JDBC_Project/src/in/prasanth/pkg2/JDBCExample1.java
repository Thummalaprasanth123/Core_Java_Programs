package in.prasanth.pkg2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Thumm8393@");
		// Statement stmt = con.createStatement();
		String q1 = "select * from tpk_emp";
		String q2 = "insert into tpk_emp values(22,'Ambhika','36000')";
		PreparedStatement prepstmt = con.prepareStatement(q2);
		/*
		 * PreparedStatement prepstmt =
		 * con.prepareStatement("insert into tpk_emp values(?,?,?)"); prepstmt.setInt(1,
		 * 21); prepstmt.setString(2, "Bhagavan"); prepstmt.setString(3, "43000");
		 */
		boolean b = prepstmt.execute();
		if (b) {
			ResultSet set = prepstmt.getResultSet();
			while (set.next()) {
				System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3));
			}
		} else {
			int i = prepstmt.getUpdateCount();
			System.out.println("No of records inserted is: " + i);
			// System.out.println("There is no non-select query in the program");
		}
		// int i = stmt.executeUpdate("create table tpk_emp(empid number, empname
		// varchar(255),empsal varchar(255))");
		// System.out.println("Table created successfully" + i);
		// int i = stmt.executeUpdate("insert into tpk_emp(empid,empname,empsal)
		// values(1234,'Hari','29000')");
		// System.out.println("one Record got inserted successfully " + i);
		// int i = stmt.executeUpdate("delete from tpk_emp where empname like 'Ha%'");
		// System.out.println(i + " Records got deleted successfully...");
		// stmt.executeUpdate("insert into tpk_emp values(4,'four','34000')");
//		stmt.executeUpdate("insert into tpk_emp(empid,empname,empsal) values(2,'Nandhu','30000')");
//		stmt.executeUpdate("insert into tpk_emp(empid,empname,empsal) values(3,'Dharani','24500')");
//		System.out.println("Records got inserted successfully ");
		// ResultSet set = stmt.executeQuery("select * from tpk_emp");
		// System.out.println("Record got inserted in the table....");
	}
}
