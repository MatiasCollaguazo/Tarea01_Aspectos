package main.java.ec.edu.espol.observer;

import java.awt.Color;

public aspect AspectAdic {
    pointcut changeColorExecution(String bgColor): 
        execution(void PanelCustom.changeColor(String)) && args(bgColor);

    after(String bgColor): changeColorExecution(bgColor) {
        System.out.println("Nuevo color de fondo: " + bgColor);
        System.out.println("Hora de cambio: " + new java.util.Date());
    }
}
