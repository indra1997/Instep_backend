package com.infy.insteps.service;

import java.util.List;


import com.infy.insteps.dto.mentorDTO;
import com.infy.insteps.exception.instepException;

public interface mentorService {
	public mentorDTO getMentor(Integer mentorId) throws instepException;
	public List<mentorDTO> getAllMentors() throws instepException;
	public Integer addMentor(mentorDTO mentor) throws instepException;
	public mentorDTO loginMentor(mentorDTO mentor)throws instepException;
}

