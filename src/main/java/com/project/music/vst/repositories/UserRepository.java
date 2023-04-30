package com.project.music.vst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.music.vst.dto.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
}
