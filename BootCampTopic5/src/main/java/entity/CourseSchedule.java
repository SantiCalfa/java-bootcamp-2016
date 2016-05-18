package entity;

import java.util.Date;
import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class CourseSchedule 
{
	private String day;
	private Date startHour;
	private Date endHour;
	
	public String getDay() 
	{
		return day;
	}
	 
	public void setDay(String day) 
	{
		this.day = day;
	}
	
	public Date getStartHour() 
	{
		return startHour;
	}
	
	public void setStartHour(Date startHour) 
	{
		this.startHour = startHour;
	}
		 	
	public Date getEndHour() 
	{
		return endHour;
	}
		 	
	public void setEndHour(Date endHour) 
	{
		this.endHour = endHour;
	}
}