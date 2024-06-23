package com.js.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.js.entity.Student;

public class StudentDao {

	Configuration config = new Configuration().configure();
	SessionFactory sf = config.buildSessionFactory();
public Student findById(int id)
{
	SessionFactory sessionFactory = null;
	Session session=sessionFactory.openSession();
	Student student=session.get(Student.class, id);
	return student;
}
}
