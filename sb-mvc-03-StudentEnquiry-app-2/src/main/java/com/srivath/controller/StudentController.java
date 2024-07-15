package com.srivath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.srivath.binding.StudentDto;
import com.srivath.service.impl.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@GetMapping("/")
	public String loadIndexPage(Model model) {
		init(model);
		return "index";
	}

	@PostMapping("/save")
	public String handleSubmitButton(StudentDto dto, Model model) {
		if (studentServiceImpl.saveStudent(dto)) {
			model.addAttribute("message", "Saved to DB...");
		}
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("student", new StudentDto());
		model.addAttribute("gender", studentServiceImpl.getGender());
		model.addAttribute("courses", studentServiceImpl.getCourses());
		model.addAttribute("preferredTimings", studentServiceImpl.getTimings());
	}

}
