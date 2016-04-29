package Topic0Pto3;

public class DatabaseAccesor 
{
	
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://localhost";
	 	
	 static final String user = "user";
	 static final String pass = "pass";
	 	
	 public void connection()
	 {
	 	System.out.print("Connection established successfully");
	 }
	 
	 public void getConnection() 
	 {
		connection();
	 }
}