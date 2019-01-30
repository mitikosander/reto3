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
	public JScrollPane sPNombreLineaParadas;
	public JComboBox<String> cBOrigenParadas,cBDestinoParadas;
	public JRadioButton rdbtnIdaVueltaParadas;
	public JButton btnCancelarParadas,btnAceptarParadas;
	

	/**
	 * Create the panel.
	 */
	public Paradas() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		 sPNombreLineaParadas = new JScrollPane();
		sPNombreLineaParadas.setBounds(116, 60, 220, 183);
		add(sPNombreLineaParadas);
		
		JLabel lblNombreDeLinea = new JLabel("Nombre de linea");
		sPNombreLineaParadas.setColumnHeaderView(lblNombreDeLinea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(336, 60, 17, 183);
		add(scrollBar);
		
		 cBOrigenParadas = new JComboBox<String>();
		cBOrigenParadas.setBounds(163, 297, 114, 20);
		add(cBOrigenParadas);
		cBOrigenParadas.addItem("Origen");
		cBOrigenParadas.setToolTipText("");
		
		cBDestinoParadas = new JComboBox<String>();
		cBDestinoParadas.setBounds(163, 364, 114, 20);
		add(cBDestinoParadas);
		cBDestinoParadas.addItem("Destino");
		cBOrigenParadas.setToolTipText("");
		
		rdbtnIdaVueltaParadas = new JRadioButton("Ida/Vuelta");
		rdbtnIdaVueltaParadas.setBounds(183, 416, 109, 23);
		add(rdbtnIdaVueltaParadas);
		
		btnCancelarParadas = new JButton("Cancelar");
		btnCancelarParadas.setBounds(31, 466, 89, 23);
		add(btnCancelarParadas);
		
		btnAceptarParadas = new JButton("Aceptar");
		btnAceptarParadas.setBounds(382, 466, 89, 23);
		add(btnAceptarParadas);
		

	}
}
