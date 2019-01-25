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
		setBounds(100, 100, 500, 500);
		
		JLabel lblIdaSeleccionFecha = new JLabel("Ida");
		lblIdaSeleccionFecha.setBounds(201, 158, 46, 14);
		add(lblIdaSeleccionFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(201, 220, 95, 20);
		add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(201, 353, 95, 20);
		add(dateChooser_1);
		
		JLabel lblvueltaSeleccionVuelta = new JLabel("Vuelta");
		lblvueltaSeleccionVuelta.setBounds(201, 278, 75, 14);
		add(lblvueltaSeleccionVuelta);
		
		 btnCancelarSeleccionFecha = new JButton("Cancelar");
		btnCancelarSeleccionFecha.setBounds(31, 445, 89, 23);
		add(btnCancelarSeleccionFecha);
		
		 btnAceptarSeleccionFecha = new JButton("Aceptar");
		btnAceptarSeleccionFecha.setBounds(373, 445, 89, 23);
		add(btnAceptarSeleccionFecha);

	}
}
