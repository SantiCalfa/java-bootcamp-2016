package topic2A;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FileListTest 
{
	FileList fileList;
	 	
	private void fillList()
	{
		for (int i = 0; i < fileList.MaxFilesInList ; i++) 
		{
			NewFile f = new NewFile();
	 		f.setName("File"+Integer.toString(i));
	 		f.open();
	 		fileList.add(f);
	 	}
	}	
	
	@Before
	public void setUp() throws Exception 
	{
	 	fileList = new FileList();
	}
	
	@Test
	public void FirstTimeTest() 
	{
		assertEquals(0, fileList.size());
	}
	
	@Test
	public void FilesAreHigherThanMaxFiles()
	{
		fileList.clear();
		fillList();
		NewFile f = new NewFile();
		f.setName("File-A");
		f.open();
		fileList.add(f);
		assertEquals("File-A", fileList.getFirst().getName());
	}
	
	@Test
	public void FilesIsHigherThanMaxFilesAndFileIsListed()
	{
		fileList.clear();
		fillList();
		NewFile f = fileList.get(9);
		f.open();
		fileList.add(f);
		assertEquals("File5", fileList.getFirst().getName());
		for (int i = 1; i < fileList.size(); i++) 
		{
			assertTrue(!fileList.get(i).getName().equals("File5"));
		}
	}	
}