package com.jpa.repository;

import com.jpa.entity.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepo extends CrudRepository<Student,Integer> {
}
