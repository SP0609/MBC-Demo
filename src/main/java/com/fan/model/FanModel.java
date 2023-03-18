package com.fan.model;

/**
 * Model Class for Ceiling Fan
 *
 * @author  Suman Puthran
  */
public class FanModel {

    private int speed;
    private String direction;
    private String state;

    public FanModel(int speed, String direction,String state) {
        this.speed = speed;
        this.direction = direction;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}
