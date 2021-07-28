package com.shrirang.graphqlspringboot.resolver;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shrirang.graphqlspringboot.entity.Experiment;
import com.shrirang.graphqlspringboot.service.ExperimentService;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Component
@GraphQLApi
public class ExperimentResolver {
	
	Logger logger = LoggerFactory.getLogger(ExperimentResolver.class);
	
	@Autowired
	private ExperimentService experimentService;
	
	@GraphQLMutation(name = "createExperiment")
	public Experiment createExperiment(@GraphQLArgument(name="details") Experiment experiment) {
		logger.info("Creating experiment");
		return experimentService.createExperiment(experiment);
		
	}
	
	@GraphQLMutation(name = "updateExperiment")
	public Experiment updateExperiment(@GraphQLArgument(name="details") Experiment experiment) {
		return experimentService.updateExperiment(experiment);
		
	}
	
	@GraphQLMutation(name = "deleteExperiment")
	public String deleteExperiment(@GraphQLArgument(name="id") Integer experimentID) {
		return experimentService.deleteExperiment(experimentID);
		
	}
	
	@GraphQLQuery(name = "listExperiments")
	public List<Experiment> listExperiments(){
		logger.info("Listing experiment");
		return experimentService.findAllExperiments();
	}
	
	@GraphQLQuery(name = "getExperimentById")
	public Experiment getExperimentById(@GraphQLArgument(name = "id") Integer id) {
		logger.info("getExperimentById");
		return experimentService.findbyId(id);
	}
	

}
