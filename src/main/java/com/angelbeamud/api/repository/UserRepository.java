package com.angelbeamud.api.repository;

import com.angelbeamud.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
