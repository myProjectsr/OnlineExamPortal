package com.rkyash.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="adminId",foreignKey=@ForeignKey(name="adminId_FK"))
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name="studentId",foreignKey=@ForeignKey(name="studentId_FK"))
	private Student student;
	@Column(name="userRole")
	private String userRole;
	
	

	public UserMaster(Admin admin, Student student, String userRole) {
		super();
		this.admin = admin;
		this.student = student;
		this.userRole = userRole;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
}
