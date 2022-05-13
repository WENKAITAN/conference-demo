package com.wenkaitan.conferencedemo.repositories;

import com.wenkaitan.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
