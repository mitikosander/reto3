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
	//Cambiar variables cuando sea necesario
	double precioTotal=150;
	double  pagar=precioTotal;
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
						vista.mostrarPantalla(vista.ticket);			}
				});
				
				vista.paradas.btnAceptarParadas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.seleccionFecha);			}
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
				//Para que cada vez que le des a un boton de pagar, vaya restando de el precio 
				vista.pagar.btn50Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-50;	}
				});
				vista.pagar.btn20Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-20;	}
				});
				vista.pagar.btn10Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-10;	}
				});
				vista.pagar.btn5Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-5;	}
				});
				vista.pagar.btn2Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-2;	}
				});
				vista.pagar.btn1Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-1;	}
				});
				vista.pagar.btn05Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-0.5;	}
				});
				vista.pagar.btn02Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-0.2;	}
				});
				vista.pagar.btn01Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pagar=pagar-0.1;	}
				});
	}
	
}
