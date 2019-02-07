package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

public class Login extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField tFLogin, tFLogin_Pass;

	public JButton btnCancelarLogin, btnAceptarLogin;
	public JLabel lblErrorDeRegistro;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setBounds(128, 227, 46, 14);
		add(lblLogin);
		
		tFLogin = new JTextField();
		tFLogin.setBounds(192, 224, 86, 20);
		add(tFLogin);
		tFLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(111, 302, 79, 14);
		add(lblPassword);
		
		 btnCancelarLogin = new JButton("Cancelar");
		btnCancelarLogin.setBounds(32, 446, 89, 23);
		add(btnCancelarLogin);
		
		 btnAceptarLogin = new JButton("Aceptar");
		
		btnAceptarLogin.setBounds(367, 446, 89, 23);
		add(btnAceptarLogin);
		
		tFLogin_Pass = new JTextField();
		tFLogin_Pass.setBounds(192, 299, 85, 20);
		add(tFLogin_Pass);
		
		lblErrorDeRegistro = new JLabel("Error de registro");
		lblErrorDeRegistro.setForeground(Color.RED);
		lblErrorDeRegistro.setBounds(188, 363, 112, 16);
		lblErrorDeRegistro.setVisible(false);
		add(lblErrorDeRegistro);

	}

}
