package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Registro extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Create the panel.
	 */
	public Registro() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre y Apellidos: ");
		lblNewLabel.setBounds(52, 34, 120, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(166, 31, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(121, 70, 31, 14);
		add(lblDni);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(166, 67, 86, 20);
		add(textField_1);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(121, 102, 31, 14);
		add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(166, 98, 86, 20);
		comboBox.addItem("");
		comboBox.addItem("Masculino");
		comboBox.setToolTipText("");
		comboBox.addItem("Femenino");
		comboBox.setToolTipText("");
		add(comboBox);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setBounds(89, 141, 63, 14);
		add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(166, 138, 86, 20);
		add(passwordField);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a: ");
		lblRepetirContrasea.setBounds(52, 179, 100, 14);
		add(lblRepetirContrasea);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(162, 176, 86, 20);
		add(passwordField_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(43, 246, 89, 23);
		add(btnNewButton);
		Termibus.ocultarRegistro();
		Termibus.mostrarInicio();
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(334, 246, 89, 23);
		add(btnAceptar);
		Termibus.ocultarRegistro();
		Termibus.mostrarInicio();

	}
}
