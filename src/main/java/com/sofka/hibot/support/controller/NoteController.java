package com.sofka.hibot.support.controller;

import com.sofka.hibot.support.domain.model.Customer;
import com.sofka.hibot.support.domain.model.Note;
import com.sofka.hibot.support.domain.useCase.NoteUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/note")
@CrossOrigin(origins =  "*")
public class NoteController {

    @Autowired
    private NoteUseCase noteUseCase;

    @PostMapping
    public Mono<Note> createNote(@RequestBody Note note){
        return noteUseCase.createNote(note);
    }

    @GetMapping
    public Flux<Note> getNote() {
        return noteUseCase.getNote();
    }

    @GetMapping("/{noteId}")
    public Mono<Note> getNoteById(String noteId) {
        return noteUseCase.getNoteId(noteId);
    }
}
