package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Login extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tFLogin;
	private JButton btnCancelarLogin, btnAceptarLogin;
	private JLabel lblErrorDeRegistro;
	private JPasswordField passwordField;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		JLabel lblLogin = new JLabel("DNI: ");
		lblLogin.setBounds(159, 116, 31, 14);
		add(lblLogin);
		
		tFLogin = new JTextField();
		tFLogin.setBounds(200, 113, 86, 20);
		add(tFLogin);
		tFLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(134, 233, 56, 14);
		add(lblPassword);
		
		 btnCancelarLogin = new JButton("Cancelar");
		btnCancelarLogin.setBounds(69, 335, 89, 23);
		add(btnCancelarLogin);
		
		 btnAceptarLogin = new JButton("Aceptar");
		
		btnAceptarLogin.setBounds(344, 335, 89, 23);
		add(btnAceptarLogin);
		
		lblErrorDeRegistro = new JLabel("Error de registro");
		lblErrorDeRegistro.setForeground(Color.RED);
		lblErrorDeRegistro.setBounds(200, 286, 112, 16);
		lblErrorDeRegistro.setVisible(false);
		add(lblErrorDeRegistro);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 229, 86, 22);
		add(passwordField);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/vista/fondo3.jpg")));
		label.setBounds(0, 0, 500, 500);
		add(label);

	}

	public JTextField gettFLogin() {
		return tFLogin;
	}

	public void settFLogin(JTextField tFLogin) {
		this.tFLogin = tFLogin;
	}

	public JButton getBtnCancelarLogin() {
		return btnCancelarLogin;
	}

	public void setBtnCancelarLogin(JButton btnCancelarLogin) {
		this.btnCancelarLogin = btnCancelarLogin;
	}

	public JButton getBtnAceptarLogin() {
		return btnAceptarLogin;
	}

	public void setBtnAceptarLogin(JButton btnAceptarLogin) {
		this.btnAceptarLogin = btnAceptarLogin;
	}

	public JLabel getLblErrorDeRegistro() {
		return lblErrorDeRegistro;
	}

	public void setLblErrorDeRegistro(JLabel lblErrorDeRegistro) {
		this.lblErrorDeRegistro = lblErrorDeRegistro;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	
}
