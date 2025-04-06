package com.kondibondi.candidate_management_api.model.sql;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor @NoArgsConstructor
public class InternalCandidate extends Candidate {
    private String employeeId;
}