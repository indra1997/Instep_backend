package com.infy.insteps.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.insteps.dto.adminDTO;
import com.infy.insteps.dto.mentorDTO;
import com.infy.insteps.dto.adminDTO;
import com.infy.insteps.dto.adminDTO;
import com.infy.insteps.entity.Admin;
import com.infy.insteps.entity.Mentor;
import com.infy.insteps.entity.Admin;
import com.infy.insteps.exception.instepException;
import com.infy.insteps.repository.AdminRepository;
import com.infy.insteps.repository.MentorRepository;



@Service(value = "adminService")
@Transactional
public class adminServiceImpl implements adminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private MentorRepository mentorRepository;

	@Override
	public adminDTO getAdmin(Integer adminId) throws instepException {
		Optional<Admin> optional = adminRepository.findById(adminId);
		Admin admin = optional.orElseThrow(() -> new instepException("Service.admin_NOT_FOUND"));
		adminDTO admin2 = new adminDTO();
		admin2.setAdminId(admin.getAdminId());
		admin2.setName(admin.getName());
		admin2.setPassword(admin.getPassword());
		return admin2;
	}

	@Override
	public List<adminDTO> getAllAdmins() throws instepException {
		Iterable<Admin> admins = adminRepository.findAll();
		List<adminDTO> adminsList = new ArrayList<>();
		admins.forEach(admin -> {
			adminDTO admin2 = new adminDTO();
			admin2.setAdminId(admin.getAdminId());
			admin2.setName(admin.getName());
			admin2.setPassword(admin.getPassword());
			adminsList.add(admin2);
		});
		if (adminsList.isEmpty())
			throw new instepException("Service.admins_NOT_FOUND");
		return adminsList;
	}
	
	
	
	@Override
	public adminDTO loginAdmin(adminDTO admin)  throws instepException{
		Optional<Admin> optional = adminRepository.findById(admin.getAdminId());
		Admin m = optional.orElseThrow(() -> new instepException("Service.admin_NOT_FOUND"));
		if(m.getPassword().equals(admin.getPassword())) {
			adminDTO admin2 = new adminDTO();
			admin2.setAdminId(m.getAdminId());
			admin2.setPassword(m.getPassword());
			admin2.setName(m.getName());
			return admin2;
		}
		else throw new instepException("wrong password");
	}
	
	@Override
	public List<mentorDTO> getMatchingMentors(String content)throws instepException{
		List<mentorDTO> mentorsList = new ArrayList<>();
		if(content.matches("\\d+")) {
			Optional<Mentor> optional = mentorRepository.findById(Integer.parseInt(content));
			Mentor mentor = optional.orElseThrow(() -> new instepException("Service.mentor_NOT_FOUND"));
			mentorDTO mentor2 = new mentorDTO();
			mentor2.setMentorId(mentor.getMentorId());
			mentor2.setPassword(mentor.getPassword());
			mentor2.setEmailId(mentor.getEmailId());
			mentor2.setLocation(mentor.getLocation());
			mentor2.setName(mentor.getName());
			mentor2.setNoOfProjectsMentoring(mentor.getNoOfProjectsMentoring());
			mentor2.setUnit(mentor.getUnit());
			mentorsList.add(mentor2);
			if (mentorsList.isEmpty())
				throw new instepException("Service.admins_NOT_FOUND");
			return mentorsList;
		}
		else {
			
			Iterable<Mentor> mentors = mentorRepository.findByNameContaining( content);
			mentors.forEach(mentor -> {
				mentorDTO mentor2 = new mentorDTO();
				mentor2.setMentorId(mentor.getMentorId());
				mentor2.setPassword(mentor.getPassword());
				mentor2.setEmailId(mentor.getEmailId());
				mentor2.setLocation(mentor.getLocation());
				mentor2.setName(mentor.getName());
				mentor2.setNoOfProjectsMentoring(mentor.getNoOfProjectsMentoring());
				mentor2.setUnit(mentor.getUnit());
				mentorsList.add(mentor2);
			});
			
			Iterable<Mentor> mentors2 = mentorRepository.findByEmailIdContaining( content);
			mentors2.forEach(mentor -> {
				mentorDTO mentor2 = new mentorDTO();
				mentor2.setMentorId(mentor.getMentorId());
				mentor2.setPassword(mentor.getPassword());
				mentor2.setEmailId(mentor.getEmailId());
				mentor2.setLocation(mentor.getLocation());
				mentor2.setName(mentor.getName());
				mentor2.setNoOfProjectsMentoring(mentor.getNoOfProjectsMentoring());
				mentor2.setUnit(mentor.getUnit());
				mentorsList.add(mentor2);
			});
			
			Iterable<Mentor> mentors3 = mentorRepository.findByLocationContaining( content);
			mentors3.forEach(mentor -> {
				mentorDTO mentor2 = new mentorDTO();
				mentor2.setMentorId(mentor.getMentorId());
				mentor2.setPassword(mentor.getPassword());
				mentor2.setEmailId(mentor.getEmailId());
				mentor2.setLocation(mentor.getLocation());
				mentor2.setName(mentor.getName());
				mentor2.setNoOfProjectsMentoring(mentor.getNoOfProjectsMentoring());
				mentor2.setUnit(mentor.getUnit());
				mentorsList.add(mentor2);
			});
			
			return mentorsList;
			
		}
		
	}

}

