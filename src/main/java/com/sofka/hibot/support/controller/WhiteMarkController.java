package com.sofka.hibot.support.controller;

import com.sofka.hibot.support.domain.model.Note;
import com.sofka.hibot.support.domain.model.WhiteMark;
import com.sofka.hibot.support.domain.useCase.WhiteMarkUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/whiteMark")
@CrossOrigin(origins =  "*")
public class WhiteMarkController {

    @Autowired
    private WhiteMarkUseCase whiteMarkUseCase;

    @PostMapping
    public Mono<WhiteMark> createWhiteMark(@RequestBody WhiteMark whiteMark){
        return whiteMarkUseCase.createWhiteMark(whiteMark);
    }

    @GetMapping
    public Flux<WhiteMark> getWhiteMark() {
        return whiteMarkUseCase.getWhiteMark();
    }

    @GetMapping("/{whiteMarkId}")
    public Mono<WhiteMark> getWhiteMarkById(String whiteMarkId) {
        return whiteMarkUseCase.getWhiteMarkById(whiteMarkId);
    }
}
