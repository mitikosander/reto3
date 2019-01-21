package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setBounds(128, 127, 46, 14);
		add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(192, 124, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(128, 169, 60, 14);
		add(lblPassword);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(26, 243, 89, 23);
		add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(339, 243, 89, 23);
		add(btnAceptar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(193, 166, 85, 17);
		add(passwordField);

	}

}
