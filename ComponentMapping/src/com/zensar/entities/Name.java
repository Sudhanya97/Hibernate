package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Sudhanya Mukhopadhyay
 * @creation_date Sep26,2019 14:46
 * @modification_date Sep26,2019 14:46
 * @version 1.0
 * @copyright Zenasr Technologies. All rights reserved
 * @description I'm Busy Now
 *
 */

@Embeddable
public class Name {
	@Column(name="first",length=30)
	private String firstName;
	@Column(name="middle",length=30)
	private String middleName;
	private String lastName;
	public Name() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Name(String firstName, String lastName, String middleName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}
	
	

}
