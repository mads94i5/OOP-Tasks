package com.company;

public class Lamp {
    boolean isOn;

    public void pressSwitch(){
        isOn = !isOn;
    }
    public boolean getOnOffState(){
        return isOn;
    }
    public Lamp(boolean isCurrentlyOn){
        isOn = isCurrentlyOn;
    }
    public Lamp(){
        isOn = false;
    }
}
