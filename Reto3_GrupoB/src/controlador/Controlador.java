package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	private Vista vista;
	private Modelo modelo;
	public Controlador(Vista vista, Modelo modelo) {
		this.vista=vista;
		this.modelo=modelo;
		
		InitializeEvents();
		
		//Nos conectamos a la base de datos
	//	Connection conectar=modelo.conexion.conectarBase();
		//Cargamos la pantalla de inicio en la ventana contenedora
		vista.ventana.setContentPane(vista.pantCarga);
		vista.ventana.setVisible(true);
	}
	
	private void InitializeEvents() {
		
		
		//Te mete a la pantalla login
				vista.pantCarga.btnAccederInicio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.login);
					}
				});
				//Cuando estas en la pantalla login, te lleva a la pantalla de carga
				vista.login.btnCancelarLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);
					}
				});
				
				//Te lleva a la pantalla de registro
				vista.pantCarga.btnRegistrarseInicio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.registro);
					}
				});
				//Te lleva a la pantalla de carga
				vista.registro.btnCancelarRegistro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);
					}
				});
				
				//Te lleva a la pantalla de carga, habiendo creado el usuario
				vista.registro.btnAceptarRegistro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				
				//Te lleva a la pantalla de login
				vista.pantCarga.btnAccederInicio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.login);			}
				});
				//Te lleva a la pantalla de lineas
				vista.login.btnAceptarLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.lineas);			}
				});
				
				vista.lineas.btnLineasLinea1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.paradas);			}
				});
				vista.lineas.btnLineasLinea2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.paradas);			}
				});
				vista.lineas.btnLineasLinea3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.paradas);			}
				});
				vista.lineas.btnLineasLinea4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.paradas);			}
				});
				
				vista.lineas.btnCancelarLineas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				vista.seleccionFecha.btnCancelarSeleccionFecha.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				vista.seleccionFecha.btnAceptarSeleccionFecha.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				
				vista.paradas.btnAceptarParadas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.ticket);			}
				});
				vista.paradas.btnCancelarParadas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				vista.ticket.btnPagarTicket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pagar);			}
				});
				vista.ticket.btnCancelarTicket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				
				
				
				vista.ticket.btnCancelarTicket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				vista.ticket.btnPagarTicket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.ticket);			}
				});
				vista.pagar.btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				vista.pagar.btnFinalizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				vista.pagar.btnGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Guarda los datos en un archivo y vuelve al inicio 
						vista.mostrarPantalla(vista.pantCarga);			}
				});
				
		
	}
	
}
