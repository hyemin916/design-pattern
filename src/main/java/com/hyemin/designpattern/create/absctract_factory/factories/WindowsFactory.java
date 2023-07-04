package com.hyemin.designpattern.create.absctract_factory.factories;

import com.hyemin.designpattern.create.absctract_factory.buttons.Button;
import com.hyemin.designpattern.create.absctract_factory.buttons.WindowsButton;
import com.hyemin.designpattern.create.absctract_factory.checkboxes.Checkbox;
import com.hyemin.designpattern.create.absctract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
