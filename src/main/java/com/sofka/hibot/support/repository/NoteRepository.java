package com.sofka.hibot.support.repository;

import com.sofka.hibot.support.domain.model.Note;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends ReactiveMongoRepository<Note, String> {

}
