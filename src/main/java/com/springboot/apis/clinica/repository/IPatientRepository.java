package com.springboot.apis.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.apis.clinica.entity.Patient.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long> {
	
	

}
