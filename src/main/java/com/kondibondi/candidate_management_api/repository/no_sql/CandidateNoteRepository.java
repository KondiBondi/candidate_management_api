package com.kondibondi.candidate_management_api.repository.no_sql;

import com.kondibondi.candidate_management_api.model.no_sql.CandidateNote;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateNoteRepository extends MongoRepository<CandidateNote, String> {
}