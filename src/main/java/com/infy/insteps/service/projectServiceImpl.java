package com.infy.insteps.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.insteps.dto.projectDTO;
import com.infy.insteps.entity.Project;

import com.infy.insteps.exception.instepException;
import com.infy.insteps.repository.ProjectRepository;




@Service(value = "projectService")
@Transactional
public class projectServiceImpl implements projectService {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public projectDTO getProject(Integer projectId) throws instepException {
		Optional<Project> optional = projectRepository.findById(projectId);
		Project project = optional.orElseThrow(() -> new instepException("Service.project_NOT_FOUND"));
		projectDTO project2 = new projectDTO();
		project2.setProjectId(project.getProjectId());
		project2.setTitle(project.getTitle());
		project2.setDescription(project.getDescription());
		project2.setLocation(project.getLocation());
		project2.setStatus(project.getStatus());
		project2.setRequiredSkills(project.getRequiredSkills());
		return project2;
	}

	@Override
	public List<projectDTO> getAllProjects() throws instepException {
		Iterable<Project> projects = projectRepository.findAll();
		List<projectDTO> projectsList = new ArrayList<>();
		projects.forEach(project -> {
			projectDTO project2 = new projectDTO();
			project2.setProjectId(project.getProjectId());
			project2.setTitle(project.getTitle());
			project2.setDescription(project.getDescription());
			project2.setLocation(project.getLocation());
			project2.setStatus(project.getStatus());
			project2.setRequiredSkills(project.getRequiredSkills());
			projectsList.add(project2);
		});
		if (projectsList.isEmpty())
			throw new instepException("Service.projects_NOT_FOUND");
		return projectsList;
	}

	@Override
	public Integer addProject(projectDTO project) throws instepException {
		Project project2 = new Project();
		project2.setProjectId(project.getProjectId());
		project2.setTitle(project.getTitle());
		project2.setDescription(project.getDescription());
		project2.setLocation(project.getLocation());
		project2.setStatus(project.getStatus());
		project2.setRequiredSkills(project.getRequiredSkills());
		Project projectEntity2 = projectRepository.save(project2);
		return projectEntity2.getProjectId();
	}

}

