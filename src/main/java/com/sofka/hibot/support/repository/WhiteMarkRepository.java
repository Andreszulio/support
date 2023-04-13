package com.sofka.hibot.support.repository;

import com.sofka.hibot.support.domain.model.WhiteMark;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhiteMarkRepository extends ReactiveMongoRepository<WhiteMark, String> {

}
