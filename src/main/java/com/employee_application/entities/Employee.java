package com.employee_application.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name="name" ,nullable=false,length=45)
private String name;
	@Email
	@Column(name="email" ,nullable=false,unique=true)
private String email;
	@Column(name="date_of_birth",nullable=false)
private String dateOfBirth;
private int age;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String firstName) {
	this.name = firstName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Column(name="salary" ,nullable=false)
private double salary;
@Column(name="status",nullable=false)
private String status;
}
