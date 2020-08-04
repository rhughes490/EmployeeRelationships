package com.codeclan.example.Employee.Relationships.Lab.repositories;

import com.codeclan.example.Employee.Relationships.Lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
