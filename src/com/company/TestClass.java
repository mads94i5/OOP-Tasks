package com.company;

public class TestClass {

    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.runPersonTest();
        test.runDiceTest();
        test.runLampTest();
    }
    private void runPersonTest(){
        Person person = new Person("Mads Kristian Pedersen", 32);
        System.out.println(person);
        person.hasBirthday();
        System.out.println(person);
    }
    private void runDiceTest(){
        Dice dice = new Dice(6);
        String outputString = "";
        double total = 0;
        for (int i = 1; i <= 100; i++){
            dice.rollDice();
            outputString += dice.getFaceValue() + " ";
            total += dice.getFaceValue();
        }
        System.out.println(outputString);
        System.out.println("Average: " + total/100);
    }
    private void runLampTest(){
        Lamp cielingLamp = new Lamp(true);
        System.out.println("Cieling lamp is: " + cielingLamp.getOnOffState());
        Lamp bedLamp = new Lamp();
        System.out.println("Bed lamp is: " + bedLamp.getOnOffState());
        cielingLamp.pressSwitch();
        System.out.println("Cieling lamp is: " + cielingLamp.getOnOffState());
    }
}
