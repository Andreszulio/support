package com.sofka.hibot.support.domain.useCase;

import com.sofka.hibot.support.domain.model.Note;
import com.sofka.hibot.support.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class NoteUseCase {

    @Autowired
    private NoteRepository noteRepository;

    public Mono<Note> createNote (Note note){
        return  noteRepository.save(note);
    }

    public Mono<Note> getNoteId(String noteId){
        return noteRepository.findById(noteId);
    }

    public Flux<Note> getNote(){
        return noteRepository.findAll();
    }
}
