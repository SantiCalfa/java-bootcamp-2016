package Topic0Pto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDB {
	
	private static SingletonDB sdb;
	 	private String host;
	 	private String user;
	 	private String pass;
	 	private Connection con;
	 	
	 	private SingletonDB()
	 	{
	 		host = "database_host";
	 		user= "user_name";
	 		pass= "user_pass";
	 		try
	 		{
	 			con = DriverManager.getConnection(host,user,pass);
	 			System.out.print("Connected to database");
	 		}
	 		catch (SQLException e)
	 		{
	 			System.out.print("You could not access to database. Some information are missing");
	 		}
	 	}
	 	
	 	public static SingletonDB getInstance()
	 	{
	 		if (sdb==null)
	 		{
	 			sdb = new SingletonDB();
	 		}
	 			return sdb;
	 	}
	 	
	 	public static void main(String[] args)
	 	{
	 		 SingletonDB db = new SingletonDB(); 
	 	}
}