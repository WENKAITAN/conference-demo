package com.wenkaitan.conferencedemo.repositories;

import com.wenkaitan.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
