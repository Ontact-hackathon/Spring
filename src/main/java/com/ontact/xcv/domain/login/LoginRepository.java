package com.ontact.xcv.domain.login;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginRepository extends JpaRepository<Login, Long> {
    List<Login> findByUserId(String userId);
}
