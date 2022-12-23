package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



import com.example.demo.entity.Registration_Form;
import com.example.demo.entity.Staff_Registration;

import com.example.demo.repository.RegFormRepository;
import com.example.demo.repository.StaffAdmissionRepository;
import com.example.demo.service.RegFormService;
import com.example.demo.service.StaffAdmissionService;
@Controller
public class PrimaryController {
	@Autowired
	 private RegFormService regformservice;
	 @Autowired
     private StaffAdmissionService staffadmissionservice;
	@Autowired
	private RegFormRepository regformrepository;
	@Autowired
    private StaffAdmissionRepository staffadmissionrepository;

	 @GetMapping("")
	    public String ViewHomePage() {
	      
	        return "/Management/Home";
	    }

	 @GetMapping("/LoginPage")
	    public String ViewLoginSignupPage() {
	      
	        return "/Management/LoginPage";
	 }
	      
	  @GetMapping("/ViewContact")
	    public String ViewContactPage() {
	      
	        return "/Management/Contact";
	    }
	  @GetMapping("/ViewAbout")
	    public String ViewAboutUsPage() {
	      
	        return "/Management/About_Us";
	    }

	  /*---------------------------------------------------------------------------------------------------------------------------------*/
	  @GetMapping("/AdminAccess")
	    public String ViewAdminPage() {
	       return "/Admin/admin";
	    }
	  @GetMapping("/StudentModule")
	  public String ViewStudentModule() {
		  return "/Admin/StudentModule";   
		}
	  @GetMapping("/GetRegistrationForm")
	  public String showForm(Model model) {  
		  model.addAttribute("registration_form", new  Registration_Form ());
	      return "/Admin/Student_Registration";
		}
	  @PostMapping("/RegisterProcessing")
	  public String ViewRegistersuccessful(@ModelAttribute("registration_form")Registration_Form registration_form) {
		  regformrepository.save(registration_form);
		  return "/Admin/Registration_Success";
	  }
	  @GetMapping("/ViewAllStudent")
	   public String listStudents(Model model) {
		   model.addAttribute("registration_form",regformservice.getRegistrations());
		   return "/Admin/All_Student_Data";
	   }
	  @GetMapping("/student/edit/{Register_Number}")
	  public String editStudentForm(@PathVariable int Register_Number,Model model) {
		  model.addAttribute("registration_form",regformservice.getStudentById(Register_Number));
		  return "/Admin/Edit_Student";
	  }	 
	  @PostMapping("/Student/{Register_Number}")
	  public String updateStudent(@PathVariable int Register_Number ,
		  @ModelAttribute("registration_form") Registration_Form registration_form) {
		   Registration_Form existRegistrationForm = regformservice.getStudentById(Register_Number);
		   existRegistrationForm.setRegister_Number(Register_Number);
		   existRegistrationForm.setStudent_Name(registration_form.getStudent_Name());
		   existRegistrationForm.setDepartment(registration_form.getDepartment());
		   existRegistrationForm.setBatch(registration_form.getBatch());
		   existRegistrationForm.setDate_Of_Birth(registration_form.getDate_Of_Birth());
		   existRegistrationForm.setBlood_Group(registration_form.getBlood_Group());
		   existRegistrationForm.setAddress(registration_form.getAddress());
		   existRegistrationForm.setGender(registration_form.getGender());
		   existRegistrationForm.setFather_Name(registration_form.getFather_Name());
		   existRegistrationForm.setMother_Name(registration_form.getMother_Name());
		   existRegistrationForm.setContact_Number(registration_form.getContact_Number());
		   existRegistrationForm.setParent_Contact_Number(registration_form.getParent_Contact_Number());
		   existRegistrationForm.setEmail(registration_form.getEmail());
		   existRegistrationForm.setMarks(registration_form.getMarks());
		   existRegistrationForm.setAttendance(registration_form.getAttendance());
		   existRegistrationForm.setGrade(registration_form.getGrade());
		   existRegistrationForm.setResult(registration_form.getResult());
		   existRegistrationForm.setFees(registration_form.getFees());
		   existRegistrationForm.setLast_Updated(registration_form.getLast_Updated());
		   regformservice.updateRegForm(existRegistrationForm);
		   return "/Admin/UpdateInfo";  
	  } 
	  @GetMapping("student/{Register_Number}")
	  public String deleteStudent(@PathVariable int Register_Number) {
		  regformservice.deletestudentById(Register_Number);
		 return "/Admin/StudentDeleteInfo";
	  }
	  
/*-------------*/
	  
