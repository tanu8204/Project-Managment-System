package com.example.projectmanagementsystem.repository;

import com.example.projectmanagementsystem.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
