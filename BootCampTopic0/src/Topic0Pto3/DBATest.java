package Topic0Pto3;

public class DBATest 
{
	public static void main(String[] args) 
	{
		ProxyDBAccesor dba = new ProxyDBAccesor();
		dba.getConnection();
	}
}