package com.hyemin.designpattern.create.absctract_factory.buttons;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
