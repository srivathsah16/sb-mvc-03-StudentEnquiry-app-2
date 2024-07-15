package com.srivath.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srivath.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
