package com.trainee.rest.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.rest.model.Student;
import com.trainee.rest.repository.StudentRepository;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

  @Autowired
  StudentRepository studentRepository;

  @GetMapping("/students")
  public ResponseEntity<List<Student>> getAllstudents(@RequestParam(required = false) String fullname) {
    try {
    	System.out.println("Inside get allStudents Students");
      List<Student> students = new ArrayList<Student>();

      if (fullname == null)
        studentRepository.findAll().forEach(students::add);
      else
        studentRepository.findByFullname(fullname).forEach(students::add);

      if (students.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(students, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/students/{id}")
  public ResponseEntity<Student> getstudentById(@PathVariable("id") long id) {
    Student student = studentRepository.findById(id);

    if (student != null) {
      return new ResponseEntity<>(student, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/studentinsert")
  public ResponseEntity<String> createstudent(@RequestBody Student student) {
    try {
    	System.out.println("Inserting data"+student.getFullname());
      studentRepository.save(new Student(student.getFullname(), student.getClassstudying(), false));
      return new ResponseEntity<>("inserting student done.", HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PutMapping("/students/{id}")
  public ResponseEntity<String> updatestudent(@PathVariable("id") long id, @RequestBody Student student) {
    Student students = studentRepository.findById(id);
    
    

    if (students != null) {
      students.setId(id);
      students.setClassstudying(student.getClassstudying());
      students.setFullname(student.getFullname());
      students.setPassorfail(student.isPassorfail());

      studentRepository.update(students);
      return new ResponseEntity<>("Student update done.", HttpStatus.OK);
    } else {
      return new ResponseEntity<>("Student record not found : " + id, HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/students/{id}")
  public ResponseEntity<String> deletestudent(@PathVariable("id") long id) {
    try {
    	
      int result = studentRepository.deleteById(id);
      if (result == 0) {
        return new ResponseEntity<>("Student not found" + id, HttpStatus.OK);
      }
      return new ResponseEntity<>("student record was deleted successfully.", HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>("Not deleted.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/students")
  public ResponseEntity<String> deleteAllstudents() {
    try {
      int numRows = studentRepository.deleteAll();
      return new ResponseEntity<>("Delete done " + numRows + " student(s) successfully.", HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>("Not deleted ", HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @GetMapping("/students/published")
  public ResponseEntity<List<Student>> findByPassorfail() {
    try {
      List<Student> students = studentRepository.findByPassorfail(true);

      if (students.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(students, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}
