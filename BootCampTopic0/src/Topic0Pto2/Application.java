package Topic0Pto2;

import Topic0Pto2.FactoryImplementation;
import Topic0Pto2.ConnectionFactory;
import Topic0Pto2.MySQLConnectionFactory;
import Topic0Pto2.MongoDBConnectionFactory;

 class Application {

	public static void main(String[] args) 
	{		
	    DatabaseType databaseType = DatabaseType.MYSQL;
	    ConnectionFactory connectionFactory = getConnectionFactory(databaseType);

	    FactoryImplementation fi = new FactoryImplementation(connectionFactory);
	    fi.start();
	  }

	  private static ConnectionFactory getConnectionFactory(DatabaseType databaseType) 
	  {
	    switch (databaseType) 
	    {
	    case MYSQL:
	      return new MySQLConnectionFactory();
	    default:
	      return new MongoDBConnectionFactory();
	    }
	  }

	  private enum DatabaseType //Static method that creates the concrete factory implementation based on an Enum
	  {
	    MYSQL, MongoDB;
	  }
}