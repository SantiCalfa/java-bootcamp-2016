package entity;

import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

@Entity
public class Student implements Comparable<Student> 
{
	@Id
	private ObjectId id;
	private int idstudent;
	private String firstName;
	private String lastName;
	private int registrationNumber;
	private Date birthday;
	 
	public int getIdstudent() {
		return idstudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	 
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	 
	public String getLastName() 
	{
		return lastName;
	}
	 
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	 
	public int getRegistrationNumber() 
	{
		return registrationNumber;
	}
	 
	public void setRegistrationNumber(int registrationNumber) 
	{
		this.registrationNumber = registrationNumber;
	}
	 
	public Date getBirthday() 
	{
		return birthday;
	}
	 
	public void setBirthday(Date birthday) 
	{
		this.birthday = birthday;
	}
	 
	public int compareTo(Student student) 
	{
		if (this.registrationNumber == student.getRegistrationNumber()) 
		{
			return 0;
		}
		return -1;
	}
}