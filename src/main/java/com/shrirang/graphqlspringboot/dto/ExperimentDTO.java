package com.shrirang.graphqlspringboot.dto;

import java.sql.Date;

public class ExperimentDTO {
	
	public ExperimentDTO(Integer experimentID, String experimentName, Date experimentDate, Boolean completed) {
		super();
		this.experimentID = experimentID;
		this.experimentName = experimentName;
		this.experimentDate = experimentDate;
		this.completed = completed;
	}
	
	public ExperimentDTO() {
		
	}

	private Integer experimentID;
	
	private String experimentName;
	
	private Date experimentDate;
	
	private Boolean completed;

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
	
	

}
