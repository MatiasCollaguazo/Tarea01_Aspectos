package main.java.ec.edu.espol.observer;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.image.DirectColorModel;

public class PanelCustom extends JPanel {

    public PanelCustom() {
    	super();
        setBackground(Color.gray);
    }
    public void changeColor(String bgColor) {
    	Color color = null;

        try {
            // Intentar decodificar el color como hexadecimal
            color = Color.decode(bgColor);
        } catch (NumberFormatException e) {
            // Si falla, intentar utilizar el nombre del color
            switch (bgColor.toLowerCase()) {
                case "red":
                    color = Color.RED;
                    break;
                case "orange":
                    color = Color.ORANGE;
                    break;
                case "yellow":
                    color = Color.YELLOW;
                    break;
                default:
                    System.out.println("Color desconocido: " + bgColor);
            }
        }

        if (color != null) {
            setBackground(color);
        } else {
            System.out.println("No se pudo cambiar el color. Color especificado: " + bgColor);
        }
    }
    
}