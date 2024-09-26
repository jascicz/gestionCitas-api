package com.springboot.apis.clinica.service;

import com.springboot.apis.clinica.entity.Patient.Patient;

public interface IPatientService {
	
	public Patient findPatientById(Long id);

}
