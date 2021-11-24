package com.qustion1;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
        luxuryCar();
    }

    private void luxuryCar() {
        System.out.print("Adding features of Sports Car");
    }
}
