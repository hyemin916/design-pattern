package com.hyemin.designpattern.create.builder.director;

import com.hyemin.designpattern.create.builder.builders.Builder;
import com.hyemin.designpattern.create.builder.cars.CarType;
import com.hyemin.designpattern.create.builder.components.Engine;
import com.hyemin.designpattern.create.builder.components.GPSNavigator;
import com.hyemin.designpattern.create.builder.components.Transmission;
import com.hyemin.designpattern.create.builder.components.TripComputer;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.carType(CarType.SPORTS_CAR);
        builder.seats(2);
        builder.engine(new Engine(3.0, 0));
        builder.transmission(Transmission.SEMI_AUTOMATIC);
        builder.tripComputer(new TripComputer());
        builder.gpsNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.carType(CarType.CITY_CAR);
        builder.seats(2);
        builder.engine(new Engine(1.2, 0));
        builder.transmission(Transmission.AUTOMATIC);
        builder.tripComputer(new TripComputer());
        builder.gpsNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.carType(CarType.SUV);
        builder.seats(4);
        builder.engine(new Engine(2.5, 0));
        builder.transmission(Transmission.MANUAL);
        builder.gpsNavigator(new GPSNavigator());
    }
}
