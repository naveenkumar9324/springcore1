package com.springcore.lifecycle;

public class Example {
	private String sub;

	public String getSubject() {
		return sub;
	}

	public void setSubject(String sub) {
		this.sub = sub;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [sub=" + sub + "]";
	}
	
	

}
