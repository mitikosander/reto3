package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ticket extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public Ticket() {
		setLayout(null);
		
		JLabel lblNbillete = new JLabel("N\u00BABillete:");
		lblNbillete.setBounds(48, 58, 61, 14);
		add(lblNbillete);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(109, 55, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(48, 89, 61, 14);
		add(lblFecha);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(109, 86, 86, 20);
		add(textField_1);
		
		JLabel lblLinea = new JLabel("Linea");
		lblLinea.setBounds(48, 117, 61, 14);
		add(lblLinea);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(48, 148, 61, 14);
		add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(48, 173, 61, 14);
		add(lblDestino);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(109, 114, 86, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(109, 145, 86, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(109, 170, 86, 20);
		add(textField_4);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(305, 211, 61, 14);
		add(lblPrecio);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(340, 208, 86, 20);
		add(textField_5);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(34, 253, 89, 23);
		add(btnNewButton);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBounds(305, 253, 89, 23);
		add(btnPagar);

	}
}
