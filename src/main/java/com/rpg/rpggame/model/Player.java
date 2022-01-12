package com.rpg.rpggame.model;

import com.rpg.rpggame.enums.PlayerClass;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Player extends AbstractEntity{

    @Column(unique = true)
    private String name;

    @Column(name = "int")
    private int intelligence;

    @Column(name = "dex")
    private int dexterity;

    @Column(name = "str")
    private int strength;

    @Column(name = "class")
    private PlayerClass playerClass;

}
