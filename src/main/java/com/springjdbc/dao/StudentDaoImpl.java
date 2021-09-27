package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.Student;

@Component
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String insert = "insert into student (id, name, city) values(?,?,?);";
		return jdbcTemplate.update(insert, student.getId(), student.getName(), student.getCity());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) {
		String update = "update student set name= ?,city= ? where  id = ?;";
		return jdbcTemplate.update(update, student.getName(),student.getCity(), student.getId());
	}

	public int delete(int id) {
		String delete = "delete from student where id = ?;";
		return jdbcTemplate.update(delete, id);
	}

	public Student getStudemt(int id) {
		String select = "select * from Student where id = ?;";
		return jdbcTemplate.queryForObject(select, new RowMapperImpl(), id);
	}

	public List<Student> getAllStudemt() {
		String select = "select * from Student";
		return jdbcTemplate.query(select, new RowMapperImpl());
	}
}
