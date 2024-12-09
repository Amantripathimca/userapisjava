package com.jpa.user.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.user.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}