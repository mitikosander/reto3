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
		
		JScrollPane sPNombreLineaParadas = new JScrollPane();
		sPNombreLineaParadas.setBounds(101, 60, 220, 183);
		add(sPNombreLineaParadas);
		
		JLabel lblNombreDeLinea = new JLabel("Nombre de linea");
		sPNombreLineaParadas.setColumnHeaderView(lblNombreDeLinea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(320, 60, 17, 183);
		add(scrollBar);
		
		JComboBox cBOrigenParadas = new JComboBox();
		cBOrigenParadas.setBounds(152, 280, 114, 20);
		add(cBOrigenParadas);
		cBOrigenParadas.addItem("Origen");
		cBOrigenParadas.setToolTipText("");
		
		JComboBox cBDestinoParadas = new JComboBox();
		cBDestinoParadas.setBounds(152, 311, 114, 20);
		add(cBDestinoParadas);
		cBDestinoParadas.addItem("Destino");
		cBOrigenParadas.setToolTipText("");
		
		JRadioButton rdbtnIdaVueltaParadas = new JRadioButton("Ida/Vuelta");
		rdbtnIdaVueltaParadas.setBounds(152, 348, 109, 23);
		add(rdbtnIdaVueltaParadas);
		
		JButton btnCancelarParadas = new JButton("Cancelar");
		btnCancelarParadas.setBounds(23, 407, 89, 23);
		add(btnCancelarParadas);
		
		JButton btnAceptarParadas = new JButton("Aceptar");
		btnAceptarParadas.setBounds(349, 407, 89, 23);
		add(btnAceptarParadas);
		

	}
}
