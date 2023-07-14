package com.hyemin.designpattern.create.builder.cars;

import com.hyemin.designpattern.create.builder.components.Engine;
import com.hyemin.designpattern.create.builder.components.GPSNavigator;
import com.hyemin.designpattern.create.builder.components.Transmission;
import com.hyemin.designpattern.create.builder.components.TripComputer;

public class Manual {
    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(final CarType type,
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
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if  (tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if  (gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
