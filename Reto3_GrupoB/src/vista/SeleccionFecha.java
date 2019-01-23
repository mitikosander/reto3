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
	public JButton btnCancelarSeleccionFecha,btnAceptarSeleccionFecha;

	/**
	 * Create the panel.
	 */
	public SeleccionFecha() {
		setLayout(null);
		
		JLabel lblIdaSeleccionFecha = new JLabel("Ida");
		lblIdaSeleccionFecha.setBounds(44, 32, 46, 14);
		add(lblIdaSeleccionFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(44, 57, 95, 20);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(297, 57, 95, 20);
		add(dateChooser_1);
		
		JLabel lblvueltaSeleccionVuelta = new JLabel("Vuelta");
		lblvueltaSeleccionVuelta.setBounds(297, 32, 75, 14);
		add(lblvueltaSeleccionVuelta);
		
		 btnCancelarSeleccionFecha = new JButton("Cancelar");
		btnCancelarSeleccionFecha.setBounds(34, 213, 89, 23);
		add(btnCancelarSeleccionFecha);
		
		 btnAceptarSeleccionFecha = new JButton("Aceptar");
		btnAceptarSeleccionFecha.setBounds(303, 213, 89, 23);
		add(btnAceptarSeleccionFecha);

	}
}
