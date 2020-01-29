package com.binart.binartuser.repo;

import com.binart.binartuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
