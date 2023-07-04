package com.hyemin.designpattern.create.absctract_factory.factories;

import com.hyemin.designpattern.create.absctract_factory.buttons.Button;
import com.hyemin.designpattern.create.absctract_factory.buttons.MacOSButton;
import com.hyemin.designpattern.create.absctract_factory.checkboxes.Checkbox;
import com.hyemin.designpattern.create.absctract_factory.checkboxes.MacOSCheckbox;

public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
