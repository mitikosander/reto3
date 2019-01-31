package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.Color;

public class Inicio extends JPanel {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	//Creamos en publico la instancia para poder llamar al objeto necesario desde vista
	public JLabel logotermi;
	public JButton btnAccederInicio,btnRegistrarseInicio;
	public Inicio() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		logotermi = new JLabel("TERMIBUS");
		logotermi.setForeground(Color.RED);
		logotermi.setFont(new Font("Rod", Font.PLAIN, 75));
		logotermi.setBounds(58, 66, 404, 139);
		add(logotermi);
		
		btnAccederInicio = new JButton("Acceder");
		btnAccederInicio.setBounds(58, 418, 89, 23);
		add(btnAccederInicio);
		
		btnRegistrarseInicio = new JButton("Registrarse");
		btnRegistrarseInicio.setBounds(329, 418, 102, 23);
		add(btnRegistrarseInicio);

	}

}
