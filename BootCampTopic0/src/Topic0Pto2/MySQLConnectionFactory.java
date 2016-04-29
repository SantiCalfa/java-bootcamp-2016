package Topic0Pto2;

import Topic0Pto2.Connection;
import Topic0Pto2.MySQLConnection;

public class MySQLConnectionFactory implements ConnectionFactory
{
	public Connection getConnection() 
	{
	    return new MySQLConnection();
	}
}