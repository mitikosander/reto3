package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import modelo.Lineasdeautobuses;
import modelo.Modelo;
import modelo.Parada;
import vista.Vista;

public class Controlador {
	private Vista vista;
	private Modelo modelo;
	
	
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista=vista;
		this.modelo=modelo;
		InitializeEvents();
		
		
		//Cargamos la pantalla de inicio en la ventana contenedora
		vista.ventana.setContentPane(vista.pantCarga);
		vista.ventana.setVisible(true);
	}
	
	
	//Cambiar variables cuando sea necesario
	double precioTotal=150;
	double  pagar=precioTotal;
	
	
	private void InitializeEvents() {	
		//Seteados valores en los campos
		
		vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
		
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
					
							vista.mostrarPantalla(vista.pantCarga);
						
						
						
						}
				});
				
				//Te lleva a la pantalla de login
				vista.pantCarga.btnAccederInicio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						vista.mostrarPantalla(vista.login);		
						
						}
				});
				//Te lleva a la pantalla de lineas
				vista.login.btnAceptarLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						System.out.println(vista.login.tFLogin_Pass);
						boolean validarLogin=modelo.metodos.comprobarLogin(vista.login.tFLogin.getName(), vista.login.tFLogin_Pass.getName());
						if(validarLogin==true) {
							vista.mostrarPantalla(vista.lineas);
						}
						
						rellenarComboLineas();
						
					}
				});
				
				//Te lleva a la pantalla paradas
				vista.lineas.btnaceptarLineas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.paradas);
						rellenarComboParadasInicio(1);
						rellenarComboParadasDestino(2);
					}
				});
				
				
				vista.lineas.btnCancelarLineas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				vista.seleccionFecha.btnCancelarSeleccionFecha.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				vista.seleccionFecha.btnAceptarSeleccionFecha.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.ticket);			
						}
				});
				
				vista.paradas.btnAceptarParadas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.seleccionFecha);			
						}
				});
				vista.paradas.btnCancelarParadas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				vista.ticket.btnPagarTicket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pagar);			
						}
				});
				vista.ticket.btnCancelarTicket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				vista.ticket.btnCancelarTicket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				vista.ticket.btnPagarTicket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.ticket);		
						}
				});
				vista.pagar.btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				vista.pagar.btnFinalizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				vista.pagar.btnGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Guarda los datos en un archivo y vuelve al inicio 
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				//Para que cada vez que le des a un boton de pagar, vaya restando de el precio 
				vista.pagar.btn50Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						if(pagar>0) {
						pagar=pagar-50;	
						vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						//vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
				}
				});
				vista.pagar.btn20Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-20;	
						vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						//vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn10Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-10;
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn5Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-5;
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
					vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn2Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-2;
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));	
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
					}
					}
				});
				vista.pagar.btn1Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-1;	
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn05Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-0.5;	
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn02Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-0.2;	
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
					vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn01Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-0.1;
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn005Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-0.1;
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn002Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-0.1;
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
				vista.pagar.btn001Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(pagar>0) {
						pagar=pagar-0.1;
						//vista.pagar.tFIntroducidoPagar.setText(Double.toString(pagar));
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}
					}
				});
	}
	
	private void rellenarComboLineas() {
		//Sacar las lineas de la BBDD y rellenar el combobox
		//1.Sacar datos de la BBDD
				
		Lineasdeautobuses[] lineas = modelo.obtenerLineas();
		
		//2.Relllenar combo de lineas		

		for(int i = 0;i<lineas.length;i++) {
			vista.lineas.LineascB.addItem(lineas[i].getAutobusrecorrerlinea());
		}

	}
	//Rellena el combo con las paradas de inicio que haya en esa linea
	private void rellenarComboParadasInicio(int codLinea) {

		Parada paradas[] = modelo.obtenerParadas(1);		
	
		//Rellenar las paradas
		for(int i = 0;i<paradas.length;i++) {
			vista.paradas.cBOrigenParadas.addItem(paradas[i].getNombreParada());
		}
	}
	
	//Rellena el combo con las paradas de destino que haya en esa linea
	private void rellenarComboParadasDestino(int codLinea) {
		
		Parada paradas[] = modelo.obtenerParadas(1);

		//Rellenar las paradas
		for(int i = 0;i<paradas.length;i++) {
			vista.paradas.cBDestinoParadas.addItem(paradas[i].getNombreParada());
		}
		
	}
	}
