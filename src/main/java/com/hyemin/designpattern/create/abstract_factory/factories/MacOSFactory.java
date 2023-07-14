package com.hyemin.designpattern.create.abstract_factory.factories;

import com.hyemin.designpattern.create.abstract_factory.buttons.Button;
import com.hyemin.designpattern.create.abstract_factory.buttons.MacOSButton;
import com.hyemin.designpattern.create.factory_method.checkboxes.Checkbox;
import com.hyemin.designpattern.create.factory_method.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
