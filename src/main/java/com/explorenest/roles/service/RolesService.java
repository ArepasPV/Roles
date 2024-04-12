package com.explorenest.roles.service;

import com.explorenest.roles.domain.Roles;
import com.explorenest.roles.repository.RolesRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolesService {
    private static RolesRepository rolesRepository;

    public static Optional<Roles> getRolesById(Integer id){
        return rolesRepository.findOneById(id);
    }
}
