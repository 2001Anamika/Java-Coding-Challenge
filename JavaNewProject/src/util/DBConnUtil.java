package util;

import java.sql.*;

public class DBConnUtil {
	 static Connection getDBConn() throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("mysql:jdbc://localhost:3306/anamika","root","anamika@2001");
		 return con;
	 } 
}
