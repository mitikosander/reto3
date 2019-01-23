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
	private JTextField tFLogin;
	private JPasswordField pFLogin;
	public JButton btnCancelarLogin, btnAceptarLogin;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setBounds(128, 127, 46, 14);
		add(lblLogin);
		
		tFLogin = new JTextField();
		tFLogin.setBounds(192, 124, 86, 20);
		add(tFLogin);
		tFLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(128, 169, 60, 14);
		add(lblPassword);
		
		 btnCancelarLogin = new JButton("Cancelar");
		btnCancelarLogin.setBounds(26, 243, 89, 23);
		add(btnCancelarLogin);
		
		 btnAceptarLogin = new JButton("Aceptar");
		
		btnAceptarLogin.setBounds(339, 243, 89, 23);
		add(btnAceptarLogin);
		
		pFLogin = new JPasswordField();
		pFLogin.setBounds(193, 166, 85, 17);
		add(pFLogin);

	}

}
