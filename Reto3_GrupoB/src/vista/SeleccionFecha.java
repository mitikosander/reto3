package vista;


import javax.swing.JPanel;
import javax.swing.JLabel;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class SeleccionFecha extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public SeleccionFecha() {
		setLayout(null);
		
		JLabel lblIda = new JLabel("Ida");
		lblIda.setBounds(44, 32, 46, 14);
		add(lblIda);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(44, 57, 95, 20);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(297, 57, 95, 20);
		add(dateChooser_1);
		
		JLabel lblvuelta = new JLabel("Vuelta");
		lblvuelta.setBounds(297, 32, 75, 14);
		add(lblvuelta);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(34, 213, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.setBounds(303, 213, 89, 23);
		add(btnNewButton_1);

	}
}
