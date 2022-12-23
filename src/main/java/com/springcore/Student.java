package com.springcore;

public class Student {
    private int studentId;
    private String StudentName;
    private String StudentAddress;
    
	public int getStudentId() {
		
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setting student Id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		
		return StudentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting student Name");
		StudentName = studentName;
	}
	public String getStudentAddress() {
		
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("setting student Address");
		StudentAddress = studentAddress;
	}
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}
	
	
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	
	
	
    
}
