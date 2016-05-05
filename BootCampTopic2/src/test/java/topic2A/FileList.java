package topic2A;
import java.util.LinkedList;

public class FileList 
{
	private LinkedList<NewFile> fileList;
	public final int MaxFilesInList = 15;
	  
	  
	public FileList()
	{
	 	 fileList = new LinkedList<NewFile>();
	}
	
	public void add(NewFile f)
	{
	 	if(f.isOpen())
	 	{
	 		fileList.remove(f);
	 		fileList.addFirst(f);
	 		sizeCorrection();
	 	}
	}
	 
	private void sizeCorrection ()
	{
	 	if(fileList.size()>= MaxFilesInList) fileList.removeLast();
	}
	
	public NewFile get(int index)
	{
	 	return fileList.get(index);
	}
	
	public NewFile getFirst()
	{
	 	return fileList.getFirst();
	}
	
	public void clear()
	{
	 	fileList.clear();
	}
	
	public int size()
	{
	 	return fileList.size();
	}
}