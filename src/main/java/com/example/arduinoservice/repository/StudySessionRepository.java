package com.example.arduinoservice.repository;

import com.example.arduinoservice.dao.StudySession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudySessionRepository extends JpaRepository <StudySession, Long> {
}
