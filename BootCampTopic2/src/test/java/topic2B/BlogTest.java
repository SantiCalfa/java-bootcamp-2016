package topic2B;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class BlogTest 
{
	Entry e;
	Blog b;
	 	
	@Before
	public void setUpBlog() throws Exception
	{
		b= new Blog();
		Entry entry1=new Entry("Calfa","San Lorenzo","this is San Lorenzo","2016-05-05");
		b.newPost(entry1);
		Entry entry2=new Entry("Un Cuervo en Marruecos","Varios","De Boedo a Marruecos","2016-05-05");
		b.newPost(entry2);
		Entry entry3=new Entry("Cuentos Cuervos","Varios","Relatos Cuervos","2014-08-15");
		b.newPost(entry3);
	}
	
	@Test
	public void newEntryTest ()
	{
		Entry e=new Entry ("new entry test","tester","this is a test","2016-05-05");
		b.newPost(e);
		assertTrue(b.newPost(e));
	}
	
	@Test
	public void deleteEntryTest ()
	{
		Entry e=new Entry("delete entry test","tester","this is a test","2016-04-28");
		b.deletePost(e.getEntryId());
		assertTrue(b.deletePost(e.getEntryId()));		
	}
	
	@Test
	public void RecentEntriesAre10Test ()
	{
		List<Entry> recentList;		
		recentList=b.recentEntries();		
		assertEquals(10,recentList.size());
	}
}