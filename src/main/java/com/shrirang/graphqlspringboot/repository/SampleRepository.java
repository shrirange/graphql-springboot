package com.shrirang.graphqlspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrirang.graphqlspringboot.entity.Sample;

public interface SampleRepository extends JpaRepository<Sample, Integer>{

}
