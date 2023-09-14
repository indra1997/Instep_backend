package com.infy.insteps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.insteps.entity.Mentor;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Integer> {

}
