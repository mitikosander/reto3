package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	
		
		logotermi = new JLabel("TERMIBUS");
		logotermi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		logotermi.setBounds(159, 30, 142, 69);
		add(logotermi);
		
		 btnAccederInicio = new JButton("Acceder");
		btnAccederInicio.setBounds(83, 196, 89, 23);
		add(btnAccederInicio);
		
		btnRegistrarseInicio = new JButton("Registrarse");
		btnRegistrarseInicio.setBounds(268, 196, 89, 23);
		add(btnRegistrarseInicio);

	}

}
