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
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Termibus.ocultarInicio();
			Termibus.mostrarLogin();
			}
		});
		btnNewButton.setBounds(83, 196, 89, 23);
		add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Termibus.ocultarInicio();
				Termibus.mostrarRegistro();
			}
		});
		btnRegistrarse.setBounds(268, 196, 89, 23);
		add(btnRegistrarse);

	}

}
