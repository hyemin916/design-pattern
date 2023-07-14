package com.hyemin.designpattern.create.abstract_factory;

import com.hyemin.designpattern.create.abstract_factory.buttons.Button;
import com.hyemin.designpattern.create.abstract_factory.factories.GUIFactory;
import com.hyemin.designpattern.create.factory_method.checkboxes.Checkbox;
import org.springframework.stereotype.Component;

public class AbstractFactoryClient {
    private Button button;
    private Checkbox checkbox;

    public AbstractFactoryClient(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
