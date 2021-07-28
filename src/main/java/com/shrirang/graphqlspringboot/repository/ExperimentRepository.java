package com.shrirang.graphqlspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shrirang.graphqlspringboot.entity.Experiment;

@Repository
public interface ExperimentRepository extends  JpaRepository<Experiment, Integer>{

}
