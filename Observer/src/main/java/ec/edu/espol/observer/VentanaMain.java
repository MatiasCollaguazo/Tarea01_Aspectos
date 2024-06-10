package main.java.ec.edu.espol.observer;
import javax.swing.JFrame;

public class VentanaMain {

    private JFrame frame;
    private PanelCustom customPanel;

    public VentanaMain() {
        frame = new JFrame("Ventana con Panel y Botones Personalizados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        customPanel = new PanelCustom();

        BotonCustom button1 = new BotonCustom("RED");
        BotonCustom button2 = new BotonCustom("ORANGE");
        BotonCustom button3 = new BotonCustom("YELLOW");

        customPanel.add(button1);
        customPanel.add(button2);
        customPanel.add(button3);
        button1.addObserver(customPanel);
        button2.addObserver(customPanel);
        button3.addObserver(customPanel);
        frame.add(customPanel);
    }

    public void showWindow() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
    	VentanaMain mainWindow = new VentanaMain();
        mainWindow.showWindow();
    }
}
