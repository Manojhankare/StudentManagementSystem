package com.stuman.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stuman.pro.entity.Student;

 
public interface StudentRepository extends JpaRepository<Student,Long>{
	 

}
