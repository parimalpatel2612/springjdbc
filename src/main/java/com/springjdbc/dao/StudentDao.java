package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.Student;

public interface StudentDao {
	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(int id);
	
	public Student getStudemt(int id);
	
	public List<Student> getAllStudemt();
}
