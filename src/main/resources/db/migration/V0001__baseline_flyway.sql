CREATE TABLE entity_option (
                               id BIGINT PRIMARY KEY IDENTITY(1,1),
                               type NVARCHAR(255),
                               name NVARCHAR(255),
                               identifier NVARCHAR(255),
                               parent BIGINT
);

CREATE TABLE candidate (
                           id BIGINT PRIMARY KEY IDENTITY(1,1),
                           first_name NVARCHAR(255),
                           last_name NVARCHAR(255),
                           email NVARCHAR(255),
                           phone NVARCHAR(255),
                           agency_name NVARCHAR(255),
                           current_engagement_model_type_id BIGINT,
                           CONSTRAINT FK_Candidate_Option FOREIGN KEY (current_engagement_model_type_id) REFERENCES entity_option(id)
);

CREATE TABLE job_position (
                              id BIGINT PRIMARY KEY IDENTITY(1,1),
                              title NVARCHAR(255),
                              description NVARCHAR(255),
                              location NVARCHAR(255),
                              department NVARCHAR(255)
);


CREATE TABLE external_candidate (
                                    id BIGINT PRIMARY KEY,
                                    is_currently_employed BIT,
                                    notice_period INT,
                                    CONSTRAINT FK_external_candidate_candidate FOREIGN KEY (id) REFERENCES candidate(id)
);


CREATE TABLE internal_candidate (
                                    id BIGINT PRIMARY KEY,
                                    employee_id NVARCHAR(255),
                                    CONSTRAINT FK_internal_candidate_candidate FOREIGN KEY (id) REFERENCES candidate(id)
);
