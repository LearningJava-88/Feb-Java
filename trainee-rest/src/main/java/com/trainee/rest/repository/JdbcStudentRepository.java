package com.trainee.rest.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.trainee.rest.model.Student;

@Repository
public class JdbcStudentRepository implements StudentRepository {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public int save(Student student) {
    return jdbcTemplate.update("INSERT INTO students (fullname, classstudying, passorfail) VALUES(?,?,?)",
        new Object[] { student.getFullname(), student.getClassstudying(), student.isPassorfail() });
  }

  @Override
  public int update(Student student) {
    return jdbcTemplate.update("UPDATE students SET fullname=?, classstudying=?, passorfail=? WHERE id=?",
        new Object[] { student.getFullname(), student.getClassstudying(), student.isPassorfail() , student.getId() });
  }

  @Override
  public Student findById(Long id) {
    try {
      Student student = jdbcTemplate.queryForObject("SELECT * FROM students WHERE id=?",
          BeanPropertyRowMapper.newInstance(Student.class), id);

      return student;
    } catch (IncorrectResultSizeDataAccessException e) {
      return null;
    }
  }

  @Override
  public int deleteById(Long id) {
    return jdbcTemplate.update("DELETE FROM students WHERE id=?", id);
  }

  @Override
  public List<Student> findAll() {
    return jdbcTemplate.query("SELECT * from students", BeanPropertyRowMapper.newInstance(Student.class));
  }

  @Override
  public List<Student> findByPassorfail(boolean passorfail) {
    return jdbcTemplate.query("SELECT * from students WHERE passorfail=?",
        BeanPropertyRowMapper.newInstance(Student.class), passorfail);
  }

  @Override
  public List<Student> findByFullname(String fullname) {
    String q = "SELECT * from students WHERE fullname LIKE '%" + fullname + "%'";

    return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Student.class));
  }

  @Override
  public int deleteAll() {
    return jdbcTemplate.update("DELETE from students");
  }
}
