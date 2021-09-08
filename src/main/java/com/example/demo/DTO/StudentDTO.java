package com.example.demo.DTO;

public class StudentDTO {

	private String name;

	private String fname;

	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", fname=" + fname + ", id=" + id + "]";
	}

}
