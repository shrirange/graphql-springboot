package com.shrirang.graphqlspringboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shrirang.graphqlspringboot.entity.Experiment;
import com.shrirang.graphqlspringboot.repository.ExperimentRepository;
import com.shrirang.graphqlspringboot.service.ExperimentService;

@Service
public class ExperimentServiceImpl implements ExperimentService {
	
	@Autowired
	private ExperimentRepository experimentRepository;
	
	public List<Experiment> findAllExperiments(){
		return experimentRepository.findAll();
	}

	@Override
	public Experiment createExperiment(Experiment experiment) {
		return experimentRepository.save(experiment);
	}
	
	@Override
	public Experiment updateExperiment(Experiment experiment) {
		return experimentRepository.save(experiment);
	}
	
	@Override
	public Experiment findbyId(Long id) {
		return experimentRepository.findById(id).get();
	}
	

	
	

}
