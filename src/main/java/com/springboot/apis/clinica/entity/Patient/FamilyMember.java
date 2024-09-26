package com.springboot.apis.clinica.entity.Patient;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "family_members")
public class FamilyMember implements Serializable {

    private static final long serialVersionUID = -3920481470697376208L;

    @JsonIgnore
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
	
	@ManyToOne
    @JoinColumn(name = "family_history_id", nullable = false)
	@JsonBackReference
	private FamilyHistory familyHistory;

	private String relation;
	
	private List<String> conditions;

	
	
	
	
	
	public FamilyMember() {
		super();
		// TODO Auto-generated constructor stub
	}




	public FamilyMember(Long id, FamilyHistory familyHistory, String relation, List<String> conditions) {
		super();
		this.id = id;
		this.familyHistory = familyHistory;
		this.relation = relation;
		this.conditions = conditions;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public FamilyHistory getFamilyHistory() {
		return familyHistory;
	}




	public void setFamilyHistory(FamilyHistory familyHistory) {
		this.familyHistory = familyHistory;
	}




	public String getRelation() {
		return relation;
	}




	public void setRelation(String relation) {
		this.relation = relation;
	}




	public List<String> getConditions() {
		return conditions;
	}




	public void setConditions(List<String> conditions) {
		this.conditions = conditions;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	
	
	
}
