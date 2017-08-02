package com.codingdojo.zookeeper;

public class Gorilla extends com.codingdojo.zookeeper.Mammal {
    public void throwSomething() {
        this.energyLevel = energyLevel - 5;
        System.out.println("Throw something!!!!");
    }

    public void eatBanana() {
        this.energyLevel = energyLevel + 10;
        System.out.println("Banana! Yummmm");
    }

    public void climb() {
        this.energyLevel = energyLevel - 10;
        System.out.println("Climbed a tree");
    }


}
