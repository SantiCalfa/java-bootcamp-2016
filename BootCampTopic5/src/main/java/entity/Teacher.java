package entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;

@Embedded
public class Teacher implements Comparable<Teacher> 
{	 
		@Id
		private ObjectId id;
		private int idteacher;
		private String firstName;
	 	private String lastName;
	 	private Date birthday;
	 
	 	public int getIdteacher() {
			return idteacher;
		}

		public void setIdteacher(int idteacher) {
			this.idteacher = idteacher;
		}
	 	
	 	public String getFirstName() {
	 		return firstName;
	 	}
	 
	 	public void setFirstName(String firstName) {
	 		this.firstName = firstName;
	 	}
	 
	 	public String getLastName() {
	 		return lastName;
	 	}
	 
	 	public void setLastName(String lastName) {
	 		this.lastName = lastName;
	 	}
	 
	 	public Date getBirthday() {
	 		return birthday;
	 	}
	 
	 	public void setBirthday(Date birthday) {
	 		this.birthday = birthday;
	 	}
	 
	 	public int compareTo(Teacher teacher) {
	 		if (this.firstName.compareTo(teacher.getFirstName()) == 0 && this.lastName.compareTo(teacher.getLastName()) == 0) {
	 			return 0;
	 		}
	 		return 1;
	 	}
}