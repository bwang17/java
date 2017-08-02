package com.codoingdojo.zookeepertwo;

public class DragonTest {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();

        dragon.attachTown();
        dragon.attachTown();
        dragon.attachTown();
        dragon.eatHumans();
        dragon.eatHumans();
        dragon.fly();
        dragon.fly();

        dragon.displayEnergy();

    }
}
