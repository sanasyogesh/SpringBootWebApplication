package org.practice.SpringBootWebApplication.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_data")
public class UserDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="gender")
	private String gender;
	
	/*
	 * @Column(name="hobbies") private String[] hobbies;
	 */
	
	@Column(name="education")
	private String education;
		
	public UserDetails() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	/*
	 * public String[] getHobbies() { return hobbies; } public void
	 * setHobbies(String[] hobbies) { this.hobbies = hobbies; }
	 */	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", hobbies="
		/* + Arrays.toString(hobbies) */ + ", education=" + education + "]";
	}
		
}
