package com.infy.insteps.service;

import java.util.List;

import com.infy.insteps.dto.candidateDTO;
import com.infy.insteps.exception.instepException;

public interface candidateService {
	public candidateDTO getCandidate(Integer customerId) throws instepException;
	public List<candidateDTO> getAllCandidates() throws instepException;
	public Integer addCandidate(candidateDTO customer) throws instepException;
}

