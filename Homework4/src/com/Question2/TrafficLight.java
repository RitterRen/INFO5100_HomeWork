package com.Question2;

public class TrafficLight {
    private Integer greenRoad;

    public TrafficLight(){
        greenRoad = 1;
    }

    public void carArrived(int carId, int roadId, int direction,
                           Runnable turnGreen, Runnable crossCar){
        synchronized(greenRoad){
            if (greenRoad != roadId) {
                turnGreen.run();
                greenRoad = roadId;
            }
            crossCar.run();
        }
    }
}
