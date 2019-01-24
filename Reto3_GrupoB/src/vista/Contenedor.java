package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Contenedor {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
			public void run() {
				try {
					Contenedor window = new Contenedor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	
}
