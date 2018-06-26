package com.rkyash.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rkyash.bean.Student;

public class StudentDaoImp implements StudentDao {

	
	Session session;
	
	Transaction tr;
	
	@Override
	public void saveOrUpdateUser(Student student) {
		try {
			session.saveOrUpdate(student);
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Student> listUser() {
		List<Student> studentList=null;
		try {
			studentList=session.createQuery("form Student").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}

	@Override
	public Student listUserById(Long studentId) {
		Student student=null;
		try {
			student=session.get(Student.class, studentId);
			} catch (Exception e) {
				e.printStackTrace();
		}
		return student;
	}

	@Override
	public void deleteUser(Long studentId) {
		try {
			Student student=(Student)session.get(Student.class, studentId);
			session.delete(student);
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		
	}

}
