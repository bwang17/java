package com.codingdojo.mastertwo;

public class Human {
    protected int health = 100;
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;

    public void attack(Human human) {
       human.health = human.health - strength;
    }

    public void showHealth() {
        System.out.println("Health level is " + health);
    }

}
