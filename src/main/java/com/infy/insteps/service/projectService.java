package com.infy.insteps.service;

import java.util.List;

import com.infy.insteps.dto.projectDTO;
import com.infy.insteps.exception.instepException;

public interface projectService {
	public projectDTO getProject(Integer customerId) throws instepException;
	public List<projectDTO> getAllProjects() throws instepException;
	public Integer addProject(projectDTO customer) throws instepException;
}
