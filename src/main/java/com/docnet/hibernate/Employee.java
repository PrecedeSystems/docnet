package com.docnet.hibernate;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EMPLOYEE1")
public class Employee {

	@Id
	@GeneratedValue
	private Long id; 
		
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	public String getname() {
		return name;
	}

	public String getemail() {
		return email;
	}
	
public Employee() {
		
	}
	public Employee(String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
	}

	public void setemail(String email) {
		this.email = email;
	}
}
	/*@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="cell_phone")
	private String cellphone;

	public Employee() {
		
	}
	
	
	public Employee(String firstname, String lastname, Date birthdate, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthdate;
		this.cellphone = phone;
		
	}
	public Long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
}
*/