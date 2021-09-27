package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//    	JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//    	String insertQuery = "insert into student (id, name, city) values(?,?,?);";
//    	
//    	int result = template.update(insertQuery, 3, "ase", "UP");
//    	System.out.println("Result inserted : " + result);
    	StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);
    	
    	
    	//update
//    	Student s = new Student(5, "samir", "gujarat");
//    	System.out.println(studentDao.insert(s));
    	//delete
//    	System.out.println(studentDao.delete(2));
    	
//    	Student s = studentDao.getStudemt(1);
//    	System.out.println(s);
    	
    	System.out.println(studentDao.getAllStudemt());
    	
    	
    			
    }
}
