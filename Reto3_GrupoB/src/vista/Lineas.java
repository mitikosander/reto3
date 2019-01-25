package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Lineas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton  btnCancelarLineas;
	/**
	 * Create the panel.
	 */
	public Lineas() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		 btnCancelarLineas = new JButton("Cancelar");
		btnCancelarLineas.setBounds(200, 421, 89, 23);
		add(btnCancelarLineas);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBounds(150, 151, 195, 20);
		add(comboBox);
		

	}
}
