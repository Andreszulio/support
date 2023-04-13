package com.sofka.hibot.support.domain.useCase;

import com.sofka.hibot.support.domain.model.WhiteMark;
import com.sofka.hibot.support.repository.WhiteMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WhiteMarkUseCase {

    @Autowired
    private WhiteMarkRepository whiteMarkRepository;

    public Mono<WhiteMark> createWhiteMark(WhiteMark whiteMark){
        return whiteMarkRepository.save(whiteMark);
    }

    public Mono<WhiteMark> getWhiteMarkById(String whiteMarkId){
        return whiteMarkRepository.findById(whiteMarkId);
    }

    public Flux<WhiteMark> getWhiteMark(){
        return  whiteMarkRepository.findAll();
    }
}
