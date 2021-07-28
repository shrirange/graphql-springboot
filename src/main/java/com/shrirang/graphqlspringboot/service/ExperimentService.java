package com.shrirang.graphqlspringboot.service;

import java.util.List;

import com.shrirang.graphqlspringboot.entity.Experiment;

public interface ExperimentService {

	List<Experiment> findAllExperiments();

	Experiment createExperiment(Experiment experiment);

	Experiment findbyId(Integer id);

	Experiment updateExperiment(Experiment experiment);

	String deleteExperiment(Integer experimentID);

}
