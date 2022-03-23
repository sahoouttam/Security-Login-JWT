package com.example.SecurityLoginJWT.repository;

import com.example.SecurityLoginJWT.model.ERole;
import com.example.SecurityLoginJWT.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole eRole);
}
