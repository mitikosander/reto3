package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Termibus {

	static Inicio panelInicio = new Inicio();
	static Login panelLogin = new Login();
	static Registro panelRegistro = new Registro();
	static Lineas panelLineas = new Lineas();
	static Paradas panelParadas = new Paradas();
	static SeleccionFecha panelSeleccionFecha = new SeleccionFecha();
	static Ticket panelTicket = new Ticket();
	static Pagar panelPagar = new Pagar();
	private JFrame frame;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Termibus window = new Termibus();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	

	public static void mostrarInicio() {
		panelInicio.setVisible(true);
	}
	public static void ocultarInicio() {
		panelInicio.setVisible(false);
	}
	public static void mostrarLogin() {
		panelLogin.setVisible(true);
		
	}
	public static void ocultarLogin() {
		panelLogin.setVisible(false);
	}

	public static void mostrarRegistro() {
		panelRegistro.setVisible(true);
	}

	public static void ocultarRegistro() {
		panelRegistro.setVisible(false);
	}

	public static void mostrarLineas() {
		panelLineas.setVisible(true);
	}
	public static void ocultarLineas() {
		panelLineas.setVisible(false);
	}
	public static void mostrarParadas() {
		panelParadas.setVisible(true);
	}
	public static void ocultarParadas() {
		panelParadas.setVisible(false);
	}
	public static void mostrarSeleccionFecha() {
		panelSeleccionFecha.setVisible(true);
	}
	public static void ocultarSeleciconFecha() {
		panelSeleccionFecha.setVisible(false);
	}
	public static void mostrarTicket() {
		panelTicket.setVisible(true);
	}
	public static void ocultarTicket() {
		panelTicket.setVisible(false);
	}
	public static void mostrarPagar() {
		panelPagar.setVisible(true);
	}
	public static void ocultarPagar() {
		panelPagar.setVisible(false);
	}
	
	
	public Termibus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelInicio.setBounds(0,0,700,500);
		frame.getContentPane().add(panelInicio);
		panelInicio.setVisible(true);
		
		panelLogin.setBounds(0,0,700,500);
		frame.getContentPane().add(panelLogin);
		panelLogin.setVisible(false);
		
		panelRegistro.setBounds(0,0,700,500);
		frame.getContentPane().add(panelRegistro);
		panelRegistro.setVisible(false);
		
		panelLineas.setBounds(0,0,700,500);
		frame.getContentPane().add(panelLineas);
		panelLineas.setVisible(false);
		
		panelParadas.setBounds(0,0,700,500);
		frame.getContentPane().add(panelParadas);
		panelParadas.setVisible(false);
		
		panelLineas.setBounds(0,0,700,500);
		frame.getContentPane().add(panelLineas);
		panelLineas.setVisible(false);
				
		panelSeleccionFecha.setBounds(0,0,700,500);
		frame.getContentPane().add(panelSeleccionFecha);
		panelSeleccionFecha.setVisible(false);
		
		panelTicket.setBounds(0,0,700,500);
		frame.getContentPane().add(panelTicket);
		panelTicket.setVisible(false);
		

		panelPagar.setBounds(0,0,700,500);
		frame.getContentPane().add(panelPagar);
		panelPagar.setVisible(false);
	}
	
	}


