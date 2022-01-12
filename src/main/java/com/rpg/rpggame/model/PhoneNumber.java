package com.rpg.rpggame.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class PhoneNumber {

    @Column(nullable = false)
    private String countryCode, areaCode, localNumber;

}
