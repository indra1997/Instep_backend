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


import com.infy.insteps.dto.adminDTO;
import com.infy.insteps.dto.mentorDTO;
import com.infy.insteps.exception.instepException;
import com.infy.insteps.service.adminService;


@RestController
@RequestMapping(value = "/instep")
@CrossOrigin("*")
public class adminController {

	@Autowired
	private adminService adminService;

	@Autowired
	private Environment environment;

	@GetMapping(value = "/admins")
	public ResponseEntity<List<adminDTO>> getAllAdmins() throws instepException {
		List<adminDTO> adminList = adminService.getAllAdmins();
		return new ResponseEntity<>(adminList, HttpStatus.OK);
	}

	@GetMapping(value = "/admins/{adminId}")
	public ResponseEntity<adminDTO> getAdmin(@PathVariable Integer adminId) throws instepException {
		adminDTO admin = adminService.getAdmin(adminId);
		return new ResponseEntity<>(admin, HttpStatus.OK);
	}
	
	@PostMapping(value = "/admins/login")
	public ResponseEntity<adminDTO> loginAdmin(@RequestBody adminDTO admin) throws instepException {
		adminDTO a = adminService.loginAdmin(admin);
		return new ResponseEntity<>(a, HttpStatus.OK);
	}
	
	@GetMapping(value = "/admins/find_mentors")
	public ResponseEntity<List<mentorDTO>> getMatchingMentors(@PathVariable String content) throws instepException {
		List<mentorDTO> admin = adminService.getMatchingMentors(content);
		return new ResponseEntity<>(admin, HttpStatus.OK);
	}
	
	

}