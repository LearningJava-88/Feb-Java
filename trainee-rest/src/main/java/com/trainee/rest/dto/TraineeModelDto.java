package com.trainee.rest.dto;

public class TraineeModelDto {
	
	private Integer id;
	
	private Integer empid;
	
	private String proj;

	private String effDate;

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
