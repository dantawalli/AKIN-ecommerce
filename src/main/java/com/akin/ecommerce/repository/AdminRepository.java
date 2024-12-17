package com.akin.ecommerce.repository;

import com.akin.ecommerce.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
