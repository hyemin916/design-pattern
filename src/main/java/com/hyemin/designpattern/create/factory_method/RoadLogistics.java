package com.hyemin.designpattern.create.factory_method;

import org.springframework.stereotype.Component;

@Component
public class RoadLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
