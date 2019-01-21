package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Pagar extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Pagar() {
		setLayout(null);
	   
		
		JLabel lblAPagar = new JLabel("A pagar : ");
		lblAPagar.setBounds(125, 49, 63, 14);
		add(lblAPagar);
		
		textField = new JTextField();
		textField.setBounds(186, 46, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblIntroducido = new JLabel("Introducido: ");
		lblIntroducido.setBounds(125, 77, 63, 14);
		add(lblIntroducido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 74, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblADevolver = new JLabel("A devolver : ");
		lblADevolver.setBounds(125, 105, 63, 14);
		add(lblADevolver);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 102, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("50");
		btnNewButton.setBounds(71, 164, 60, 23);
		add(btnNewButton);
		
		JButton button = new JButton("20");
		button.setBounds(141, 164, 60, 23);
		
		add(button);
		
		JButton button_1 = new JButton("10");
		button_1.setBounds(211, 164, 61, 23);
		add(button_1);
		
		JButton button_2 = new JButton("5");
		button_2.setBounds(287, 164, 63, 23);
		add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.setBounds(71, 198, 60, 23);
		add(button_3);
		
		JButton button_4 = new JButton("1");
		button_4.setBounds(141, 198, 60, 23);
		add(button_4);
		
		JButton button_5 = new JButton("0,5");
		button_5.setBounds(211, 198, 61, 23);
		add(button_5);
		
		JButton button_6 = new JButton("0,2");
		button_6.setBounds(287, 198, 63, 23);
		add(button_6);
		
		JButton button_7 = new JButton("0,1");
		button_7.setBounds(71, 232, 60, 23);
		add(button_7);
		
		JButton button_8 = new JButton("0,05");
		button_8.setBounds(138, 232, 63, 23);
		add(button_8);
		
		JButton button_9 = new JButton("0.02");
		button_9.setBounds(211, 232, 61, 23);
		add(button_9);
		
		JButton button_10 = new JButton("0.01");
		button_10.setBounds(287, 232, 63, 23);
		add(button_10);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(0, 277, 89, 23);
		add(btnNewButton_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(183, 277, 89, 23);
		add(btnCancelar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(361, 277, 89, 23);
		add(btnFinalizar);

	}
}
