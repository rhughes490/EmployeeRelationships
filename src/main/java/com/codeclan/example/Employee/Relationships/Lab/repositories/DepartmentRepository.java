package com.codeclan.example.Employee.Relationships.Lab.repositories;

import com.codeclan.example.Employee.Relationships.Lab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
