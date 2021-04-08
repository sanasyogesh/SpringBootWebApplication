package org.practice.SpringBootWebApplication.model;

import java.util.Arrays;

public class UserDetails {

	private String firstName;
	private String lastName;
	private String gender;
	private String[] hobbies;
	private String education;
		
	public UserDetails() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", hobbies="
				+ Arrays.toString(hobbies) + ", education=" + education + "]";
	}
		
}
