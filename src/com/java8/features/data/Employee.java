package com.java8.features.data;

import java.util.List;

/**
 * @author GAURAV KUMAR
 *
 */
public class Employee {
	private String name;
	private String level;
	private double ctc;
	private String gender;
	private List<String> skills;
	
	
	public Employee(String name, String level, double ctc, String gender, List<String> skills) {
		super();
		this.name = name;
		this.level = level;
		this.ctc = ctc;
		this.gender = gender;
		this.skills = skills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", level=" + level + ", ctc=" + ctc + ", gender=" + gender + ", skills="
				+ skills + "]";
	}


}
