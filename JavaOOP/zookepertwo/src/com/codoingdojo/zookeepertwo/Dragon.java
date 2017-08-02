package com.codoingdojo.zookeepertwo;

public class Dragon extends Mammal{
    public Dragon() {
        this.energyLevel = 300;
    }

    public void fly() {
        energyLevel = energyLevel - 50;
        System.out.println("Hooo!!!");
    }

    public void eatHumans() {
        energyLevel = energyLevel + 25;
        System.out.println("So delicious, regained 25 energy");
    }

    public void attachTown() {
        energyLevel = energyLevel - 100;
        System.out.println("Boom, the town is now on fire");
    }
}
