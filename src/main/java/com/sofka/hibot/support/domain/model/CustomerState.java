package com.sofka.hibot.support.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;



import java.util.Arrays;

@AllArgsConstructor
public enum CustomerState {
    PENDING("1", "Pendiente"),
    ACTIVE("2", "Activo"),
    INACTIVE("3", "Inactivo"),
    NO_STATE("4", "Sin estado");

    private String code;
    private String name;

    Arrays.stream(CustomerState.values()){
        .filter(type -> type.getCode(equals()))
                .findFirst().orElse(NO_STATE);
    }

}
