package Topic0Pto4;

public class DatabaseDirector 
{
	public static void main(String[] args) 
	{
		DatabaseBuilder connector = new MySQLBuilder(); // Create a static connection 
		String result = connector.connect("user", "password");
		System.out.println(result);
	}
}