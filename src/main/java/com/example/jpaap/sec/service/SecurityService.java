package com.example.jpaap.sec.service;

import com.example.jpaap.sec.entities.AppRole;
import com.example.jpaap.sec.entities.AppUser;

public interface SecurityService {
    AppUser saveNewUser(String username, String password, String rePassword);
    AppRole saveNewRole(String roleName, String description);
    void addRoleToUser(String username, String roleName);
    void removeRoleToFromUser(String username, String roleName);
    AppUser loadByUserName(String username);
}
