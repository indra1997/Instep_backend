package com.infy.insteps.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.insteps.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
	Optional<Project> findByMentorId(Integer mentorId);
}