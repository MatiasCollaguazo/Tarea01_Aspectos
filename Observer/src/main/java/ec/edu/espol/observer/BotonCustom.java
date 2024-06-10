package main.java.ec.edu.espol.observer;

import javax.swing.JButton;

public class BotonCustom extends JButton{
	public BotonCustom(String text) {
		super(text);
		this.addActionListener(e -> {
			click();
		});
	}
	public void click() {}
}
