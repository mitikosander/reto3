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
	private JTextField tFNombreRegistro;
	private JTextField tfDNIRegistro;
	private JPasswordField pFContraseñaRegistro;
	private JPasswordField pFRegistroContraseña1;
	public JComboBox cBSexoRegistro;
	public JButton btnCancelarRegistro, btnAceptarRegistro;
	/**
	 * Create the panel.
	 */
	public Registro() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre y Apellidos: ");
		lblNewLabel.setBounds(52, 34, 120, 14);
		add(lblNewLabel);
		
		tFNombreRegistro = new JTextField();
		tFNombreRegistro.setBounds(166, 31, 86, 20);
		add(tFNombreRegistro);
		tFNombreRegistro.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(121, 70, 31, 14);
		add(lblDni);
		
		tfDNIRegistro = new JTextField();
		tfDNIRegistro.setColumns(10);
		tfDNIRegistro.setBounds(166, 67, 86, 20);
		add(tfDNIRegistro);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(121, 102, 31, 14);
		add(lblSexo);
		
		cBSexoRegistro = new JComboBox();
		cBSexoRegistro.setBounds(166, 98, 86, 20);
		cBSexoRegistro.addItem("");
		cBSexoRegistro.addItem("Masculino");
		cBSexoRegistro.setToolTipText("");
		cBSexoRegistro.addItem("Femenino");
		cBSexoRegistro.setToolTipText("");
		add(cBSexoRegistro);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setBounds(89, 141, 63, 14);
		add(lblContrasea);
		
		pFContraseñaRegistro = new JPasswordField();
		pFContraseñaRegistro.setBounds(166, 138, 86, 20);
		add(pFContraseñaRegistro);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a: ");
		lblRepetirContrasea.setBounds(52, 179, 100, 14);
		add(lblRepetirContrasea);
		
		pFRegistroContraseña1 = new JPasswordField();
		pFRegistroContraseña1.setBounds(162, 176, 86, 20);
		add(pFRegistroContraseña1);
		
		 btnCancelarRegistro = new JButton("Cancelar");
		btnCancelarRegistro.setBounds(43, 246, 89, 23);
		add(btnCancelarRegistro);

		
		 btnAceptarRegistro = new JButton("Aceptar");
		btnAceptarRegistro.setBounds(334, 246, 89, 23);
		add(btnAceptarRegistro);


	}
}
