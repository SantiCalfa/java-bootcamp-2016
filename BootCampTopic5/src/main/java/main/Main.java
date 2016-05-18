package main;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.mongodb.morphia.Morphia;
import dao.CourseDAO;
import dao.GradeDAO;
//import dao.StudentDAO;
import entity.Course;
import entity.Student;
import entity.Teacher;
import com.mongodb.MongoClient;

public class Main 
{
	//private static StudentDAO studentDao;
	private static CourseDAO courseDao;
	private static GradeDAO gradeDao;
	
	public static void main(String[] args) throws Exception 
	{
		/*
		* Connection to Mongo Database
		*/
		MongoClient mongo = new MongoClient("localhost", 27017);
		Morphia morphia = new Morphia();
		morphia.mapPackage("entity");
		morphia.createDatastore(mongo, "high_school");
		
		/*
		* Initializing DAOs
		*/
		//studentDao = new StudentDAO(morphia, mongo);
		courseDao = new CourseDAO(morphia, mongo);
		gradeDao = new GradeDAO(morphia, mongo);
		
		/*
		* Practice 2.
		*/
		Course course = new Course();
		course.setName("Maths");
		Set<Student> gradesGreaterThan4 = gradeDao.findStudentsWithGradesGreaterThan4InAGivenCourse(course);
		Iterator<Student> it = gradesGreaterThan4.iterator();
		while(it.hasNext()) 
		{
			Student aux = it.next();
			System.out.println("Student: " + aux.getLastName() + ", " + aux.getFirstName());
		}
		
		/*
		* Practice 3.
		*/
		Teacher teacher = new Teacher();
		teacher.setFirstName("TeacherName1");
		teacher.setLastName("TeacherLastName1");
		List<Course> teachersCourse = courseDao.findCoursesOfAGivenTeacher(teacher);
		Iterator<Course> it2 = teachersCourse.iterator();
		while (it2.hasNext()) 
		{
			Course aux = it2.next();
			System.out.println("Course: "+ aux.getName() + "\nTeacher: " + aux.getTeacher().getLastName() + ", " + aux.getTeacher().getFirstName());
		}
	}
}