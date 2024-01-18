package com.example.arduinoservice.mapper;

import com.example.arduinoservice.dao.Arduino;
import com.example.arduinoservice.dao.StudySession;
import com.example.arduinoservice.dto.StudySessionDto;
import com.example.arduinoservice.service.StudySessionService;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.FIELD)
public interface StudySessionMapper {

    StudySessionDto toDto (StudySession studySession);

    @Mapping(source = "duration", target = "duration")
    @Mapping(target = "arduino.id", source = "arduinoId")
    StudySession toEntity (StudySessionDto studySessionDto);
}
