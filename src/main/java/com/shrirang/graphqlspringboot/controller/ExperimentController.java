package com.shrirang.graphqlspringboot.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shrirang.graphqlspringboot.dto.ExperimentDTO;
import com.shrirang.graphqlspringboot.entity.Experiment;
import com.shrirang.graphqlspringboot.repository.ExperimentRepository;

@RestController
@RequestMapping("/experiment")
public class ExperimentController {
	
	Logger logger = LoggerFactory.getLogger(ExperimentController.class);
	
	@Autowired
	private ExperimentRepository experimentRepository; 
	 
	
	@GetMapping("/listexperiments")
	public List<Experiment> getListofExperiments(){
		logger.info("getListofExperiments");
		return experimentRepository.findAll();
	}
	
	@GetMapping("/listshortexperiments")
	public List<ExperimentDTO> getShortListofExperiments(){
		logger.info("getShortListofExperiments");
	return experimentRepository.findAll().stream().map(s -> new ExperimentDTO(
			s.getExperimentID(), 
			s.getExperimentName(),
			s.getExperimentDate(),
			s.getCompleted() ) ).collect(Collectors.toList()); 
	}
	
	@PostMapping({"/create", "/update"})
	public Experiment createExperiment(@RequestBody  Experiment experiment){
		logger.info("create or update");
		return experimentRepository.save(experiment);
	}
	
	
	@PostMapping({"/delete"})
	public String deleteExperiment(@RequestParam("expID") Integer experimentID){
		 logger.info("deleteExperiment");
		 experimentRepository.deleteById(experimentID);
		 return String.format("Experiment \"%d\" deleted successfully", experimentID);
	}
	

}
