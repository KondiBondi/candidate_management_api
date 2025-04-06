package com.kondibondi.candidate_management_api.service.impl;

import com.kondibondi.candidate_management_api.model.no_sql.CandidateNote;
import com.kondibondi.candidate_management_api.repository.no_sql.CandidateNoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CandidateNoteServiceImpl implements com.kondibondi.candidate_management_api.service.CandidateNoteService {

    private final CandidateNoteRepository candidateNoteRepository;

    @Override
    public CandidateNote create(CandidateNote candidateNote) {
        candidateNote.setCreatedAt(LocalDateTime.now());
        return candidateNoteRepository.save(candidateNote);
    }
}