package topic2A;
public class NewFile 
{
	private boolean open = false;
	private String fileName;
	 	
	public boolean isOpen() 
	{
		return open;
	}
	
	public void open() 
	{
		this.open = true;
	}
	
	public void close()
	{
		this.open = false;
	}
	
	public String getName() 
	{
		return fileName;
	}
	
	public void setName(String fileName) 
	{
		this.fileName = fileName;
	}
}