package in.prasanth.pkg1.copy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCSub1 {
	public static List<TKEmp> insertOperation(Statement stmt) throws SQLException {

		stmt.executeUpdate("insert into tkk_emp(empid,empname,empsal) values(1,'Hari','29000')");
		stmt.executeUpdate("insert into tkk_emp(empid,empname,empsal) values(2,'Nandhu','30000')");
		stmt.executeUpdate("insert into tkk_emp(empid,empname,empsal) values(3,'Dharani','24500')");
		System.out.println("Records got inserted successfully ");

		ResultSet set = stmt.executeQuery("select * from tkk_emp");
		List<TKEmp> le = new ArrayList<>();
		while (set.next()) {
			TKEmp emp = new TKEmp();
			System.out.println(set.getInt("empid") + " " + set.getString(2) + " " + set.getFloat("empsal"));
			emp.setEmpId(set.getInt(1));
			emp.setEmpName(set.getString(2));
			emp.setEmpSal(set.getString(3));
			le.add(emp);
		}
		return le;

	}
}
