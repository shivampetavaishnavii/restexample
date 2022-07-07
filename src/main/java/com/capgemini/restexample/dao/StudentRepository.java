package com.capgemini.restexample.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.restexample.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
