package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Lineas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Lineas() {
		setLayout(null);
		
		JButton btnLineasLinea1 = new JButton("Linea 1");
		btnLineasLinea1.setBounds(161, 60, 89, 23);
		add(btnLineasLinea1);
		
		JButton btnLineasLinea2 = new JButton("Linea 2");
		btnLineasLinea2.setBounds(161, 100, 89, 23);
		add(btnLineasLinea2);
		
		JButton btnLineasLinea3 = new JButton("Linea 3");
		btnLineasLinea3.setBounds(161, 134, 89, 23);
		add(btnLineasLinea3);
		
		JButton btnLineasLinea4 = new JButton("Linea 4");
		btnLineasLinea4.setBounds(161, 173, 89, 23);
		add(btnLineasLinea4);
		
		JButton btnCancelarLineas = new JButton("Cancelar");
		btnCancelarLineas.setBounds(84, 249, 89, 23);
		add(btnCancelarLineas);
		
		JButton btnAceptarLineas = new JButton("Aceptar");
		btnAceptarLineas.setBounds(259, 249, 89, 23);
		add(btnAceptarLineas);
		

	}
}