	  @GetMapping("/FacultyModule")
	  public String ViewStaffModule() {
		  return "/Admin/FacultyModule";
	  }
	  @GetMapping("/GetFacultyRegistrationForm")
	  public String showFacultyForm(Model model) {
	  	    model.addAttribute("staff_registration", new Staff_Registration ());
	  	    return "/Admin/Faculty_Registration";    
	  }
	  @PostMapping("/Registration_Process")
	  public String ViewRegistersuccessful(@ModelAttribute("staff_registration")Staff_Registration staff_registration) {
	  	staffadmissionrepository.save(staff_registration);
	  	  return "/Admin/Faculty_Registration_Successful";
	  }
	  @GetMapping("/ViewAllFaculty") 
	  public String listStaff(Model model) {
	  	   model.addAttribute("staff_registration",staffadmissionservice.getStaffDetails());
	  	   return "/Admin/All_Faculty_Data";
	  }
	  @GetMapping("/faculty/edit/{Faculty_Id}")
	  public String editFacultyForm(@PathVariable int Faculty_Id,Model model) {
		  model.addAttribute("staff_registration",staffadmissionservice.getStaffDetailById(Faculty_Id));
		  return "/Admin/Edit_Faculty";
	  }
	  @PostMapping("/Faculty/{Faculty_Id}")
	  public String updateFaculty(@PathVariable int Faculty_Id ,
		  @ModelAttribute("staff_registration")Staff_Registration staff_registration ) {
		   Staff_Registration  existStaffRegform = staffadmissionservice.getStaffDetailById(Faculty_Id);
		   existStaffRegform.setFaculty_Id(Faculty_Id);
		   existStaffRegform.setFaculty_Name( staff_registration.getFaculty_Name());
		   existStaffRegform.setDesignation( staff_registration.getDesignation());
		   existStaffRegform.setEducational_Qualification( staff_registration.getEducational_Qualification());
		   existStaffRegform.setDate_Of_Birth( staff_registration.getDate_Of_Birth());
		   existStaffRegform.setBlood_Group( staff_registration.getBlood_Group());
		   existStaffRegform.setAddress( staff_registration.getAddress());
		   existStaffRegform.setGender( staff_registration.getGender());
		   existStaffRegform.setContact_Number( staff_registration.getContact_Number());
		   existStaffRegform.setEmail(staff_registration.getEmail());
		   existStaffRegform.setSalary(staff_registration.getSalary());
		   existStaffRegform.setLast_Updated(staff_registration.getLast_Updated()); 
		   staffadmissionservice.updateFacultyRegForm(existStaffRegform);
		   return "/Admin/FacultyUpdateInfo";
		   }
	  @GetMapping("faculty/{Faculty_Id}")
	  public String deleteFaculty(@PathVariable int Faculty_Id) {
		  staffadmissionservice.deletefacultyById(Faculty_Id);
		 return "/Admin/FacultyDeleteInfo";
	  }
	  
	  /*----------------------------------------------------------------------------------------------------------------------------------------*/
	  @GetMapping("/gobackfaculty")
	    public String backtofaculty() {
	      
	        return "/Faculty/faculty";
	    }
	  @GetMapping("/ViewAllStudentByFaculty") 
	   public String listofallStudents(Model model) {
		   model.addAttribute("registration_form",regformservice.getRegistrations());
		   return "/Faculty/AllStdData";
	   }
	  @GetMapping("/student/editbyfaculty/{Register_Number}")
	  public String editStudent(@PathVariable int Register_Number,Model model) {
		  model.addAttribute("registration_form",regformservice.getStudentById(Register_Number));
		  return "/Faculty/EditStudentDet";
	  }
	  @PostMapping("/StudentByfaculty/{Register_Number}")
	  public String updateStudentByfaculty(@PathVariable int Register_Number ,
		  @ModelAttribute("registration_form") Registration_Form registration_form) {
		   Registration_Form existRegistrationForm = regformservice.getStudentById(Register_Number);
		   existRegistrationForm.setMarks(registration_form.getMarks());
		   existRegistrationForm.setAttendance(registration_form.getAttendance());
		   existRegistrationForm.setGrade(registration_form.getGrade());
		   existRegistrationForm.setResult(registration_form.getResult());
		   existRegistrationForm.setFees(registration_form.getFees());
		   existRegistrationForm.setLast_Updated(registration_form.getLast_Updated());
		   regformservice.updateRegForm(existRegistrationForm);
		   return "/Faculty/StudentUpdateByFaculty";  
	  }
	  //use to view faculty data by faculty
	  @GetMapping("/ViewAllFacultybyFaculty") 
	  public String listFaculty(Model model) {
	  	   model.addAttribute("staff_registration",staffadmissionservice.getStaffDetails());
	  	   return "/Faculty/AllFacultyData";
	  } 
	  @GetMapping("/faculty/view/{Faculty_Id}")
	  public String ViewFacultyForm(@PathVariable int Faculty_Id,Model model) {
		  model.addAttribute("staff_registration",staffadmissionservice.getStaffDetailById(Faculty_Id));
		  return "/Faculty/View_Faculty";
	  }
	  
	  /*-------------------------------------------------------------------------------------------------------------------------------*/
	  
	  @GetMapping("/ViewAllStudentBystudent")
	   public String list_Of_Students(Model model) {
		  model.addAttribute("registration_form",regformservice.getRegistrations());
		   return "/Student/AllStudentData";  
	   }
	  @GetMapping("/student/ViewByStudent/{Register_Number}")
	  public String ViewStudent(@PathVariable int Register_Number,Model model) {
		  model.addAttribute("registration_form",regformservice.getStudentById(Register_Number));
		  return "/Student/ViewStudent";
	  }	
}
