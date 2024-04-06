
package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 2, 6, isManual, "race", 4);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);
            setCurrentSpeed(0);
//            return;
        } else if (newSpeed > 250){
//            super.changeSpeed(newSpeed, super.getCurrentDirection());
            changeGear(6);
            setCurrentSpeed(newSpeed);
//            return;
        } else if (newSpeed > 200){
//            super.changeSpeed(newSpeed, super.getCurrentDirection());
            changeGear(5);
            setCurrentSpeed(newSpeed);
            return;
        } else if (newSpeed > 150){
//            super.changeSpeed(newSpeed, super.getCurrentDirection());
            changeGear(4);
            setCurrentSpeed(newSpeed);
        } else if (newSpeed > 100){
//            super.changeSpeed(newSpeed, super.getCurrentDirection());
            changeGear(3);
            setCurrentSpeed(newSpeed);
        }
        else if (newSpeed > 50){
            changeGear(2);
            setCurrentSpeed(newSpeed);
//            super.changeSpeed(newSpeed, super.getCurrentDirection());
        } else if(newSpeed > 0) {
//            super.changeSpeed(newSpeed, super.getCurrentDirection());
            changeGear(1);
            setCurrentSpeed(newSpeed);
        }
    }
}