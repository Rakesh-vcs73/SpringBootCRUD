package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	
	@Id
	private int usn;
	private String name;
	private String branch;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", branch=" + branch + "]";
	}
	
	

}
