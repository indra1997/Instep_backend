package com.infy.insteps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.insteps.entity.Admin;
import com.infy.insteps.entity.Mentor;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Integer> {
	Iterable<Mentor> findByNameContaining(String content);

	Iterable<Mentor> findByLocationContaining(String content);

	Iterable<Mentor> findByEmailIdContaining(String content);
}
