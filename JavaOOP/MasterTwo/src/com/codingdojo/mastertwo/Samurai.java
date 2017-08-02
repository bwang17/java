package com.codingdojo.mastertwo;

public class Samurai extends Human{
    private int health = 200;
    private static int counter;

    public Samurai() {
        this.health = 200;
        counter++;
    }

    public void deathBlow(Human human) {
        human.health = 0;
        health = health / 2;
        System.out.println("德瑪西亞");
    }

    public void meditate() {
        health = health + health / 2;
    }

    public static void howMany() {
        System.out.println("There are " + counter + "Samurais");
    }

}
