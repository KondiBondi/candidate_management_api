package com.kondibondi.candidate_management_api.controller;

import com.kondibondi.candidate_management_api.model.no_sql.CandidateNote;
import com.kondibondi.candidate_management_api.service.CandidateNoteService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notes")
public class CandidateNoteController {

    @Autowired
    private CandidateNoteService candidateNoteService;

    @PostMapping
    public CandidateNote createCandidateNote(@RequestBody CandidateNote candidateNote) {
        return candidateNoteService.create(candidateNote);
    }
}