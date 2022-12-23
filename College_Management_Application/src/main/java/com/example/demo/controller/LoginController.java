package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.example.demo.entity.Adminsignup;
import com.example.demo.entity.Registration_Form;

@Controller
public class LoginController {
	@Autowired
	@RequestMapping(value ="/AdminLogin" , method = RequestMethod.GET)
	public String AdminLogin() {
		return "Admin/AdminLogin";
	}
	@RequestMapping(value ="/AdminView" , method = RequestMethod.POST)
	public String AdminLogged(ModelMap model, @RequestParam String email , String password) {
		if(email.equals("Admin@gmail.com") && password.equals("admin")) {
			return "Admin/admin";
		}
		else {	
		return "Admin/AdminLoginError";
	}
	}
	@RequestMapping(value ="/FacultyLogin" , method = RequestMethod.GET)
	public String FacultyLogin() {
		return "Faculty/FacultyLogin";
	}
	@PostMapping("/FacultyView" )
	public String FacultyLogged(ModelMap model, @RequestParam String email , String password) {
		
		if(email.equals("Faculty@gmail.com") && password.equals("faculty")) {
			return "Faculty/faculty";
		}
		else {
		return "Faculty/LoginError";
	}
	}
	@RequestMapping(value ="/StudentLogin" , method = RequestMethod.GET)
	public String StudentLogin() {
		return "Student/StudentLogin";
	}
	@RequestMapping(value ="/StudentView" , method = RequestMethod.POST)
	public String StudentLogged(ModelMap model, @RequestParam String email , String password) {
		
		if(email.equals("Student@gmail.com") && password.equals("student")) {
			return "Student/student";
		}
		else {
		return "Student/StudentLoginError";
	}
	}
	
}
