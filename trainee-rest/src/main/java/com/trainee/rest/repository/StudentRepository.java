package com.trainee.rest.repository;


import java.util.List;

import com.trainee.rest.model.Student;

public interface StudentRepository {
  int save(Student book);

  int update(Student student);

  Student findById(Long id);

  int deleteById(Long id);

  List<Student> findAll();

  List<Student> findByPassorfail(boolean passorfail);

  List<Student> findByFullname(String fullname);

  int deleteAll();
}
