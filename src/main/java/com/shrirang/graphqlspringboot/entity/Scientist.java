package com.shrirang.graphqlspringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Scientist")
public class Scientist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	
	@Column(name = "scientistName")
	private String scientistName;

	@Column(name = "experimentID")
	private Long experimentId;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getScientistName() {
		return scientistName;
	}

	public void setScientistName(String scientistName) {
		this.scientistName = scientistName;
	}

	public Long getExperimentId() {
		return experimentId;
	}

	public void setExperimentId(Long experimentId) {
		this.experimentId = experimentId;
	}
	

}
