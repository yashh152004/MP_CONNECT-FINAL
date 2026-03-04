package com.mpconnect.service;

import com.mpconnect.entity.Project;
import com.mpconnect.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository repository;

    public List<Project> getAllProjects() {
        return repository.findAll();
    }

    public Project getProjectById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Project not found"));
    }

    public Project createProject(Project project) {
        project.setId(UUID.randomUUID().toString());
        return repository.save(project);
    }

    public Project updateProject(String id, Project updated) {
        Project project = getProjectById(id);
        if (updated.getName() != null)
            project.setName(updated.getName());
        if (updated.getCategory() != null)
            project.setCategory(updated.getCategory());
        if (updated.getStatus() != null)
            project.setStatus(updated.getStatus());
        if (updated.getProgress() != null)
            project.setProgress(updated.getProgress());
        if (updated.getBudget() != null)
            project.setBudget(updated.getBudget());
        if (updated.getVillage() != null)
            project.setVillage(updated.getVillage());
        if (updated.getSanctionOrderNo() != null)
            project.setSanctionOrderNo(updated.getSanctionOrderNo());
        if (updated.getStartDate() != null)
            project.setStartDate(updated.getStartDate());
        return repository.save(project);
    }

    public void deleteProject(String id) {
        repository.deleteById(id);
    }
}
