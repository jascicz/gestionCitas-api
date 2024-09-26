package com.springboot.apis.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.apis.clinica.entity.Patient.Patient;
import com.springboot.apis.clinica.service.IPatientService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
public class PatientController {

	@Autowired
	private IPatientService patientService;
	
	@Operation(summary = "Get a patient by ID")
	@GetMapping("/patients/{id}")
    public ResponseEntity<Patient> findPatientById(
    		@Parameter(description = "ID de la cita", required = true)
    		@PathVariable Long id) {
		
        return ResponseEntity.ok(patientService.findPatientById(id)) ;
    }
	
	
}
