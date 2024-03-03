package com.infy.insteps.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.insteps.dto.candidateDTO;
import com.infy.insteps.entity.Candidate;
import com.infy.insteps.exception.instepException;
import com.infy.insteps.repository.CandidateRepository;



@Service(value = "candidateService")
@Transactional
public class candidateServiceImpl implements candidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	@Override
	public candidateDTO getCandidate(Integer candidateId) throws instepException {
		Optional<Candidate> optional = candidateRepository.findById(candidateId);
		Candidate candidate = optional.orElseThrow(() -> new instepException("Service.candidate_NOT_FOUND"));
		candidateDTO candidate2 = new candidateDTO();
		candidate2.setCandidateId(candidate.getCandidateId());
//		candidate2.setDateOfBirth(candidate.getDateOfBirth());
		candidate2.setEmailId(candidate.getEmailId());
//		candidate2.setGender(candidate.getGender());
		candidate2.setMobile(candidate.getMobile());
		candidate2.setName(candidate.getName());
//		candidate2.setQualification(candidate.getQualification());
		candidate2.setAcademicConcentration(candidate.getAcademicConcentration());
		candidate2.setAcademicLevel(candidate.getAcademicLevel());
		candidate2.setAcademicYear(candidate.getAcademicYear());
		candidate2.setAlternateEmail(candidate.getAlternateEmail());
		candidate2.setAlternateMobile(candidate.getAlternateMobile());
		candidate2.setAreaOfInterest(candidate.getAreaOfInterest());
		candidate2.setCgpa(candidate.getCgpa());
		candidate2.setExpectedGraduationDate(candidate.getExpectedGraduationDate());
		candidate2.setGeoRegion(candidate.getGeoRegion());
		candidate2.setInternshipLocation(candidate.getInternshipLocation());
		candidate2.setKeySkills(candidate.getKeySkills());
		candidate2.setProjectPreference(candidate.getProjectPreference());
		candidate2.setWorkAuthCountry(candidate.getWorkAuthCountry());
		return candidate2;
	}

	@Override
	public List<candidateDTO> getAllCandidates() throws instepException {
		Iterable<Candidate> candidates = candidateRepository.findAll();
		List<candidateDTO> candidatesList = new ArrayList<>();
		candidates.forEach(candidate -> {
			candidateDTO candidate2 = new candidateDTO();
			candidate2.setCandidateId(candidate.getCandidateId());
//			candidate2.setDateOfBirth(candidate.getDateOfBirth());
			candidate2.setEmailId(candidate.getEmailId());
//			candidate2.setGender(candidate.getGender());
			candidate2.setMobile(candidate.getMobile());
			candidate2.setName(candidate.getName());
//			candidate2.setQualification(candidate.getQualification());
			candidate2.setAcademicConcentration(candidate.getAcademicConcentration());
			candidate2.setAcademicLevel(candidate.getAcademicLevel());
			candidate2.setAcademicYear(candidate.getAcademicYear());
			candidate2.setAlternateEmail(candidate.getAlternateEmail());
			candidate2.setAlternateMobile(candidate.getAlternateMobile());
			candidate2.setAreaOfInterest(candidate.getAreaOfInterest());
			candidate2.setCgpa(candidate.getCgpa());
			candidate2.setExpectedGraduationDate(candidate.getExpectedGraduationDate());
			candidate2.setGeoRegion(candidate.getGeoRegion());
			candidate2.setInternshipLocation(candidate.getInternshipLocation());
			candidate2.setKeySkills(candidate.getKeySkills());
			candidate2.setProjectPreference(candidate.getProjectPreference());
			candidate2.setWorkAuthCountry(candidate.getWorkAuthCountry());
			candidate2.setInterviewScheduled("no");
			candidatesList.add(candidate2);
			
		});
//		if (candidatesList.isEmpty())
//			throw new instepException("Service.candidates_NOT_FOUND");
		return candidatesList;
	}

	@Override
	public Integer addCandidate(candidateDTO candidate) throws instepException {
		Candidate candidate2 = new Candidate();
		candidate2.setCandidateId(candidate.getCandidateId());
//		candidate2.setDateOfBirth(candidate.getDateOfBirth());
		candidate2.setEmailId(candidate.getEmailId());
//		candidate2.setGender(candidate.getGender());
		candidate2.setMobile(candidate.getMobile());
		candidate2.setName(candidate.getName());
//		candidate2.setQualification(candidate.getQualification());
		candidate2.setAcademicConcentration(candidate.getAcademicConcentration());
		candidate2.setAcademicLevel(candidate.getAcademicLevel());
		candidate2.setAcademicYear(candidate.getAcademicYear());
		candidate2.setAlternateEmail(candidate.getAlternateEmail());
		candidate2.setAlternateMobile(candidate.getAlternateMobile());
		candidate2.setAreaOfInterest(candidate.getAreaOfInterest());
		candidate2.setCgpa(candidate.getCgpa());
		candidate2.setExpectedGraduationDate(candidate.getExpectedGraduationDate());
		candidate2.setGeoRegion(candidate.getGeoRegion());
		candidate2.setInternshipLocation(candidate.getInternshipLocation());
		candidate2.setKeySkills(candidate.getKeySkills());
		candidate2.setProjectPreference(candidate.getProjectPreference());
		candidate2.setWorkAuthCountry(candidate.getWorkAuthCountry());
		Candidate candidateEntity2 = candidateRepository.save(candidate2);
		return candidateEntity2.getCandidateId();
	}

}

