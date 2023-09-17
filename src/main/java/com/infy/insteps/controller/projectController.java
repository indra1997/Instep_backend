package com.infy.insteps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.infy.insteps.dto.projectDTO;
import com.infy.insteps.exception.instepException;
import com.infy.insteps.service.projectService;


@RestController
@RequestMapping(value = "/instep")
@CrossOrigin("*")
public class projectController {

	@Autowired
	private projectService projectService;

	@Autowired
	private Environment environment;

	@GetMapping(value = "/projects")
	public ResponseEntity<List<projectDTO>> getAllProjects() throws instepException {
		List<projectDTO> projectList = projectService.getAllProjects();
		return new ResponseEntity<>(projectList, HttpStatus.OK);
	}

	@GetMapping(value = "/projects/{projectId}")
	public ResponseEntity<projectDTO> getProject(@PathVariable Integer projectId) throws instepException {
		projectDTO project = projectService.getProject(projectId);
		return new ResponseEntity<>(project, HttpStatus.OK);
	}

	@PostMapping(value = "/projects")
	public ResponseEntity<String> addProject(@RequestBody projectDTO project) throws instepException {
		Integer projectId = projectService.addProject(project);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + projectId;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/projects/delete")
	public ResponseEntity<String> deleteProject( @PathVariable Integer projectId) throws instepException {
		String message = projectService.deleteProject(projectId);
		
		return new ResponseEntity<>(message, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/projects/update")
	public ResponseEntity<String> updateProject(@RequestBody projectDTO project) throws instepException {
		String message  = projectService.updateProject(project);
		return new ResponseEntity<>(message, HttpStatus.CREATED);
	}
	
}

