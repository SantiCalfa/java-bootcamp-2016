package Topic0Pto2;

import Topic0Pto2.Connection;
import Topic0Pto2.ConnectionFactory;

public class FactoryImplementation //Only knows that it will receive some factory, that will produce database connections.
{								   
	  private final ConnectionFactory cf;

	  public FactoryImplementation(ConnectionFactory connectionFactory) 
	  {
	    this.cf = connectionFactory;
	  }

	  public void start() //Starts the Application execution
	  {
	    Connection con = cf.getConnection();
	    con.connect();
	  }
}