package com.codingdojo.mastertwo;

public class Ninja extends Human{
    private int stealth = 10;

    public void steal(Human human) {
        System.out.println("Stealing Health");
        human.health = human.health - stealth;
        health = health + stealth;
    }
}
