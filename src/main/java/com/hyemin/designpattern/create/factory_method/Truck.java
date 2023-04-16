package com.hyemin.designpattern.create.factory_method;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("트럭 배송 중....");
    }
}
