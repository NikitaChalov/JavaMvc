package org.chalov.journalkr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.chalov.journalkr.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}