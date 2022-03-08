package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int faceValue;
    private int faces;

    public void rollDice(){
        faceValue = ThreadLocalRandom.current().nextInt(1, faces+1);
    }
    public int getFaceValue(){
        return faceValue;
    }
    public Dice(int numberOfFaces){
        faces = numberOfFaces;
    }
}
