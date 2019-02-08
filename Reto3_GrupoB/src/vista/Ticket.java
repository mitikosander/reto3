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
	private JTextField txtHoraSalida;
	private JTextField txtHoraVuelta;
	private JTextField txtNombreTicket;

	/**
	 * Create the panel.
	 */
	public Ticket() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		JLabel lblNbillete = new JLabel("N\u00BABillete:");
		lblNbillete.setBounds(59, 137, 61, 14);
		add(lblNbillete);
		
		tFNbilleteTicket = new JTextField();
		tFNbilleteTicket.setEditable(false);
		tFNbilleteTicket.setBounds(177, 134, 86, 20);
		add(tFNbilleteTicket);
		tFNbilleteTicket.setColumns(10);
		
		JLabel lblFechaIda = new JLabel("Fecha ida:");
		lblFechaIda.setBounds(59, 179, 61, 14);
		add(lblFechaIda);
		
		tFFechaTicket = new JTextField();
		tFFechaTicket.setEditable(false);
		tFFechaTicket.setColumns(10);
		tFFechaTicket.setBounds(177, 176, 86, 20);
		add(tFFechaTicket);
		
		JLabel lblLinea = new JLabel("Linea:");
		lblLinea.setBounds(59, 224, 61, 14);
		add(lblLinea);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setBounds(59, 267, 61, 14);
		add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setBounds(59, 317, 61, 14);
		add(lblDestino);
		
		tFLineaTicket = new JTextField();
		tFLineaTicket.setEditable(false);
		tFLineaTicket.setColumns(10);
		tFLineaTicket.setBounds(177, 221, 86, 20);
		add(tFLineaTicket);
		
		tFOrigenTicket = new JTextField();
		tFOrigenTicket.setEditable(false);
		tFOrigenTicket.setColumns(10);
		tFOrigenTicket.setBounds(177, 264, 86, 20);
		add(tFOrigenTicket);
		
		tFDestinoTicket = new JTextField();
		tFDestinoTicket.setEditable(false);
		tFDestinoTicket.setColumns(10);
		tFDestinoTicket.setBounds(177, 314, 86, 20);
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
		lblFechaVuelta.setBounds(286, 144, 89, 14);
		add(lblFechaVuelta);
		
		txtFechaVuelta = new JTextField();
		txtFechaVuelta.setEditable(false);
		tFPrecioTicket.setEditable(false);
		txtFechaVuelta.setColumns(10);
		txtFechaVuelta.setBounds(375, 141, 86, 20);
		add(txtFechaVuelta);
		
		JLabel lblHoraSalida = new JLabel("Hora salida");
		lblHoraSalida.setBounds(286, 189, 76, 14);
		add(lblHoraSalida);
		
		txtHoraSalida = new JTextField();
		txtHoraSalida.setEditable(false);
		txtHoraSalida.setColumns(10);
		txtHoraSalida.setBounds(375, 186, 86, 20);
		add(txtHoraSalida);
		
		JLabel lblHoraVuelta = new JLabel("Hora vuelta");
		lblHoraVuelta.setBounds(286, 231, 76, 14);
		add(lblHoraVuelta);
		
		txtHoraVuelta = new JTextField();
		txtHoraVuelta.setEditable(false);
		txtHoraVuelta.setColumns(10);
		txtHoraVuelta.setBounds(375, 228, 86, 20);
		add(txtHoraVuelta);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(59, 90, 61, 14);
		add(lblNombre);
		
		txtNombreTicket = new JTextField();
		txtNombreTicket.setEditable(false);
		txtNombreTicket.setColumns(10);
		txtNombreTicket.setBounds(177, 86, 86, 20);
		add(txtNombreTicket);
		

	}
}
