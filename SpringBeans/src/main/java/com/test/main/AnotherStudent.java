package com.test.main;


	public class AnotherStudent {
		
		private String studentName;
		private String studentCourse;
		
     
		AnotherStudent(String name,String course){
			this.studentCourse=course;
			this.studentName=name;
		}
		
		

		public String getStudentName()
		{
		return studentName;
		}

		public void setStudentName(String studentName)
		{
			this.studentName = studentName;
		}

		public String getStudentCourse()
		{
			return studentCourse;
		}

		public void setStudentCourse(String studentCourse)
		{
			this.studentCourse = studentCourse;
		}

		@Override public String toString()
		{
			return "Student{"
				+ "studentName=" + studentName +
				", studentCourse=" + studentCourse + '}';
		}
	}
