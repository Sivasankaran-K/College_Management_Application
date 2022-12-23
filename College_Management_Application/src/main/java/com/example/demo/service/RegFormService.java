package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Registration_Form;
import com.example.demo.repository.RegFormRepository;

@Service
public class RegFormService {
   @Autowired
   private RegFormRepository regformrepository;
   public List<Registration_Form> getRegistrations(){  
	   return regformrepository.findAll();
   }
   public Registration_Form getStudentById(int Register_Number) {          
	   return regformrepository.findById(Register_Number).get();
   }
     public Registration_Form updateRegForm(Registration_Form registration_form ) {  
	   return regformrepository.save(registration_form);
   }
    public void deletestudentById(int Register_Number) {    
    	regformrepository.deleteById(Register_Number);
    }
   
}
