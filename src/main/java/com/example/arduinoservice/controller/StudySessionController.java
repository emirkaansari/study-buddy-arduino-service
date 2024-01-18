package com.example.arduinoservice.controller;

import com.example.arduinoservice.dao.StudySession;
import com.example.arduinoservice.dto.StudySessionDto;
import com.example.arduinoservice.service.StudySessionService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@Slf4j
public class StudySessionController {

    @Autowired
    private StudySessionService studySessionService;

    @PostMapping(value = "/hi", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addStudySession (@RequestBody @Validated StudySessionDto studySessionDto) {
        StudySessionDto sessionDto = studySessionService.addStudySession(studySessionDto);
        System.out.println(studySessionDto.getArduinoId());
        return ResponseEntity.ok().body("amazing");
    }
}
