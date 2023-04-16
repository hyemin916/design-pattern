package com.hyemin.designpattern.create;

import org.springframework.stereotype.Component;

@Component
public class CreateClient {
    private final Logistics logistics;

    public void run() {
        Transport transport = logistics.createTransport();
        transport.log();
    }
}
