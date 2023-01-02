package com.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.StudentOperations;
import com.model.Student;

@Controller
public class FormController {
	@Autowired
	private StudentOperations studentOperations;
	
	@RequestMapping("/home")
	public String registerFrom() {
	return "home";
	}
	
	@RequestMapping(path="/details",method=RequestMethod.POST)
	public String doRegistration(@ModelAttribute Student student,Model model)
	{
	this.studentOperations.createStudent(student);
	return "details";
	}

}


