package com.shrirang.graphqlspringboot.service;

import org.springframework.stereotype.Service;

import com.shrirang.graphqlspringboot.entity.Experiment;
import com.shrirang.graphqlspringboot.entity.Scientist;

@Service
public interface ScientistService {
	
	public Scientist getScientist(Experiment experiment);

}
