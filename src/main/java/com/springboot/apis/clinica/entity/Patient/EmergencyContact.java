package com.springboot.apis.clinica.entity.Patient;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emergency_contacts")
public class EmergencyContact implements Serializable {
	
	private static final long serialVersionUID = 6695788785124210452L;


	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	private String relation;
	@Column(name= "phone_number")
	private String phoneNumber;
	private String email;
	
	
	
	
	
	
	public EmergencyContact(Long id, String name, String relation, String phoneNumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.relation = relation;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
	public EmergencyContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
