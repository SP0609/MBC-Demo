package com.fan.service;

import com.fan.model.FanModel;
import com.fan.util.DateParser;
import com.fan.util.PropertiesLoader;

import java.time.LocalDate;
import java.util.Properties;
/**
 * Service Implementation
 *
 * @author  Suman Puthran
 */
public class FanServiceImpl implements Fan{

    public static final String OFF_DAY = "OffDay";
    /**
     * This method is used to increase the fan speed.
     * @param fan FanModel
     * @return void.
     */
    public void incSpeed(FanModel fan){
        if (fan.getState().equals(Fan.OFF))
            return;
        int speed = fan.getSpeed();
        if (speed == 3)
            fan.setSpeed(0);
        else
            fan.setSpeed(++speed);

    }
    /**
     * This method is used to change the direction of the fan.
     * @param fan FanModel
     * @return void.
     */
    public void changeDirection(FanModel fan){
        if (fan.getState().equals(Fan.OFF))
            return;
        if (fan.getDirection().equals(Fan.CLOCKWISE))
            fan.setDirection(Fan.ANTI_CLOCKWISE);
        else
            fan.setDirection(Fan.CLOCKWISE);
    }
    /**
     * This method checks if the Fan is On or Off on the given input date.
     * @param  date
     * @return void.
     */
    public boolean isFanOff(LocalDate date) {
        if (date == null)
            return false;
        Properties properties = PropertiesLoader.loadProperties();
        LocalDate offDay = DateParser.parseDate(properties.getProperty(OFF_DAY));
        if (date.compareTo(offDay) == 0){
            return true;
        } else{
           return false;
        }

    }
}
