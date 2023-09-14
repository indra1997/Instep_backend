package com.infy.insteps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.insteps.entity.Candidate;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Integer> {

}
