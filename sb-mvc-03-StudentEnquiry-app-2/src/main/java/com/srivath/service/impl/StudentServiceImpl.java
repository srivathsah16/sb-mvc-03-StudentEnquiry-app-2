package com.srivath.service.impl;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srivath.binding.StudentDto;
import com.srivath.entity.Student;
import com.srivath.repositpry.StudentRepo;
import com.srivath.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
//	@Autowired
//	private ModelMapper mapper;

	@Override
	public Boolean saveStudent(StudentDto studentDto) {
		Student studentEntity = new Student();
		BeanUtils.copyProperties(studentDto, studentEntity);
		studentEntity.setTimings(Arrays.toString(studentDto.getTimings()));
		studentRepo.save(studentEntity);
		return true;
	}

	@Override
	public List<String> getGender() {
		return Arrays.asList("Male", "Female");
	}

	@Override
	public List<String> getCourses() {
		return Arrays.asList("Java", "Python", "AWS", "ReactJS", "Devops");
	}

	@Override
	public List<String> getTimings() {
		return Arrays.asList("Morning", "Afternoon", "Evening");
	}

}
