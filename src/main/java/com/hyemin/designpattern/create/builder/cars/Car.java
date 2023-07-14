package com.hyemin.designpattern.create.builder.cars;

import com.hyemin.designpattern.create.builder.components.Engine;
import com.hyemin.designpattern.create.builder.components.GPSNavigator;
import com.hyemin.designpattern.create.builder.components.Transmission;
import com.hyemin.designpattern.create.builder.components.TripComputer;

public class Car {
    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;


    public Car(final CarType type,
               final int seats,
               final Engine engine,
               final Transmission transmission,
               final TripComputer tripComputer,
               final GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) this.tripComputer.setCar(this);
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getType() {
        return type;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(final double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
