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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.insteps.dto.mentorDTO;
import com.infy.insteps.dto.mentorDTO;
import com.infy.insteps.exception.instepException;
import com.infy.insteps.service.mentorService;


@RestController
@RequestMapping(value = "/instep")
@CrossOrigin("*")
public class mentorController {

	@Autowired
	private mentorService mentorService;

	@Autowired
	private Environment environment;

	@GetMapping(value = "/mentors")
	public ResponseEntity<List<mentorDTO>> getAllMentors() throws instepException {
		List<mentorDTO> mentorList = mentorService.getAllMentors();
		return new ResponseEntity<>(mentorList, HttpStatus.OK);
	}

	@GetMapping(value = "/mentors/{mentorId}")
	public ResponseEntity<mentorDTO> getMentor(@PathVariable Integer mentorId) throws instepException {
		mentorDTO mentor = mentorService.getMentor(mentorId);
		return new ResponseEntity<>(mentor, HttpStatus.OK);
	}

	@PostMapping(value = "/mentors")
	public ResponseEntity<String> addMentor(@RequestBody mentorDTO mentor) throws instepException {
		Integer mentorId = mentorService.addMentor(mentor);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + mentorId;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/mentors/login")
	public ResponseEntity<mentorDTO> loginMentor(@RequestBody mentorDTO mentor) throws instepException {
		mentorDTO m = mentorService.loginMentor(mentor);
		return new ResponseEntity<>(m, HttpStatus.OK);
	}
}

