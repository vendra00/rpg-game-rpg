package com.rpg.rpggame.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
@Data
public class Address {

    @Column(nullable = false)
    private String street, city, country, zipCode;
}
