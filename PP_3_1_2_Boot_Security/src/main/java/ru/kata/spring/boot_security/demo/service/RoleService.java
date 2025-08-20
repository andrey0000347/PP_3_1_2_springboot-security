package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.entitys.Role;
import java.util.List;


public interface RoleService {
    List<Role> findAllRoles();
    Role findRoleById(Long id);
}
//
//@Service
//public class RoleService {
//
//    private final RoleRepository roleRepository;
//
//    public RoleService(RoleRepository roleRepository) {
//        this.roleRepository = roleRepository;
//    }
//
//    public List<Role> findAllRoles() {
//        List<Role> roles = roleRepository.findAll();
//        System.out.println("Roles found: " + roles.size());
//        return roles;
//    }
//
//    public Role findRoleById(Long id) {
//        return roleRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Role not found"));
//    }
//}
