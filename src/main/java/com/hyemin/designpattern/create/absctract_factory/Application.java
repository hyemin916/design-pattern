package com.hyemin.designpattern.create.absctract_factory;

import com.hyemin.designpattern.create.absctract_factory.buttons.Button;
import com.hyemin.designpattern.create.absctract_factory.checkboxes.Checkbox;
import com.hyemin.designpattern.create.absctract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
