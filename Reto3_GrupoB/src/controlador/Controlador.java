package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextArea;

import modelo.Cliente;
import modelo.Lineasdeautobuses;
import modelo.Modelo;
import modelo.Parada;
import vista.Pagar;
import vista.Registro;
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
	static double precioTotal=150;
	static double  pagar=precioTotal;
	static double vueltas;
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
				vista.login.getBtnCancelarLogin().addActionListener(new ActionListener() {
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
						
							String value = (String)vista.registro.cBSexoRegistro.getSelectedItem();
							vista.registro.cBSexoRegistro.setSelectedItem(value);
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
				
				vista.login.getBtnAceptarLogin().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						boolean validarLogin=modelo.metodos.comprobarLogin(vista.login.gettFLogin().getName(),vista.login.getPasswordField().getName());
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
				vista.pagar.btnFinalizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						vista.vueltas.setVisible(true);
							
						}
				});
				vista.pagar.btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						vista.mostrarPantalla(vista.pantCarga);			
						}
				});
				vista.vueltas.cancelButton.addActionListener(new ActionListener() {
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
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					
						
				}
				});
				vista.pagar.btn20Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-20;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn10Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-10;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn5Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-5;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn2Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-2;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn1Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-1;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn05Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.5;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn02Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.2;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn01Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.1;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn005Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.05;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn002Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.02;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
				vista.pagar.btn001Pagar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(pagar>0) {
						pagar=pagar-0.01;	
						pagar = Math.round(pagar * 100.0) / 100.0;
						vista.pagar.tFAdevolverPagar.setText(Double.toString(pagar));
						}else if(pagar<0) {
							vueltas=pagar*-1;
							vista.pagar.tFAdevolverPagar.setText(Double.toString(vueltas));
						}
					}
				});
	}
	
	private void rellenarComboLineas() {
		//Sacar las lineas de la BBDD y rellenar el combobox
		//1.Sacar datos de la BBDD
				
		ArrayList<Lineasdeautobuses> lineas=modelo.datos.getLineas();
		
		//2.Relllenar combo de lineas		

		for(int i = 0;i<lineas.size();i++) {
			vista.lineas.LineascB.addItem(lineas.get(i));
		}

	}
	//Rellena el combo con las paradas de inicio que haya en esa linea
	private void rellenarComboParadasInicio(int codLinea) {

		ArrayList<Parada> paradaInicio=modelo.datos.getParadas();		
	
		//Rellenar las paradas
		for(int i = 0;i<paradaInicio.size();i++) {
			//vista.paradas.cBOrigenParadas.addItem(paradaInicio.get(i));
		}
	}
	
	//Rellena el combo con las paradas de destino que haya en esa linea
	private void rellenarComboParadasDestino(int codLinea) {
		
		ArrayList<Parada> paradaDestino=modelo.datos.getParadas();		

		//Rellenar las paradas
		for(int i = 0;i<paradaDestino.size();i++) {
			//vista.paradas.cBDestinoParadas.
		}
		
	}

	//Para guardar los datos del usuario en el registro
	private void registroUsuario() {
		
		//Al darle al boton registrar, Guardas los datos de la pantalla y los guarda en un objeto usuario
		
		if(vista.registro.pFContraseñaRegistro.getPassword() == vista.registro.pFRegistroContraseña1.getPassword()) {

		Cliente c1 = new Cliente();

		c1.setNombre(vista.registro.tFNombreRegistro.getText());
		c1.setDni(vista.registro.tfDNIRegistro.getText());
		
		c1.setContrasenya(String.valueOf(vista.registro.pFContraseñaRegistro.getPassword()));
		c1.setContrasenya(String.valueOf(vista.registro.pFRegistroContraseña1.getPassword()));
		if (vista.registro.cBSexoRegistro.getSelectedItem().equals("Masculino")){
			c1.setSexo("M");
		}else {
			c1.setSexo("F");
		}	
		}
		
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
		}

