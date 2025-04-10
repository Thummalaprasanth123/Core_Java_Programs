package in.prasanth.pkg1.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JDBCMain {
	//hire_date DATE, last_updated TIMESTAMP
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Thumm8393@");
		Statement stmt = con.createStatement();
		String sql = "CREATE TABLE ppk_emp (empid NUMBER, empname VARCHAR2(255), empsal VARCHAR2(255), hire_date DATE, last_updated TIMESTAMP)";
		stmt.executeUpdate(sql);
		System.out.println("ppk_emp table got created");
		List<TKEmp> emplist = new ArrayList<>();
		String n = "ram";
		if (n == null) {
			List<TKEmp> empl = JDBCSub1.insertOperation(stmt);
			emplist.addAll(empl);
		}
		// System.out.println("Table created successfully " + i);
		// int i = stmt.executeUpdate("insert into tpk_emp(empid,empname,empsal)
		// values(1234,'Hari','29000')");
		// System.out.println("one Record got inserted successfully " + i);
		// int i = stmt.executeUpdate("delete from tpk_emp where empname like 'Ha%'");
		// System.out.println(i + " Records got deleted successfully...");
//		
//		System.out.println(emplist);
//		System.out.println(emplist.get(1));
//		String s = emplist.get(2).getEmpName();
//		System.out.println(s.trim().toUpperCase());
	}

}
