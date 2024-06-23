package com.js.service;

import com.js.dao.StudentDao;
import com.js.entity.Student;

public class StudentService {

	private StudentDao studDao;
	public StudentService()
	{
		studDao = new StudentDao();
	}
	public Student findById(int id)
	{
	return studDao.findById(id);
	}
	
}
