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
	public JButton btnCancelarTicket, btnPagarTicket;
	private JTextField txtFechaVuelta;

	/**
	 * Create the panel.
	 */
	public Ticket() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		JLabel lblNbillete = new JLabel("N\u00BABillete:");
		lblNbillete.setBounds(61, 102, 61, 14);
		add(lblNbillete);
		
		tFNbilleteTicket = new JTextField();
		tFNbilleteTicket.setEditable(false);
		tFNbilleteTicket.setBounds(179, 99, 86, 20);
		add(tFNbilleteTicket);
		tFNbilleteTicket.setColumns(10);
		
		JLabel lblFechaIda = new JLabel("Fecha ida:");
		lblFechaIda.setBounds(61, 144, 61, 14);
		add(lblFechaIda);
		
		tFFechaTicket = new JTextField();
		tFFechaTicket.setEditable(false);
		tFFechaTicket.setColumns(10);
		tFFechaTicket.setBounds(179, 141, 86, 20);
		add(tFFechaTicket);
		
		JLabel lblLinea = new JLabel("Linea:");
		lblLinea.setBounds(61, 189, 61, 14);
		add(lblLinea);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setBounds(61, 232, 61, 14);
		add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setBounds(61, 282, 61, 14);
		add(lblDestino);
		
		tFLineaTicket = new JTextField();
		tFLineaTicket.setEditable(false);
		tFLineaTicket.setColumns(10);
		tFLineaTicket.setBounds(179, 186, 86, 20);
		add(tFLineaTicket);
		
		tFOrigenTicket = new JTextField();
		tFOrigenTicket.setEditable(false);
		tFOrigenTicket.setColumns(10);
		tFOrigenTicket.setBounds(179, 229, 86, 20);
		add(tFOrigenTicket);
		
		tFDestinoTicket = new JTextField();
		tFDestinoTicket.setEditable(false);
		tFDestinoTicket.setColumns(10);
		tFDestinoTicket.setBounds(179, 279, 86, 20);
		add(tFDestinoTicket);
		
		JLabel lblPrecioTicket = new JLabel("Precio:");
		lblPrecioTicket.setBounds(272, 359, 61, 14);
		add(lblPrecioTicket);
		
		tFPrecioTicket = new JTextField();
		tFPrecioTicket.setEditable(false);
		tFPrecioTicket.setColumns(10);
		tFPrecioTicket.setBounds(343, 356, 86, 20);
		add(tFPrecioTicket);
		
		btnCancelarTicket = new JButton("Cancelar");
		btnCancelarTicket.setBounds(10, 448, 89, 23);
		add(btnCancelarTicket);
		
		btnPagarTicket = new JButton("Pagar");
		btnPagarTicket.setBounds(387, 448, 89, 23);
		add(btnPagarTicket);
		
		JLabel lblFechaVuelta = new JLabel("Fecha Vuelta: ");
		lblFechaVuelta.setBounds(303, 144, 77, 14);
		add(lblFechaVuelta);
		
		txtFechaVuelta = new JTextField();
		txtFechaVuelta.setBounds(375, 141, 86, 20);
		add(txtFechaVuelta);
		txtFechaVuelta.setColumns(10);

	}
}
