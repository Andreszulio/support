package com.sofka.hibot.support.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document("whiteMark")
public class WhiteMark {

    @Id
    private String whiteMarkId;
    private String title;
    private String credentials;
    private String message;

}
