package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Lineas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Lineas() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Linea 1");
		btnNewButton.setBounds(161, 60, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Linea 2");
		btnNewButton_1.setBounds(161, 100, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Linea 3");
		btnNewButton_2.setBounds(161, 134, 89, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Linea 4");
		btnNewButton_3.setBounds(161, 173, 89, 23);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cancelar");
		btnNewButton_4.setBounds(84, 249, 89, 23);
		add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Aceptar");
		btnNewButton_5.setBounds(259, 249, 89, 23);
		add(btnNewButton_5);
		

	}
}
