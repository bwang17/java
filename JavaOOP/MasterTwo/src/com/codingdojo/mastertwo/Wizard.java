package com.codingdojo.mastertwo;

public class Wizard extends Human{
    private int health = 50;
    private int intelligence = 8;

    public void heal(Human human) {
        System.out.println("Healing");
        human.health = human.health + intelligence;
    }

    public void fireball(Human human) {
        System.out.println("Fireball");
        human.health = human.health - (intelligence * 3);
    }

}
