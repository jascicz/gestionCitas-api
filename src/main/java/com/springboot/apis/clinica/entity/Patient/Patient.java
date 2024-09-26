package com.springboot.apis.clinica.entity.Patient;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient implements Serializable {
	
	private static final long serialVersionUID = -8715479549573645450L;
	
	
	// Atributos principales
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private String name;
	 private int age;
	 private String gender;
	 @Column(name = "birth_date")
	 private String birthDate;
	 private String address;
	 @Column(name = "phone_number")
	 private String phoneNumber;
	 private String email;
	 
	 
	 // Relacion con otras clases
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "emergency_contact_id", referencedColumnName = "id")
	 private EmergencyContact emergencyContact;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "medical_history_id", referencedColumnName = "id")
	 private MedicalHistory medicalHistory;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "family_history_id", referencedColumnName = "id")
	 private FamilyHistory familyHistory;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "habits_id", referencedColumnName = "id")
	 private Habits habits;

	public Patient(Long id, String name, int age, String gender, String birthDate, String address, String phoneNumber,
			String email, EmergencyContact emergencyContact, MedicalHistory medicalHistory, FamilyHistory familyHistory,
			Habits habits) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.emergencyContact = emergencyContact;
		this.medicalHistory = medicalHistory;
		this.familyHistory = familyHistory;
		this.habits = habits;
	}

	public Patient() {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public EmergencyContact getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(EmergencyContact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public MedicalHistory getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(MedicalHistory medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public FamilyHistory getFamilyHistory() {
		return familyHistory;
	}

	public void setFamilyHistory(FamilyHistory familyHistory) {
		this.familyHistory = familyHistory;
	}

	public Habits getHabits() {
		return habits;
	}

	public void setHabits(Habits habits) {
		this.habits = habits;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	 
	 
}





