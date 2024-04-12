package com.explorenest.roles.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Roles {
    @Id
    private Integer id;
    private String rol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
