package com.shrirang.graphqlspringboot.resolver;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shrirang.graphqlspringboot.entity.Experiment;
import com.shrirang.graphqlspringboot.entity.Sample;
import com.shrirang.graphqlspringboot.service.SampleService;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class SampleResolver {
	
	Logger logger = LoggerFactory.getLogger(SampleResolver.class);

	
	@Autowired
	private SampleService sampleService;
	
	@GraphQLQuery
	public List<Sample> getSampleList(@GraphQLContext Experiment experiment) {
		logger.info("getSampleList");
		return sampleService.getSamples(experiment);
	}

	
	@GraphQLMutation(name = "createSample")
	public Sample createSample(@GraphQLArgument(name="details") Sample sample) {
		logger.info("createSample");
		return sampleService.createSample(sample);
		
	}
	
	@GraphQLQuery(name = "listSamples")
	public List<Sample> listSamples(){
		logger.info("listSamples");
		return sampleService.findAllSample();
	}
	
	@GraphQLQuery(name = "getSampleById")
	public Sample getSampleById(@GraphQLArgument(name = "id") Integer id) {
		logger.info("getSampleById ");
		return sampleService.findbyId(id);
	}
}
