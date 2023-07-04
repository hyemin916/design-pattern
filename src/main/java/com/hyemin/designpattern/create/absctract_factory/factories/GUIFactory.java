package com.hyemin.designpattern.create.absctract_factory.factories;

import com.hyemin.designpattern.create.absctract_factory.buttons.Button;
import com.hyemin.designpattern.create.absctract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
