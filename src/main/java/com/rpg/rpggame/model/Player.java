package com.rpg.rpggame.model;

import com.rpg.rpggame.enums.PlayerClass;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Player extends AbstractEntity{

    @Column(unique = true, nullable = false)
    private String name;

    @Column()
    private int intelligence;

    @Column()
    private int dexterity;

    @Column()
    private int strength;

    @Column(nullable = false)
    private PlayerClass playerClass;

}
