
CREATE TABLE arduino (
                         id UUID PRIMARY KEY,
                         user_id VARCHAR(255) NOT NULL,
                         last_seen TIMESTAMP,
                         registered BOOLEAN NOT NULL DEFAULT FALSE,
                         streak_count INTEGER,
                         CONSTRAINT uk_user_id UNIQUE (user_id)
);

CREATE TABLE study_session (
                               id SERIAL PRIMARY KEY,
                               arduino_id UUID NOT NULL,
                               duration BIGINT,
                               CONSTRAINT fk_study_session_arduino
                                   FOREIGN KEY (arduino_id)
                                       REFERENCES arduino(id)
);