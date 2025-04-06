package com.kondibondi.candidate_management_api.model.no_sql;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "notes")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class CandidateNote {
    @Id
    private String id;
    private Long candidateId;
    private String author;
    private String content;
    private LocalDateTime createdAt;
}