package com.example.PersonAndPassport;
import javax.persistence.CascadeType;
/* Create One to One relation between entityPerson and PassportDetails.*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PersonDetails")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	private String pName;
	private String email;
	
	@OneToOne(mappedBy="person",cascade=CascadeType.ALL)
	private Passport passport;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pId, String pName, String email, Passport passport) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.email = email;
		this.passport = passport;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", email=" + email + ", passport=" + passport + "]";
	}
	
	
}