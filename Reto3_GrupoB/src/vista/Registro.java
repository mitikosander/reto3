package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Registro extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tFNombreRegistro;
	private JTextField tfDNIRegistro;
	private JPasswordField pFContrasenyaRegistro;
	private JPasswordField pFRegistroContrasenya1;
	private JComboBox<String> cBSexoRegistro;
	private JButton btnCancelarRegistro, btnAceptarRegistro;
	private JLabel warningrepe;
	private JLabel label;
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
		
		pFContrasenyaRegistro = new JPasswordField();
		pFContrasenyaRegistro.setBounds(213, 310, 86, 20);
		add(pFContrasenyaRegistro);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a: ");
		lblRepetirContrasea.setBounds(33, 379, 119, 14);
		add(lblRepetirContrasea);
		
		pFRegistroContrasenya1 = new JPasswordField();
		pFRegistroContrasenya1.setBounds(213, 376, 86, 20);
		add(pFRegistroContrasenya1);
		
		 btnCancelarRegistro = new JButton("Cancelar");
		btnCancelarRegistro.setBounds(33, 454, 89, 23);
		add(btnCancelarRegistro);

		
		 btnAceptarRegistro = new JButton("Aceptar");
		btnAceptarRegistro.setBounds(375, 454, 89, 23);
		add(btnAceptarRegistro);
		
		 warningrepe = new JLabel("No coincide");
		warningrepe.setForeground(Color.RED);
		warningrepe.setBounds(311, 378, 86, 16);
		warningrepe.setVisible(false);
		add(warningrepe);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Registro.class.getResource("/vista/fondo3.jpg")));
		label.setBounds(0, 0, 500, 500);
		add(label);


	}
	public JTextField gettFNombreRegistro() {
		return tFNombreRegistro;
	}
	public void settFNombreRegistro(JTextField tFNombreRegistro) {
		this.tFNombreRegistro = tFNombreRegistro;
	}
	public JTextField getTfDNIRegistro() {
		return tfDNIRegistro;
	}
	public void setTfDNIRegistro(JTextField tfDNIRegistro) {
		this.tfDNIRegistro = tfDNIRegistro;
	}
	public JPasswordField getpFContrasenyaRegistro() {
		return pFContrasenyaRegistro;
	}
	public void setpFContrasenyaRegistro(JPasswordField pFContrasenyaRegistro) {
		this.pFContrasenyaRegistro = pFContrasenyaRegistro;
	}
	public JPasswordField getpFRegistroContrasenya1() {
		return pFRegistroContrasenya1;
	}
	public void setpFRegistroContrasenya1(JPasswordField pFRegistroContrasenya1) {
		this.pFRegistroContrasenya1 = pFRegistroContrasenya1;
	}
	public JComboBox<String> getcBSexoRegistro() {
		return cBSexoRegistro;
	}
	public void setcBSexoRegistro(JComboBox<String> cBSexoRegistro) {
		this.cBSexoRegistro = cBSexoRegistro;
	}
	public JButton getBtnCancelarRegistro() {
		return btnCancelarRegistro;
	}
	public void setBtnCancelarRegistro(JButton btnCancelarRegistro) {
		this.btnCancelarRegistro = btnCancelarRegistro;
	}
	public JButton getBtnAceptarRegistro() {
		return btnAceptarRegistro;
	}
	public void setBtnAceptarRegistro(JButton btnAceptarRegistro) {
		this.btnAceptarRegistro = btnAceptarRegistro;
	}
	public JLabel getWarningrepe() {
		return warningrepe;
	}
	public void setWarningrepe(JLabel warningrepe) {
		this.warningrepe = warningrepe;
	}
	
}
