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
	public JTextField tFNombreRegistro;
	public JTextField tfDNIRegistro;
	public JPasswordField pFContraseñaRegistro;
	public JPasswordField pFRegistroContraseña1;
	public JComboBox<String> cBSexoRegistro;
	public JButton btnCancelarRegistro, btnAceptarRegistro;
	/**
	 * Create the panel.
	 */
	public Registro() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		JLabel lblNewLabel = new JLabel("Nombre y Apellidos: ");
		lblNewLabel.setBounds(55, 104, 120, 14);
		add(lblNewLabel);
		
		tFNombreRegistro = new JTextField();
		tFNombreRegistro.setBounds(213, 101, 86, 20);
		add(tFNombreRegistro);
		tFNombreRegistro.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(121, 178, 31, 14);
		add(lblDni);
		
		tfDNIRegistro = new JTextField();
		tfDNIRegistro.setColumns(10);
		tfDNIRegistro.setBounds(213, 175, 86, 20);
		add(tfDNIRegistro);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(89, 254, 63, 14);
		add(lblSexo);
		
		cBSexoRegistro = new JComboBox<String>();
		cBSexoRegistro.setBounds(213, 251, 86, 20);
		cBSexoRegistro.addItem("");
		cBSexoRegistro.addItem("Masculino");
		cBSexoRegistro.setToolTipText("");
		cBSexoRegistro.addItem("Femenino");
		cBSexoRegistro.setToolTipText("");
		add(cBSexoRegistro);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setBounds(66, 313, 86, 14);
		add(lblContrasea);
		
		pFContraseñaRegistro = new JPasswordField();
		pFContraseñaRegistro.setBounds(213, 310, 86, 20);
		add(pFContraseñaRegistro);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a: ");
		lblRepetirContrasea.setBounds(33, 379, 119, 14);
		add(lblRepetirContrasea);
		
		pFRegistroContraseña1 = new JPasswordField();
		pFRegistroContraseña1.setBounds(213, 376, 86, 20);
		add(pFRegistroContraseña1);
		
		 btnCancelarRegistro = new JButton("Cancelar");
		btnCancelarRegistro.setBounds(33, 454, 89, 23);
		add(btnCancelarRegistro);

		
		 btnAceptarRegistro = new JButton("Aceptar");
		btnAceptarRegistro.setBounds(375, 454, 89, 23);
		add(btnAceptarRegistro);


	}
}
