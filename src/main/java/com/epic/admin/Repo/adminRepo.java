package com.epic.admin.Repo;

import com.epic.admin.Entity.admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface adminRepo extends JpaRepository<admin, Integer> {
}
