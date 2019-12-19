package com.pradip.learning.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradip.learning.server.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { }
