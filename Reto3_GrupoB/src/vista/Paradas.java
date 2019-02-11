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
	private JScrollPane sPNombreLineaParadas;
	private JComboBox<String> cBOrigenParadas;
	private JComboBox<String> cBDestinoParadas;
	private JRadioButton rdbtnIdaVueltaParadas;
	private JButton btnCancelarParadas,btnAceptarParadas;
	

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


	public JScrollPane getsPNombreLineaParadas() {
		return sPNombreLineaParadas;
	}


	public void setsPNombreLineaParadas(JScrollPane sPNombreLineaParadas) {
		this.sPNombreLineaParadas = sPNombreLineaParadas;
	}


	public JComboBox<String> getcBOrigenParadas() {
		return cBOrigenParadas;
	}


	public void setcBOrigenParadas(JComboBox<String> cBOrigenParadas) {
		this.cBOrigenParadas = cBOrigenParadas;
	}


	public JComboBox<String> getcBDestinoParadas() {
		return cBDestinoParadas;
	}


	public void setcBDestinoParadas(JComboBox<String> cBDestinoParadas) {
		this.cBDestinoParadas = cBDestinoParadas;
	}


	public JRadioButton getRdbtnIdaVueltaParadas() {
		return rdbtnIdaVueltaParadas;
	}


	public void setRdbtnIdaVueltaParadas(JRadioButton rdbtnIdaVueltaParadas) {
		this.rdbtnIdaVueltaParadas = rdbtnIdaVueltaParadas;
	}


	public JButton getBtnCancelarParadas() {
		return btnCancelarParadas;
	}


	public void setBtnCancelarParadas(JButton btnCancelarParadas) {
		this.btnCancelarParadas = btnCancelarParadas;
	}


	public JButton getBtnAceptarParadas() {
		return btnAceptarParadas;
	}


	public void setBtnAceptarParadas(JButton btnAceptarParadas) {
		this.btnAceptarParadas = btnAceptarParadas;
	}
	
}
