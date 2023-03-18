package com.fan.service;

import com.fan.model.FanModel;

import java.time.LocalDate;
/**
 * Fan Interface
 *
 * @author  Suman Puthran
 */
public interface Fan {
    public static final String CLOCKWISE = "Clockwise";
    public static final String ANTI_CLOCKWISE = "AntiClockwise";
    public static final String ON = "On";
    public static final String OFF = "Off";

    public void incSpeed(FanModel f);
    public void changeDirection(FanModel f);
    public boolean isFanOff(LocalDate d);
}
