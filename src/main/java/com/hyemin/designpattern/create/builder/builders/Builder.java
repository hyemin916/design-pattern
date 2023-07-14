package com.hyemin.designpattern.create.builder.builders;

import com.hyemin.designpattern.create.builder.cars.CarType;
import com.hyemin.designpattern.create.builder.components.Engine;
import com.hyemin.designpattern.create.builder.components.GPSNavigator;
import com.hyemin.designpattern.create.builder.components.Transmission;
import com.hyemin.designpattern.create.builder.components.TripComputer;

public interface Builder {
    void carType(CarType type);
    void seats(int seats);
    void engine(Engine engine);
    void transmission(Transmission transmission);
    void tripComputer(TripComputer tripComputer);
    void gpsNavigator(GPSNavigator gpsNavigator);
}
