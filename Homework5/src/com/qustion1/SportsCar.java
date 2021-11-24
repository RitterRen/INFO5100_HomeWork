package com.qustion1;

public class SportsCar extends CarDecorator{

    public SportsCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
        sportsCar();
    }

    private void sportsCar() {
        System.out.print("Adding features of Sports Car.");
    }
}
