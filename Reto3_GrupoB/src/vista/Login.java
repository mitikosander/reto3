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
	public JTextField tFLogin;
	public JPasswordField pFLogin;
	public JButton btnCancelarLogin, btnAceptarLogin;

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
		lblPassword.setBounds(114, 304, 60, 14);
		add(lblPassword);
		
		 btnCancelarLogin = new JButton("Cancelar");
		btnCancelarLogin.setBounds(32, 446, 89, 23);
		add(btnCancelarLogin);
		
		 btnAceptarLogin = new JButton("Aceptar");
		
		btnAceptarLogin.setBounds(367, 446, 89, 23);
		add(btnAceptarLogin);
		
		pFLogin = new JPasswordField();
		pFLogin.setBounds(192, 299, 85, 20);
		add(pFLogin);

	}

}
