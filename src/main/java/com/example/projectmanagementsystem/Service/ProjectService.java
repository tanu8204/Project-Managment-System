package com.example.projectmanagementsystem.Service;

import java.util.List;
import com.example.projectmanagementsystem.Entity.Project;
import com.example.projectmanagementsystem.Exception.ResourceNotFoundException;
import com.example.projectmanagementsystem.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> getAllProjects() {
        return (List<Project>) projectRepository.findAll();
    }

    public Project getProjectById(Integer id) {
        return projectRepository.findById(Long.valueOf(id)).orElseThrow(() -> new ResourceNotFoundException("Project not found"));
    }

    public Project updateProject(Integer id, Project projectDetails) {
        Project project = getProjectById(id);
        project.setName(projectDetails.getName());
        project.setDescription(projectDetails.getDescription());
        return projectRepository.save(project);
    }

    public void deleteProject(Integer id) {
        Project project = getProjectById(id);
        projectRepository.delete(project);
    }
}
