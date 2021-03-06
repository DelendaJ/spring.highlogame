package com.zipcodewilmington.bakery.models;

import javax.persistence.*;

@Entity
public class HiLoPlayer extends CardPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    @OneToOne
    Hand hand
            ;
    @OneToOne
    Account account;

    public HiLoPlayer(){

    }

    public HiLoPlayer(Account account, String name, String name1, Hand hand, Account account1) {
        super(account, name);
        this.name = name1;
        this.hand = hand;
        this.account = account1;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Hand getHand() {
        return hand;
    }

    @Override
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public Account getAccount() {
        return account;
    }

    @Override
    public void setAccount(Account account) {
        this.account = account;
    }
}
