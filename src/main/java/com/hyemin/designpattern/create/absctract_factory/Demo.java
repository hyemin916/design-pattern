package com.hyemin.designpattern.create.absctract_factory;

import com.hyemin.designpattern.create.absctract_factory.factories.GUIFactory;
import com.hyemin.designpattern.create.absctract_factory.factories.MacOsFactory;
import com.hyemin.designpattern.create.absctract_factory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        final GUIFactory factory = osName.contains("mac")
                ? new MacOsFactory()
                : new WindowsFactory();
        return new Application(factory);
    }

    public static void main(final String[] args) {
        final Application app = configureApplication();
        app.paint();
    }
}
