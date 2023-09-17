package com.infy.insteps.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.insteps.entity.Admin;
import com.infy.insteps.entity.Candidate;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

}