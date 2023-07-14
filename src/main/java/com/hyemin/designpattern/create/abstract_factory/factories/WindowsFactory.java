package com.hyemin.designpattern.create.abstract_factory.factories;

import com.hyemin.designpattern.create.abstract_factory.buttons.Button;
import com.hyemin.designpattern.create.abstract_factory.buttons.WindowsButton;
import com.hyemin.designpattern.create.factory_method.checkboxes.Checkbox;
import com.hyemin.designpattern.create.factory_method.checkboxes.WindowsCheckbox;

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
