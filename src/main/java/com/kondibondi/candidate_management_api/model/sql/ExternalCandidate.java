package com.kondibondi.candidate_management_api.model.sql;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExternalCandidate extends Candidate {
    private Boolean isCurrentlyEmployed;
    private Integer noticePeriod;
}
