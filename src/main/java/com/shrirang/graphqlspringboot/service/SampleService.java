package com.shrirang.graphqlspringboot.service;

import java.util.List;

import com.shrirang.graphqlspringboot.entity.Experiment;
import com.shrirang.graphqlspringboot.entity.Sample;
public interface SampleService {
	
	List<Sample> findAllSample();

	Sample createSample(Sample sample);

	Sample findbyId(Integer id);
	
	List<Sample> getSamples(Experiment experiment);


}
