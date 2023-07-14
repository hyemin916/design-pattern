package com.hyemin.designpattern.create.abstract_factory.factories;

import com.hyemin.designpattern.create.abstract_factory.buttons.Button;
import com.hyemin.designpattern.create.factory_method.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
