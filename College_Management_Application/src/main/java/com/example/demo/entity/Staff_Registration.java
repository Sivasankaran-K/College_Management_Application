package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
@Entity
@Table(name = "staff_registration")
public class Staff_Registration {
@Id
	@Column(name = "Faculty_Id")
	private int Faculty_Id;
	@Column(name = "Faculty_Name")
	private String Faculty_Name;
	@Column(name = "Designation")
	private String Designation;
	@Column(name = "Educational_Qualification")
	private String Educational_Qualification;
    @Column(name = "Date_Of_Birth")  
    @JsonFormat(shape =Shape.STRING,pattern = "dd-MM-yyyy")
	private String Date_Of_Birth;
    @Column(name = "Blood_Group")
    private String Blood_Group;
    @Column(name = "Address")
	private String Address;
    @Column(name = "Gender")
	private String Gender;
    @Column(name = "Contact_Number")
   	private String Contact_Number;
    @Column(name = "Email_Id")
  	private String Email;
    @Column(name = "Date_Of_Joining")
    @Temporal(TemporalType.DATE)
	private Date Date_Of_Joining = new Date(System.currentTimeMillis());
    @Column(name = "Salary")
  	private double Salary;
    @Column(name = "Last_Updated")
    @Temporal(TemporalType.TIMESTAMP)
	private Date Last_Updated = new Date(System.currentTimeMillis());
	public Staff_Registration() {
		super();
	}
	public Staff_Registration(int faculty_Id, String faculty_Name, String designation,
			String educational_Qualification, String date_Of_Birth, String blood_Group, String address, String gender,
			String contact_Number, String email, Date date_Of_Joining, double salary, Date last_Updated) {
		super();
		Faculty_Id = faculty_Id;
		Faculty_Name = faculty_Name;
		Designation = designation;
		Educational_Qualification = educational_Qualification;
		Date_Of_Birth = date_Of_Birth;
		Blood_Group = blood_Group;
		Address = address;
		Gender = gender;
		Contact_Number = contact_Number;
		Email = email;
		Date_Of_Joining = date_Of_Joining;
		Salary = salary;
		Last_Updated = last_Updated;
	}
	public int getFaculty_Id() {
		return Faculty_Id;
	}
	public void setFaculty_Id(int faculty_Id) {
		Faculty_Id = faculty_Id;
	}
	public String getFaculty_Name() {
		return Faculty_Name;
	}
	public void setFaculty_Name(String faculty_Name) {
		Faculty_Name = faculty_Name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getEducational_Qualification() {
		return Educational_Qualification;
	}
	public void setEducational_Qualification(String educational_Qualification) {
		Educational_Qualification = educational_Qualification;
	}
	public String getDate_Of_Birth() {
		return Date_Of_Birth;
	}
	public void setDate_Of_Birth(String date_Of_Birth) {
		Date_Of_Birth = date_Of_Birth;
	}
	public String getBlood_Group() {
		return Blood_Group;
	}
	public void setBlood_Group(String blood_Group) {
		Blood_Group = blood_Group;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(String contact_Number) {
		Contact_Number = contact_Number;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getDate_Of_Joining() {
		return Date_Of_Joining;
	}
	public void setDate_Of_Joining(Date date_Of_Joining) {
		Date_Of_Joining = date_Of_Joining;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Date getLast_Updated() {
		return Last_Updated;
	}
	public void setLast_Updated(Date last_Updated) {
		Last_Updated = last_Updated;
	}  
}
