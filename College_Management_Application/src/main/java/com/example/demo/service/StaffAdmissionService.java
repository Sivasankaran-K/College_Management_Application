package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Registration_Form;
import com.example.demo.entity.Staff_Registration;
import com.example.demo.repository.StaffAdmissionRepository;
@Service
public class StaffAdmissionService {
 @Autowired
 private StaffAdmissionRepository staffadmissionrepository;

 public List<Staff_Registration>getStaffDetails(){   
	 return staffadmissionrepository.findAll();
 }
 public Staff_Registration getStaffDetailById(int  Faculty_Id) {        
	 return staffadmissionrepository.findById(Faculty_Id).orElse(null);
 }
 
 
   public Staff_Registration updateFacultyRegForm(Staff_Registration staff_registration ) {   
	   return staffadmissionrepository.save(staff_registration);
 }
   public void deletefacultyById(int Register_Number) {     
   	staffadmissionrepository.deleteById(Register_Number);
   }
  
 
}
