package com.sofka.hibot.support.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document("Customer")
public class Customer {

    @Id
    private String customerId;
    private String name;
    private List<WhiteMark> whiteMarkList;
    private CustomerState customerState;

}
