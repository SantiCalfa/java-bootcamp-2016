package Topic0Pto2;

import Topic0Pto2.Connection;
import Topic0Pto2.MongoDBConnection;

public class MongoDBConnectionFactory implements ConnectionFactory
{
	public Connection getConnection() 
	{
	    return new MongoDBConnection();
	}
}