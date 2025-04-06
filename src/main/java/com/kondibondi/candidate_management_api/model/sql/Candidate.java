package com.kondibondi.candidate_management_api.model.sql;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@RequiredArgsConstructor
public abstract class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String agencyName;
}
