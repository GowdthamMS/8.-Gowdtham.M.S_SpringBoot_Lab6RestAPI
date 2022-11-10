package com.greatlearning.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.college.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByFirstNameContainsAllIgnoreCase(String firstName);

}