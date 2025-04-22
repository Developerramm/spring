package com.jpa.repository;

import com.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


//public interface StudentRepo extends CrudRepository<Student,Integer>
 public interface StudentRepo extends JpaRepository<Student,Integer> {
   Student findByName(String name);
   List<Student> findByAddress(String address);
}
