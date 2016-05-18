package dao;

import entity.Student;
import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class StudentDAO extends BasicDAO<Student, ObjectId> {
	 
	 	public StudentDAO(Morphia morphia, MongoClient mongo) {
	 		super(mongo, morphia, "high_school");
	 	}

}