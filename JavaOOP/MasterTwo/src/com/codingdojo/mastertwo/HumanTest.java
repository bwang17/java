package com.codingdojo.mastertwo;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        human1.attack(human2);
        human2.showHealth();
        Wizard wizard = new Wizard();
        Samurai samurai = new Samurai();
        Ninja ninja = new Ninja();
        ninja.steal(wizard);
        wizard.showHealth();
        wizard.fireball(ninja);
        ninja.showHealth();
        samurai.deathBlow(ninja);
        ninja.showHealth();
        samurai.showHealth();

    }
}
