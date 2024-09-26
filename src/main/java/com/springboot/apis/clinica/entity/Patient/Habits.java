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
@Table(name = "habits")
public class Habits implements Serializable {

	private static final long serialVersionUID = -3348452100635861661L;
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private boolean smoking;

	@Column(name = "alcohol_consumption")
	private String alcoholConsumption;

	@Column(name = "physical_activity")
	private String physicalActivity;

	public Habits(Long id, boolean smoking, String alcoholConsumption, String physicalActivity) {
		super();
		this.id = id;
		this.smoking = smoking;
		this.alcoholConsumption = alcoholConsumption;
		this.physicalActivity = physicalActivity;
	}

	public Habits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public String getAlcoholConsumption() {
		return alcoholConsumption;
	}

	public void setAlcoholConsumption(String alcoholConsumption) {
		this.alcoholConsumption = alcoholConsumption;
	}

	public String getPhysicalActivity() {
		return physicalActivity;
	}

	public void setPhysicalActivity(String physicalActivity) {
		this.physicalActivity = physicalActivity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
