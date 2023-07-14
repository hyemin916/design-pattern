package com.hyemin.designpattern.create.builder.builders;

import com.hyemin.designpattern.create.builder.cars.Car;
import com.hyemin.designpattern.create.builder.cars.CarType;
import com.hyemin.designpattern.create.builder.components.Engine;
import com.hyemin.designpattern.create.builder.components.GPSNavigator;
import com.hyemin.designpattern.create.builder.components.Transmission;
import com.hyemin.designpattern.create.builder.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void carType(final CarType type) {
        this.type = type;
    }

    @Override
    public void seats(final int seats) {
        this.seats = seats;
    }

    @Override
    public void engine(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public void transmission(final Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void tripComputer(final TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void gpsNavigator(final GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
