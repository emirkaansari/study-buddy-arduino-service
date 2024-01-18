package com.example.arduinoservice.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "arduino")
public class Arduino {
    @Id
    @GeneratedValue
    private UUID id;
    private String userId;
    private Date lastSeen;
    private Boolean registered;
    private Integer streakCount;
}
