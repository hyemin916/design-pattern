package com.hyemin.designpattern.create.factory_method;

public class RoadLogistic implements Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
