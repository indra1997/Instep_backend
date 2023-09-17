package com.infy.insteps.service;

import java.util.List;

import com.infy.insteps.dto.adminDTO;
import com.infy.insteps.dto.mentorDTO;
import com.infy.insteps.exception.instepException;

public interface adminService {
	public adminDTO getAdmin(Integer customerId) throws instepException;
	public List<adminDTO> getAllAdmins() throws instepException;
	public adminDTO loginAdmin(adminDTO adminDTO)throws instepException;
	public List<mentorDTO> getMatchingMentors(String content)throws instepException;
}