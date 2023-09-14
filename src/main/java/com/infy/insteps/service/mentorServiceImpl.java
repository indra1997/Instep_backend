package com.infy.insteps.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.insteps.dto.mentorDTO;
import com.infy.insteps.entity.Mentor;
import com.infy.insteps.exception.instepException;
import com.infy.insteps.repository.MentorRepository;




@Service(value = "mentorService")
@Transactional
public class mentorServiceImpl implements mentorService {

	@Autowired
	private MentorRepository mentorRepository;

	@Override
	public mentorDTO getMentor(Integer mentorId) throws instepException {
		Optional<Mentor> optional = mentorRepository.findById(mentorId);
		Mentor mentor = optional.orElseThrow(() -> new instepException("Service.mentor_NOT_FOUND"));
		mentorDTO mentor2 = new mentorDTO();
		mentor2.setMentorId(mentor.getMentorId());
		mentor2.setEmailId(mentor.getEmailId());
		mentor2.setLocation(mentor.getLocation());
		mentor2.setName(mentor.getName());
		mentor2.setNoOfProjectsMentoring(mentor.getNoOfProjectsMentoring());
		mentor2.setUnit(mentor.getUnit());
		return mentor2;
	}

	@Override
	public List<mentorDTO> getAllMentors() throws instepException {
		Iterable<Mentor> mentors = mentorRepository.findAll();
		List<mentorDTO> mentorsList = new ArrayList<>();
		mentors.forEach(mentor -> {
			mentorDTO mentor2 = new mentorDTO();
			mentor2.setMentorId(mentor.getMentorId());
			mentor2.setEmailId(mentor.getEmailId());
			mentor2.setLocation(mentor.getLocation());
			mentor2.setName(mentor.getName());
			mentor2.setNoOfProjectsMentoring(mentor.getNoOfProjectsMentoring());
			mentor2.setUnit(mentor.getUnit());
			mentorsList.add(mentor2);
		});
		if (mentorsList.isEmpty())
			throw new instepException("Service.mentors_NOT_FOUND");
		return mentorsList;
	}

	@Override
	public Integer addMentor(mentorDTO mentor) throws instepException {
		Mentor mentor2 = new Mentor();
		mentor2.setMentorId(mentor.getMentorId());
		mentor2.setEmailId(mentor.getEmailId());
		mentor2.setLocation(mentor.getLocation());
		mentor2.setName(mentor.getName());
		mentor2.setNoOfProjectsMentoring(mentor.getNoOfProjectsMentoring());
		mentor2.setUnit(mentor.getUnit());
		Mentor mentorEntity2 = mentorRepository.save(mentor2);
		return mentorEntity2.getMentorId();
	}

}


