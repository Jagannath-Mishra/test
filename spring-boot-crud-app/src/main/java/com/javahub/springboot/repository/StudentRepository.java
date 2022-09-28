package com.javahub.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javahub.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
