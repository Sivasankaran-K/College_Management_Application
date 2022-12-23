package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "registration_form")
public class Registration_Form {
	@Id
	
	@Column(name = "Register_Number")
	private int Register_Number;
	
	@Column(name = "Student_Name", nullable = false,length = 45)
	private String Student_Name;
	
	@Column(name = "Department", nullable = false)
	private String Department;
	@Column(name = "Batch", nullable = false)
	private String Batch;
    @Column(name = "Date_Of_Birth", nullable = false)
    @JsonFormat(shape =Shape.STRING,pattern = "dd-MM-yyyy")
	private String Date_Of_Birth;
    @Column(name = "Blood_Group", nullable = false)
    private String Blood_Group;
    @Column(name = "Address", nullable = false)
	private String Address;
    @Column(name = "Gender", nullable = false)
	private String Gender;
    @Column(name = "Father_Name", nullable = false)
   	private String Father_Name;
    @Column(name = "Mother_Name", nullable = false)
   	private String Mother_Name;
    @Column(name = "Contact_Number", nullable = false)
   	private String Contact_Number;
    @Column(name = "Email", nullable = false)
  	private String Email;
    @Column(name = "Parent_Contact_Number", nullable = false)
   	private String Parent_Contact_Number;
    @Column(name = "Attendance")
  	private String Attendance;
    @Column(name = "Marks")
  	private String Marks;
    @Column(name = "Grade")
  	private String Grade;
    @Column(name = "Result")
  	private String Result;
    @Column(name = "Fees")
  	private String Fees;
    @Column(name = "Date_Of_Admission")
    @Temporal(TemporalType.DATE)
	private Date Date_Of_Admission = new Date(System.currentTimeMillis());
    @Column(name = "Last_Updated")
    @Temporal(TemporalType.TIMESTAMP)
	private Date Last_Updated = new Date(System.currentTimeMillis());
public Registration_Form() {
	super();
}
public Registration_Form(int register_Number, String student_Name, String department, String batch,
		String date_Of_Birth, String blood_Group, String address, String gender, String father_Name, String mother_Name,
		String contact_Number,String email, String parent_Contact_Number, String attendance, String marks, String grade,
		String result, String fees, Date date_Of_Admission, Date last_Updated) {
	super();
	Register_Number = register_Number;
	Student_Name = student_Name;
	Department = department;
	Batch = batch;
	Date_Of_Birth = date_Of_Birth;
	Blood_Group = blood_Group;
	Address = address;
	Gender = gender;
	Father_Name = father_Name;
	Mother_Name = mother_Name;
	Contact_Number = contact_Number;
	Email = email;
	Parent_Contact_Number = parent_Contact_Number;
	Attendance = attendance;
	Marks = marks;
	Grade = grade;
	Result = result;
	Fees = fees;
	Date_Of_Admission = date_Of_Admission;
	Last_Updated = last_Updated;
}

public int getRegister_Number() {
	return Register_Number;
}

public void setRegister_Number(int register_Number) {
	Register_Number = register_Number;
}

public String getStudent_Name() {
	return Student_Name;
}

public void setStudent_Name(String student_Name) {
	Student_Name = student_Name;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

public String getBatch() {
	return Batch;
}

public void setBatch(String batch) {
	Batch = batch;
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

public String getFather_Name() {
	return Father_Name;
}

public void setFather_Name(String father_Name) {
	Father_Name = father_Name;
}

public String getMother_Name() {
	return Mother_Name;
}

public void setMother_Name(String mother_Name) {
	Mother_Name = mother_Name;
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

public String getParent_Contact_Number() {
	return Parent_Contact_Number;
}

public void setParent_Contact_Number(String parent_Contact_Number) {
	Parent_Contact_Number = parent_Contact_Number;
}

public String getAttendance() {
	return Attendance;
}

public void setAttendance(String attendance) {
	Attendance = attendance;
}

public String getMarks() {
	return Marks;
}

public void setMarks(String marks) {
	Marks = marks;
}

public String getGrade() {
	return Grade;
}

public void setGrade(String grade) {
	Grade = grade;
}

public String getResult() {
	return Result;
}

public void setResult(String result) {
	Result = result;
}

public String getFees() {
	return Fees;
}

public void setFees(String fees) {
	Fees = fees;
}

public Date getDate_Of_Admission() {
	return Date_Of_Admission;
}

public void setDate_Of_Admission(Date date_Of_Admission) {
	Date_Of_Admission = date_Of_Admission;
}

public Date getLast_Updated() {
	return Last_Updated;
}

public void setLast_Updated(Date last_Updated) {
	Last_Updated = last_Updated;
}

}
