package com.qustion1;

public class CarDecorator implements Car{
    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar){
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
    }
}
