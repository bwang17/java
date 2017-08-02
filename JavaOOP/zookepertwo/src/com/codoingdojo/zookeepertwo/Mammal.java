package com.codoingdojo.zookeepertwo;

public class Mammal {
    protected int energyLevel = 100;

    public int displayEnergy() {
        System.out.println("Dragon Energy Level is " + energyLevel);
        return energyLevel;
    }
}
