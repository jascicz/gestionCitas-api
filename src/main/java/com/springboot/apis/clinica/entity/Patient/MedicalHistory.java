package com.springboot.apis.clinica.entity.Patient;

import java.io.Serializable;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "medical_histories")
public class MedicalHistory implements Serializable {
	
	private static final long serialVersionUID = -7383031380370806624L;
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "blood_type")
	private String bloodType;
	
	@Column(name = "previous_illnesses")
	private List<String> previousIllnesses;
	

	private List<String> surgeries;
	
	
	private List<String> allergies;
	
	
	@Column(name = "current_medications")
	private List<String> currentMedications;


	
	
	public MedicalHistory() {
		super();
		// TODO Auto-generated constructor stub
	}




	public MedicalHistory(Long id, String bloodType, List<String> previousIllnesses, List<String> surgeries,
			List<String> allergies, List<String> currentMedications) {
		super();
		this.id = id;
		this.bloodType = bloodType;
		this.previousIllnesses = previousIllnesses;
		this.surgeries = surgeries;
		this.allergies = allergies;
		this.currentMedications = currentMedications;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getBloodType() {
		return bloodType;
	}




	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}




	public List<String> getPreviousIllnesses() {
		return previousIllnesses;
	}




	public void setPreviousIllnesses(List<String> previousIllnesses) {
		this.previousIllnesses = previousIllnesses;
	}




	public List<String> getSurgeries() {
		return surgeries;
	}




	public void setSurgeries(List<String> surgeries) {
		this.surgeries = surgeries;
	}




	public List<String> getAllergies() {
		return allergies;
	}




	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}




	public List<String> getCurrentMedications() {
		return currentMedications;
	}




	public void setCurrentMedications(List<String> currentMedications) {
		this.currentMedications = currentMedications;
	}
	
	
	
	
	
}
