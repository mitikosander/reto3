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
	private JTextField tFNbilleteTicket;
	private JTextField tFFechaTicket;
	private JTextField tFLineaTicket;
	private JTextField tFOrigenTicket;
	private JTextField tFDestinoTicket;
	private JTextField tFPrecioTicket;

	/**
	 * Create the panel.
	 */
	public Ticket() {
		setLayout(null);
		
		JLabel lblNbillete = new JLabel("N\u00BABillete:");
		lblNbillete.setBounds(48, 58, 61, 14);
		add(lblNbillete);
		
		tFNbilleteTicket = new JTextField();
		tFNbilleteTicket.setEditable(false);
		tFNbilleteTicket.setBounds(109, 55, 86, 20);
		add(tFNbilleteTicket);
		tFNbilleteTicket.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(48, 89, 61, 14);
		add(lblFecha);
		
		tFFechaTicket = new JTextField();
		tFFechaTicket.setEditable(false);
		tFFechaTicket.setColumns(10);
		tFFechaTicket.setBounds(109, 86, 86, 20);
		add(tFFechaTicket);
		
		JLabel lblLinea = new JLabel("Linea");
		lblLinea.setBounds(48, 117, 61, 14);
		add(lblLinea);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(48, 148, 61, 14);
		add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(48, 173, 61, 14);
		add(lblDestino);
		
		tFLineaTicket = new JTextField();
		tFLineaTicket.setEditable(false);
		tFLineaTicket.setColumns(10);
		tFLineaTicket.setBounds(109, 114, 86, 20);
		add(tFLineaTicket);
		
		tFOrigenTicket = new JTextField();
		tFOrigenTicket.setEditable(false);
		tFOrigenTicket.setColumns(10);
		tFOrigenTicket.setBounds(109, 145, 86, 20);
		add(tFOrigenTicket);
		
		tFDestinoTicket = new JTextField();
		tFDestinoTicket.setEditable(false);
		tFDestinoTicket.setColumns(10);
		tFDestinoTicket.setBounds(109, 170, 86, 20);
		add(tFDestinoTicket);
		
		JLabel lblPrecioTicket = new JLabel("Precio:");
		lblPrecioTicket.setBounds(305, 211, 61, 14);
		add(lblPrecioTicket);
		
		tFPrecioTicket = new JTextField();
		tFPrecioTicket.setEditable(false);
		tFPrecioTicket.setColumns(10);
		tFPrecioTicket.setBounds(340, 208, 86, 20);
		add(tFPrecioTicket);
		
		JButton btnCancelarTicket = new JButton("Cancelar");
		btnCancelarTicket.setBounds(34, 253, 89, 23);
		add(btnCancelarTicket);
		
		JButton btnPagarTicket = new JButton("Pagar");
		btnPagarTicket.setBounds(305, 253, 89, 23);
		add(btnPagarTicket);

	}
}
