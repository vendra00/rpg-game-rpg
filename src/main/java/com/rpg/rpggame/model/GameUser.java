package com.rpg.rpggame.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter @Getter
public class GameUser extends AbstractEntity{

    @Column(nullable = false)
    private String firstname, lastname;

    @Column(unique = true, nullable = false, name = "email")
    private EmailAddress emailAddress;

    @Column(nullable = false, name = "address")
    private Address address;

    @Column(nullable = false, name = "phone_number")
    private PhoneNumber phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "game_user_id")
    private Set<Player> accounts = new HashSet<>();




}
