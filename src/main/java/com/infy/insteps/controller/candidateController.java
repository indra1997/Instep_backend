package com.infy.insteps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.infy.insteps.dto.candidateDTO;
import com.infy.insteps.exception.instepException;
import com.infy.insteps.service.candidateService;


@RestController
@RequestMapping(value = "/instep")
public class candidateController {

	@Autowired
	private candidateService candidateService;

	@Autowired
	private Environment environment;

	@GetMapping(value = "/candidates")
	public ResponseEntity<List<candidateDTO>> getAllCandidates() throws instepException {
		List<candidateDTO> candidateList = candidateService.getAllCandidates();
		return new ResponseEntity<>(candidateList, HttpStatus.OK);
	}

	@GetMapping(value = "/candidates/{candidateId}")
	public ResponseEntity<candidateDTO> getCandidate(@PathVariable Integer candidateId) throws instepException {
		candidateDTO candidate = candidateService.getCandidate(candidateId);
		return new ResponseEntity<>(candidate, HttpStatus.OK);
	}

	@PostMapping(value = "/candidates")
	public ResponseEntity<String> addCandidate(@RequestBody candidateDTO candidate) throws instepException {
		Integer candidateId = candidateService.addCandidate(candidate);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + candidateId;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}

}

