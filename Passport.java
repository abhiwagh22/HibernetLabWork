package com.example.PersonAndPassport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PassportDetails")
public class Passport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passportId;
	private String passportType;

	@OneToOne
	@JoinColumn(name="pId")
	private Person person;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(int passportId, String passportType, Person person) {
		super();
		this.passportId = passportId;
		this.passportType = passportType;
		this.person = person;
	}
	
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportType() {
		return passportType;
	}
	public void setPassportType(String passportType) {
		this.passportType = passportType;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportType=" + passportType + ", person=" + person + "]";
	}
	
}