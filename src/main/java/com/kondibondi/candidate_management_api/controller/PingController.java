package com.kondibondi.candidate_management_api.controller;

import com.kondibondi.candidate_management_api.repository.no_sql.CandidateNoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class PingController {

    private final CandidateNoteRepository noteRepository;

    public PingController(CandidateNoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/ping")
    public String ping() {
        long count = noteRepository.count();
        return "Mongo OK. Notes in DB: " + count;
    }
}
