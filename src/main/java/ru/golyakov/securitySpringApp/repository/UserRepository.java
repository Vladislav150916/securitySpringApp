package ru.golyakov.securitySpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.golyakov.securitySpringApp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}