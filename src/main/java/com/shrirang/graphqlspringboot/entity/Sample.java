package com.shrirang.graphqlspringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Sample")
@Table(name = "Sample")
public class Sample {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sampleId;
	
	@Column(name = "sampleName")
	private String sampleName;
	
	@Column(name = "sampleType")
	private String sampleType;
	
	@Column(name = "sampleDescription")
	private String sampleDescription;
	
	@ManyToOne
	private Experiment experiment;
	

	public Integer getSampleId() {
		return sampleId;
	}

	public void setSampleId(Integer sampleId) {
		this.sampleId = sampleId;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getSampleType() {
		return sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	
	public String getSampleDescription() {
		return sampleDescription;
	}

	public void setSampleDescription(String sampleDescription) {
		this.sampleDescription = sampleDescription;
	}

	public Experiment getExperiment() {
		return experiment;
	}

	public void setExperiment(Experiment experiment) {
		this.experiment = experiment;
	}
	   

}
