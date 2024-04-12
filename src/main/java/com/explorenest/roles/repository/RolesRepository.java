package com.explorenest.roles.repository;

import com.explorenest.roles.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository< Roles, Integer> {

    Optional<Roles> findOneById(Integer id);
}
