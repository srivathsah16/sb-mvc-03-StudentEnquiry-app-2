package com.srivath.service;

import java.util.List;

import com.srivath.binding.StudentDto;

public interface StudentService {
	
	public Boolean saveStudent(StudentDto dto);
	public List<String> getCourses();
	public List<String> getTimings();
	public List<String> getGender();
	
}
