# MBC-Demo
This project implements a Ceiling Fan with functionality requirements as below

· One cord increases the speed each time it is pulled. There are 3 speed settings, and an “off” (speed 0) setting. If the cord is pulled on speed 3, the fan returns to the “off” setting.
· One cord reverses the direction of the fan at the current speed setting. Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
· The ceiling fan should be “off” on December 25th all day even if the cords are pulled.
· Unit is always powered (no wall switch)

The UI is implemented in Java Swing. The OffDay is configured in fan.properties file.

Usage Instructions
1. Clone the project from Git in any IDE
2. Navigate to the src\main\java\com\fan\ui\FanUI class
3. Run the class 
4. Clicking the  Speed Button increases the speed. Once it reaches 3 the speed resets to zero.
5. Clicking the Direction button reverses the direction
6. Close the UI and change system date to 25 Dec 2023. 
7. Relaunch the UI.
8. Click on speed or direction buttons. Both speed and direction is disabled.
9. Close the UI and change system date to current date or any other date.
10. Relaunch the UI.
11. Click on speed or direction buttons. Both speed and direction are enabled.
