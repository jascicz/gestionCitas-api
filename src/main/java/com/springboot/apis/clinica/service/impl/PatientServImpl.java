package com.springboot.apis.clinica.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.apis.clinica.entity.Patient.Patient;
import com.springboot.apis.clinica.repository.IPatientRepository;
import com.springboot.apis.clinica.service.IPatientService;


@Service
public class PatientServImpl implements IPatientService {

	
	@Autowired
	private IPatientRepository patientRepo;
	
	
	@Override
	public Patient findPatientById(Long id) {
		
		Optional<Patient> optionalPatient = patientRepo.findById(id);
		
		if (optionalPatient.isPresent()) {
			
			Patient patient = optionalPatient.get();
			
			return patient;
		}
		
		return null;
	}
	
	

}
