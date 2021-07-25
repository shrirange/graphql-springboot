package com.shrirang.graphqlspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shrirang.graphqlspringboot.entity.Scientist;
@Repository
public interface ScientistRepository extends  JpaRepository<Scientist, Long>{

}

