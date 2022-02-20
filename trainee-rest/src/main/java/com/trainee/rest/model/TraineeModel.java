package com.trainee.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee_model")
public class TraineeModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="empid")
	private Integer empid;
	
	@Column(name="proj")
	private String proj;
	
	@Column(name="effdate")
	private String effDate;
	
	public TraineeModel() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getProj() {
		return proj;
	}

	public void setProj(String proj) {
		this.proj = proj;
	}

	public String getEffDate() {
		return effDate;
	}

	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}

}
