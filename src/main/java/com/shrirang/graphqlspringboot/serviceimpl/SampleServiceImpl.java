package com.shrirang.graphqlspringboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shrirang.graphqlspringboot.entity.Experiment;
import com.shrirang.graphqlspringboot.entity.Sample;
import com.shrirang.graphqlspringboot.repository.SampleRepository;
import com.shrirang.graphqlspringboot.service.SampleService;
@Service
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	private SampleRepository sampleRepository;

	@Override
	public List<Sample> findAllSample() {
		return sampleRepository.findAll();
	}

	@Override
	public Sample createSample(Sample sample) {
		return sampleRepository.save(sample);
	}

	@Override
	public Sample findbyId(Integer id) {
		return sampleRepository.findById(id).get();
	}

	@Override
	public List<Sample> getSamples(Experiment experiment) {
		return experiment.getSampleList();
	}
	
	

}
