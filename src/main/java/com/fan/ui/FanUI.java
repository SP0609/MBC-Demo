package com.fan.ui;

import com.fan.model.FanModel;
import com.fan.service.Fan;
import com.fan.service.FanServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;


/**
 * UI class for the Ceiling Fan
 *
 *
 * @author  Suman Puthran
 */
public class FanUI {

    Fan fanServiceImpl = new FanServiceImpl();
    FanModel fan =  new FanModel(0,Fan.CLOCKWISE,Fan.ON);

    JFrame frame = new JFrame("Ceiling Fan");
    JButton buttonSpeed = new JButton("Speed");
    JButton buttonDirection = new JButton("Direction");
    JLabel labelSpeed = new JLabel("Speed");
    JTextField textSpeed = new JTextField("0");
    JLabel labelDirection = new JLabel("Direction");
    JTextField textDirection= new JTextField(Fan.CLOCKWISE);

    /**
     * This method is used for UI Initialization
     */

    private void initialize(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JPanel centre = new JPanel();
        JPanel buttons = new JPanel();


        frame.add(centre, BorderLayout.CENTER);
        frame.add(buttons, BorderLayout.SOUTH);

        textSpeed.setEditable(false);
        textSpeed.setPreferredSize(new Dimension(40,20));

        textDirection.setPreferredSize(new Dimension(100,20));
        textDirection.setEditable(false);


        centre.add(labelSpeed);
        centre.add(textSpeed);
        centre.add(labelDirection);
        centre.add(textDirection);


        buttons.add(buttonSpeed);
        buttons.add(buttonDirection);

        frame.setVisible(true);

        LocalDate currentDate = LocalDate.now();
        if (fanServiceImpl.isFanOff(currentDate))
            fan.setState(Fan.OFF);
        else
            fan.setState(Fan.ON);

    }
    /**
     * This method is used to add the Action Listeners
     */
    private void addActionListeners(){
        buttonSpeed.addActionListener(e->{
            fanServiceImpl.incSpeed(fan);
            textSpeed.setText(String.valueOf(fan.getSpeed()));
        });

        buttonDirection.addActionListener(e->{
            fanServiceImpl.changeDirection(fan);
            textDirection.setText(fan.getDirection());
        });

    }
    public static void main(String args[]){
        FanUI fanUI = new FanUI();
        fanUI.initialize();
        fanUI.addActionListeners();

    }
}
