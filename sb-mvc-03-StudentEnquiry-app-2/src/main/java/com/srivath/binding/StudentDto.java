package com.srivath.binding;

import lombok.Data;

@Data
public class StudentDto {
	private Integer id;
	private String name;
	private String email;
	private String gender;
	private String course;
	private String[] timings;
}
