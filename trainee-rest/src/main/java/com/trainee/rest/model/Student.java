package com.trainee.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

  private long id;
  private String fullname;
  private String classstudying;
  private boolean passorfail;

  

  public Student(String fullname,String classstudying,boolean passorfail){
	  this.fullname = fullname;
	  this.classstudying = classstudying;
	  this.passorfail = passorfail;
  }
  
}
