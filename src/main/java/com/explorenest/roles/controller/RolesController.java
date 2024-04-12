package com.explorenest.roles.controller;

import com.explorenest.roles.domain.Roles;
import com.explorenest.roles.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("api/roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;

    @GetMapping("roles_por_id")
    public Optional<Roles> getRolesById(Integer id){
        return RolesService.getRolesById(id);
    }
}
