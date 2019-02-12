package vista;


import javax.swing.JPanel;
import javax.swing.JLabel;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.Color;

public class SeleccionFecha extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCancelarSeleccionFecha,btnAceptarSeleccionFecha;
	private JDateChooser dateChooser, dateChooser_1;
	private JLabel lblErrorFecha ;

	/**
	 * Create the panel.
	 */
	public SeleccionFecha() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		JLabel lblIdaSeleccionFecha = new JLabel("Ida");
		lblIdaSeleccionFecha.setBounds(201, 158, 46, 14);
		add(lblIdaSeleccionFecha);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(201, 220, 95, 20);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		add(dateChooser);
		
	 dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(201, 353, 95, 20);
		dateChooser_1.setDateFormatString("yyyy-MM-dd");
		dateChooser_1.setEnabled(false);
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
		
		lblErrorFecha = new JLabel("fecha no valida, debe ser posterior a la ida");
		lblErrorFecha.setForeground(Color.RED);
		lblErrorFecha.setBounds(137, 398, 243, 14);
		lblErrorFecha.setVisible(false);
		add(lblErrorFecha);

	}

	public JButton getBtnCancelarSeleccionFecha() {
		return btnCancelarSeleccionFecha;
	}

	public void setBtnCancelarSeleccionFecha(JButton btnCancelarSeleccionFecha) {
		this.btnCancelarSeleccionFecha = btnCancelarSeleccionFecha;
	}

	public JButton getBtnAceptarSeleccionFecha() {
		return btnAceptarSeleccionFecha;
	}

	public void setBtnAceptarSeleccionFecha(JButton btnAceptarSeleccionFecha) {
		this.btnAceptarSeleccionFecha = btnAceptarSeleccionFecha;
	}

	public JDateChooser getDateChooser() {
		return dateChooser;
	}

	public void setDateChooser(JDateChooser dateChooser) {
		this.dateChooser = dateChooser;
	}

	public JDateChooser getDateChooser_1() {
		return dateChooser_1;
	}

	public void setDateChooser_1(JDateChooser dateChooser_1) {
		this.dateChooser_1 = dateChooser_1;
	}

	public JLabel getLblErrorFecha() {
		return lblErrorFecha;
	}

	public void setLblErrorFecha(JLabel lblErrorFecha) {
		this.lblErrorFecha = lblErrorFecha;
	}
	
	
}
