package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JTextArea;

import modelo.Cliente;

import modelo.Modelo;

import vista.Vista;

public class Controlador {
	private Vista vista;
	private Modelo modelo;
	
	
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista=vista;
		this.modelo=modelo;
		InitializeEvents();
		
		
		//Cargamos la pantalla de inicio en la ventana contenedora
		vista.getVentana().setContentPane(vista.getPantCarga());
		vista.getVentana().setVisible(true);
	}
	
	
	//Cambiar variables cuando sea necesario
	static double precioTotal=150;
	static double  pagar=precioTotal;
	static double vueltas;
	private void InitializeEvents() {	
		//Seteados valores en los campos
		
		vista.getPagar().gettFIntroducidoPagar().setText(Double.toString(pagar));
		
			//Te mete a la pantalla login
				vista.getPantCarga().getBtnAccederInicio().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getLogin());
					}
				});
				
				//Cuando estas en la pantalla login, te lleva a la pantalla de carga
				vista.getLogin().getBtnCancelarLogin().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getPantCarga());
						resetLogin();
					}
				});
				
				//Te lleva a la pantalla de registro
				vista.getPantCarga().getBtnRegistrarseInicio().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getRegistro());
					}
				});
				//Te lleva a la pantalla de carga
				vista.getRegistro().getBtnCancelarRegistro().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getPantCarga());
					}
				});
				
				//Te lleva a la pantalla de carga, habiendo creado el usuario
				vista.getRegistro().getBtnAceptarRegistro().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
							String value = (String)vista.getRegistro().getcBSexoRegistro().getSelectedItem();
							vista.getRegistro().getcBSexoRegistro().setSelectedItem(value);
							
							
							//recogemos los datos del usuario
							Cliente c1=cogerdatosregistroUsuario();
							modelo.metodos.insertarUsuario(c1);
							
							vista.mostrarPantalla(vista.getPantCarga());
						}
				});
				
				//Te lleva a la pantalla de login
				vista.getPantCarga().getBtnAccederInicio().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						vista.mostrarPantalla(vista.getLogin());		
						
						}
				});
				//Te lleva a la pantalla de lineas
				
				vista.getLogin().getBtnAceptarLogin().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String user=vista.getLogin().gettFLogin().getText();
						String password=String.valueOf(vista.getLogin().getPasswordField().getPassword());
						boolean validarLogin=modelo.metodos.comprobarLogin(user,password);
						
						if(validarLogin==true) {
							
							vista.mostrarPantalla(vista.getLineas());
						}else {
							
							vista.getLogin().getLblErrorDeRegistro().setVisible(true);
							resetLogin();
						}
						
						rellenarComboLineas();
					}
				});

				
				//Te lleva a la pantalla paradas
				vista.getLineas().getBtnaceptarLineas().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombreLineaSelecc=vista.getLineas().getLineascB().getSelectedItem().toString();
						vista.mostrarPantalla(vista.getParadas());
						rellenarComboParadasInicio(nombreLineaSelecc);
						rellenarComboParadasDestino(nombreLineaSelecc);
						
					}
				});
				
				
				vista.getLineas().getBtnCancelarLineas().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getPantCarga());			
						}
				});
				vista.getSeleccionFecha().getBtnCancelarSeleccionFecha().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getPantCarga());			
						}
				});
				vista.getSeleccionFecha().getBtnAceptarSeleccionFecha().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getTicket());			
						}
				});
				
				vista.getParadas().getBtnAceptarParadas().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getSeleccionFecha());			
						}
				});
				vista.getParadas().getBtnCancelarParadas().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getPantCarga());			
						}
				});
				vista.getTicket().getBtnPagarTicket().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getPagar());			
						}
				});
				vista.getTicket().getBtnCancelarTicket().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getPantCarga());			
						}
				});
				vista.getPagar().getBtnFinalizar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						vista.getVueltas().setVisible(true);
							
						}
				});
				vista.getPagar().getBtnCancelar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.getPantCarga());			
						}
				});
				vista.getVueltas().getCancelButton().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						vista.mostrarPantalla(vista.getPantCarga());			
						}
				});
				vista.getPagar().getBtnGuardar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Guarda los datos en un archivo y vuelve al inicio 
						vista.mostrarPantalla(vista.getPantCarga());			
						}
				});
				//Para que cada vez que le des a un boton de pagar, vaya restando de el precio 
				vista.getPagar().getBtn50Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						if(pagar>0) {
						pagar=pagar-50;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					
						
				}
				});
				vista.getPagar().getBtn20Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-20;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn10Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-10;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn5Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-5;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn2Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-2;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn1Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-1;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn05Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.5;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn02Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.2;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn01Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.1;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn005Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.05;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn002Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.02;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
				vista.getPagar().getBtn001Pagar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.01;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
						}
					}
				});
	}
	
	private void rellenarComboLineas() {
		//Sacar las lineas de la BBDD y rellenar el combobox
		//1.Sacar datos de la BBDD
				
		ArrayList<String> lineas=modelo.metodos.cargarLineas();
		
		//2.Rellenar combo de lineas		

		for(int i = 0;i<lineas.size();i++) {
			vista.getLineas().getLineascB().addItem(lineas.get(i));
		}

	}
	//Rellena el combo con las paradas de inicio que haya en esa linea
	private void rellenarComboParadasInicio(String nombreLineaP) {

		ArrayList<String>nombreParadas=modelo.metodos.cargarParadas(nombreLineaP);	
	
		//Rellenar las paradas
		for(int i = 0;i<nombreParadas.size();i++) {
			vista.getParadas().getcBOrigenParadas().addItem(nombreParadas.get(i));
		}
	}
	
	//Rellena el combo con las paradas de destino que haya en esa linea
	private void rellenarComboParadasDestino(String nombreLineaP) {
		
		ArrayList<String>nombreParadas=modelo.metodos.cargarParadas(nombreLineaP);	
		
		//Rellenar las paradas
		for(int i = 0;i<nombreParadas.size();i++) {
			vista.getParadas().getcBDestinoParadas().addItem(nombreParadas.get(i));
		}
		
	}

	//Para guardar los datos del usuario en el registro
	private Cliente cogerdatosregistroUsuario() {
		
		//Al darle al boton registrar, Guardas los datos de la pantalla y los guarda en un objeto usuario
		
		if(vista.getRegistro().getpFContraseñaRegistro().getPassword() == vista.getRegistro().getpFRegistroContraseña1().getPassword()) {

		Cliente c1 = new Cliente();

		c1.setNombre(vista.getRegistro().gettFNombreRegistro().getText());
		c1.setDni(vista.getRegistro().getTfDNIRegistro().getText());
		
		c1.setContrasenya(String.valueOf(vista.getRegistro().getpFContraseñaRegistro().getPassword()));
		c1.setContrasenya(String.valueOf(vista.getRegistro().getpFRegistroContraseña1().getPassword()));
		if (vista.getRegistro().getcBSexoRegistro().getSelectedItem().equals("Masculino")){
			c1.setSexo("M");
		}else {
			c1.setSexo("F");
		}
		return c1;
		}
		return null;
		
	}
	
	
	


	
	/**
	 * Este metodo se encarga de calcular la cantidad de monedas que se nos devolverá cuando ingresamos una cantidad mayor a la que se nos pide pagar
	 * @param txtDevolver
	 * @param devolver
	 */
		public static void devolver(JTextArea txtDevolver,double [] devolver ) {
			double[] dineros = { 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01 };

			vueltas = (pagar * -1);
			vueltas = Math.round(pagar * 100.0) / 100.0;

			for (int i = 0; i < dineros.length; i++) {
				if (vueltas >= dineros[i]) {

					devolver[i] = Math.floor(vueltas / dineros[i]);
					vueltas = vueltas - (devolver[i] * dineros[i]);
				}
			}

			for (int i = 0; i < dineros.length; i++) {
					if(devolver[i]!=0) {
					txtDevolver.append("\n Te devolvemos " + devolver[i] + " monedas o billetes de: " + dineros[i] + " Euros");
					}
			}

		}
		
		//Método para resetear valores de pantalla login
		public static void resetLogin() {
			Vista vista=new Vista();
			vista.getLogin().gettFLogin().setText(null);
			vista.getLogin().getPasswordField().setText(null);
			vista.getLogin().getLblErrorDeRegistro().setVisible(false);
		}
		
		//Método para resetear valores de la pantalla Registro
		public static void resetRegistro() {
			
		}
		
		//Método para resetear valores de la pantalla Lineas
		public static void resetLineas() {
			
		}
		
		//Método para resetear valores de la pantalla Paradas
		public static void resetParadas() {
		
		}
		
		//Método para resetear valores de la pantalla SeleccionFecha
		public static void resetSeleccionFecha() {
			
		}
		
		//Método para resetear los valores de la pantalla Ticket
		public static void resetTicket() {
			
		}
		//Método para resetear los valores de la pantalla Pagar
		public static void resetPagar() {
			
		}

}
