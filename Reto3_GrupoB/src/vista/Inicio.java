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
	public Inicio() {
		setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("TERMIBUS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(159, 30, 142, 69);
		add(lblNewLabel);
		
		JButton btnAccederInicio = new JButton("Acceder");
		btnAccederInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Termibus.ocultarInicio();
			Termibus.mostrarLogin();
			}
		});
		btnAccederInicio.setBounds(83, 196, 89, 23);
		add(btnAccederInicio);
		
		JButton btnRegistrarseInicio = new JButton("Registrarse");
		btnRegistrarseInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Termibus.ocultarInicio();
				Termibus.mostrarRegistro();
			}
		});
		btnRegistrarseInicio.setBounds(268, 196, 89, 23);
		add(btnRegistrarseInicio);

	}

}
