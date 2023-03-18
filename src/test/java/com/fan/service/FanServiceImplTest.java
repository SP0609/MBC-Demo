package com.fan.service;

import com.fan.model.FanModel;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for Service Implementation
 *
 * @author  Suman Puthran
 */

class FanServiceImplTest {

    Fan fanServiceImpl = new FanServiceImpl();
    FanModel fan =  new FanModel(0,Fan.CLOCKWISE,Fan.ON);

    /**
     * This is the test method for incSpeed
     */
    @org.junit.jupiter.api.Test
    void incSpeed() {
        fanServiceImpl.incSpeed(fan);
        assertEquals(1, fan.getSpeed());
        fanServiceImpl.incSpeed(fan);
        assertEquals(2, fan.getSpeed());
        fanServiceImpl.incSpeed(fan);
        assertEquals(3, fan.getSpeed());
        fanServiceImpl.incSpeed(fan);
        assertEquals(0, fan.getSpeed());
    }
    /**
     * This is the test method for changeDirection
     */
    @org.junit.jupiter.api.Test
    void changeDirection() {
        fanServiceImpl.changeDirection(fan);
        assertEquals(Fan.ANTI_CLOCKWISE, fan.getDirection());
        fanServiceImpl.changeDirection(fan);
        assertEquals(Fan.CLOCKWISE, fan.getDirection());
    }
    /**
     * This is the test method for checking if Fan is off on Dec25
     */
    @org.junit.jupiter.api.Test
    void isFanOff() {
        LocalDate date = LocalDate.now();
        assertEquals(false, fanServiceImpl.isFanOff(date));

        LocalDate dateOff= LocalDate.of(2023, 12, 25);
        assertEquals(true, fanServiceImpl.isFanOff(dateOff));
    }
}