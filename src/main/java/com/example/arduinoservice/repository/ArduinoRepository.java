package com.example.arduinoservice.repository;

import com.example.arduinoservice.dao.Arduino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArduinoRepository extends JpaRepository <Arduino, UUID> {

}
