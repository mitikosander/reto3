package vista;


import javax.swing.JPanel;
import javax.swing.JLabel;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class SeleccionFecha extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCancelarSeleccionFecha,btnAceptarSeleccionFecha;
	private JDateChooser dateChooser, dateChooser_1;
	private JLabel lblErrorFecha ;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public SeleccionFecha() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		JLabel lblIdaSeleccionFecha = new JLabel("Ida");
		lblIdaSeleccionFecha.setBounds(202, 95, 46, 14);
		add(lblIdaSeleccionFecha);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(202, 136, 95, 20);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		add(dateChooser);
		
	 dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(202, 262, 95, 20);
		dateChooser_1.setDateFormatString("yyyy-MM-dd");
		dateChooser_1.setEnabled(false);
		add(dateChooser_1);
		
		JLabel lblvueltaSeleccionVuelta = new JLabel("Vuelta");
		lblvueltaSeleccionVuelta.setBounds(202, 215, 75, 14);
		add(lblvueltaSeleccionVuelta);
		
		btnCancelarSeleccionFecha = new JButton("Cancelar");
		btnCancelarSeleccionFecha.setBounds(32, 382, 89, 23);
		add(btnCancelarSeleccionFecha);
		
		btnAceptarSeleccionFecha = new JButton("Aceptar");
		btnAceptarSeleccionFecha.setBounds(374, 382, 89, 23);
		add(btnAceptarSeleccionFecha);
		
		lblErrorFecha = new JLabel("fecha no valida, debe ser posterior a la ida");
		lblErrorFecha.setForeground(Color.RED);
		lblErrorFecha.setBounds(138, 335, 270, 14);
		lblErrorFecha.setVisible(false);
		add(lblErrorFecha);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(SeleccionFecha.class.getResource("/vista/fondo3.jpg")));
		label.setBounds(0, 0, 500, 500);
		add(label);

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
