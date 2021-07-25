package com.shrirang.graphqlspringboot.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Experiment")
public class Experiment {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "experimentID")
	private Integer experimentID;
	
	@Column(name = "experimentName")
	private String experimentName;
	
	@Column(name = "experimentDate")
	private Date experimentDate;
	
	@Column(name = "completed")
	private Boolean completed;
	
	@Column(name = "samples")
	@OneToMany(fetch =  FetchType.EAGER)
	private List<Sample> sampleList;
	
	@ManyToOne
	private Experiment experiment;

	public Integer getExperimentID() {
		return experimentID;
	}

	public void setExperimentID(Integer experimentID) {
		this.experimentID = experimentID;
	}

	public String getExperimentName() {
		return experimentName;
	}

	public void setExperimentName(String experimentName) {
		this.experimentName = experimentName;
	}

	public Date getExperimentDate() {
		return experimentDate;
	}

	public void setExperimentDate(Date experimentDate) {
		this.experimentDate = experimentDate;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public List<Sample> getSampleList() {
		return sampleList;
	}

	public void setSampleList(List<Sample> sampleList) {
		this.sampleList = sampleList;
	}

	public Experiment getExperiment() {
		return experiment;
	}

	public void setExperiment(Experiment experiment) {
		this.experiment = experiment;
	}
	
}
