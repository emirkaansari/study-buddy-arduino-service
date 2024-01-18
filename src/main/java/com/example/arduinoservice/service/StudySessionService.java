package com.example.arduinoservice.service;

import com.example.arduinoservice.dao.StudySession;
import com.example.arduinoservice.dto.StudySessionDto;
import com.example.arduinoservice.mapper.StudySessionMapper;
import com.example.arduinoservice.repository.StudySessionRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudySessionService {

    @Autowired
    private StudySessionRepository studySessionRepository;

    @Autowired
    private StudySessionMapper studySessionMapper;

    @Transactional
    public StudySessionDto addStudySession (StudySessionDto studySessionDto) {
        if (studySessionDto != null) {
            StudySession studySession = studySessionMapper.toEntity(studySessionDto);
            studySessionRepository.save(studySession);
            return studySessionMapper.toDto(studySession);
        }
        return null;
    }
}
