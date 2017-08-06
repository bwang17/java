package com.codingdojo.pokemon;

public class Pokemon {
    private String name;
    private String type;
    private int health;
    private static int count;

    public Pokemon (String name, String type, int health) {
        this.health = health;
        this.type = type;
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void setCount(int count) {
        Pokemon.count = count;
    }

    public static int getCount() {
        return count;
    }

}
