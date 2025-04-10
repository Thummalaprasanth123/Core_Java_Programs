package in.prasanth.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepObjEx3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Thumm8393@");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the query: ");
			sc.nextLine();
			String q1 = sc.nextLine();
//			if (q1.trim().isEmpty()) {
//                System.out.println("Invalid query. Please enter a valid SQL query.");
//                continue;
//            }
			PreparedStatement prepStmt = con.prepareStatement(q1);
			boolean b = prepStmt.execute();
			if (b) {
				ResultSet set = prepStmt.getResultSet();
				while (set.next()) {
					System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3));
				}
			} else {
				int i = prepStmt.getUpdateCount();
				System.out.println("The total inserted count is :" + i);
			}
			System.out.println("Enter YES/NO: ");
			String option = sc.next();
			if (option.equalsIgnoreCase("No")) {
				prepStmt.close();
				break;
			}
		}
//		int i = stmt.executeUpdate("create table std_tbl(stdid number, stdname varchar(255),stdloc varchar(255))");
//		int i = stmt.executeUpdate("insert into std_tbl values(111,'Rani','varadaiah palem')");
//		prepStmt.setInt(1,444);
//		prepStmt.setInt(2,2);

//			prepStmt.executeUpdate();

		// System.out.println("Student data got updated successfully");
		sc.close();

		con.close();

	}

}
