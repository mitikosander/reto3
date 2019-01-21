package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JButton;


public class Paradas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Paradas() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(101, 60, 220, 183);
		add(scrollPane);
		
		JLabel lblNombreDeLinea = new JLabel("Nombre de linea");
		scrollPane.setColumnHeaderView(lblNombreDeLinea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(320, 60, 17, 183);
		add(scrollBar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(152, 280, 114, 20);
		add(comboBox);
		comboBox.addItem("Origen");
		comboBox.setToolTipText("");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(152, 311, 114, 20);
		add(comboBox_1);
		comboBox_1.addItem("Destino");
		comboBox.setToolTipText("");
		
		JRadioButton rdbtnIdavuelt = new JRadioButton("Ida/Vuelta");
		rdbtnIdavuelt.setBounds(152, 348, 109, 23);
		add(rdbtnIdavuelt);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(23, 407, 89, 23);
		add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(349, 407, 89, 23);
		add(btnAceptar);
		

	}
}
