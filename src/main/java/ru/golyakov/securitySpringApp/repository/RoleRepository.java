package ru.golyakov.securitySpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.golyakov.securitySpringApp.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}