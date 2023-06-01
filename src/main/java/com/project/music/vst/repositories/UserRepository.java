package com.project.music.vst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.music.vst.dto.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {}
