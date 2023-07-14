package com.hyemin.designpattern.create.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        route = "Seoul";
    }

    public GPSNavigator(final String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
