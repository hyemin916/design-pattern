package com.hyemin.designpattern.create;

import com.hyemin.designpattern.create.factory_method.Logistics;
import com.hyemin.designpattern.create.factory_method.Transport;
import org.springframework.stereotype.Component;

@Component
public class CreateClient {
    private final Logistics logistics;

    public CreateClient(final Logistics logistics) {
        this.logistics = logistics;
    }

    public void run() {
        Transport transport = logistics.createTransport();
        transport.deliver();
    }
}
