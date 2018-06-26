package com.rkyash.dao;

import java.util.List;

import com.rkyash.bean.Student;

public interface StudentDao {
	
	public void saveOrUpdateUser(Student student);
	public List<Student> listUser();
	public Student listUserById(Long studentId);
	public void deleteUser(Long studentId);
}
