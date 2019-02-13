package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Inicio extends JPanel {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	//Creamos en publico la instancia para poder llamar al objeto necesario desde vista
	private JLabel logotermi;
	private JButton btnAccederInicio,btnRegistrarseInicio;
	Inicio() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		btnAccederInicio = new JButton("Acceder");
		btnAccederInicio.setBounds(58, 418, 89, 23);
		add(btnAccederInicio);
		
		btnRegistrarseInicio = new JButton("Registrarse");
		btnRegistrarseInicio.setBounds(329, 418, 102, 23);
		add(btnRegistrarseInicio);
		
		logotermi = new JLabel("TERMIBUS");
		logotermi.setIcon(new ImageIcon(Inicio.class.getResource("/vista/fondo3.jpg")));
		logotermi.setForeground(Color.RED);
		logotermi.setFont(new Font("Rod", Font.PLAIN, 75));
		logotermi.setBounds(0, 0, 500, 500);
		add(logotermi);

	}
	public JLabel getLogotermi() {
		return logotermi;
	}
	public void setLogotermi(JLabel logotermi) {
		this.logotermi = logotermi;
	}
	public JButton getBtnAccederInicio() {
		return btnAccederInicio;
	}
	public void setBtnAccederInicio(JButton btnAccederInicio) {
		this.btnAccederInicio = btnAccederInicio;
	}
	public JButton getBtnRegistrarseInicio() {
		return btnRegistrarseInicio;
	}
	public void setBtnRegistrarseInicio(JButton btnRegistrarseInicio) {
		this.btnRegistrarseInicio = btnRegistrarseInicio;
	}

	
}
