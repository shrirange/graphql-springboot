package com.shrirang.graphqlspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shrirang.graphqlspringboot.entity.Sample;
import com.shrirang.graphqlspringboot.repository.SampleRepository;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@Autowired
	private SampleRepository sampleRepository; 
	 
	
	@GetMapping("/listsamples")
	public List<Sample> getListofSamples(){
		return sampleRepository.findAll();
	}
	
	@PostMapping({"/create","/update"})
	public Sample createSample(Sample sample){
		return sampleRepository.save(sample);
	}
	
	@PostMapping({"/delete"})
	public void deleteSample(Sample sample){
		 sampleRepository.delete(sample);
	}
	

}
