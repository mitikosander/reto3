package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import modelo.Cliente;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	private static Vista vista;
	private Modelo modelo;

	// valores a los que necesitamos acceder durante la ejecucion
	private modelo.Billete ticket = new modelo.Billete();
	private Double PrecioTicket = 0.0;
	private modelo.Autobus bus = new modelo.Autobus();

	public Controlador(Vista vista, Modelo modelo) {
		Controlador.vista = vista;
		this.modelo = modelo;
		InitializeEvents();

		// Cargamos la pantalla de inicio en la ventana contenedora
		vista.getVentana().setContentPane(vista.getPantCarga());
		vista.getVentana().setVisible(true);
	}

	// Cambiar variables cuando sea necesario
	static double precioTotal = 150;
	static double pagar = precioTotal;
	static double vueltas;

	private void InitializeEvents() {
		// Seteados valores en los campos

		vista.getPagar().gettFIntroducidoPagar().setText(Double.toString(pagar));

		// Te mete a la pantalla login 1
		vista.getPantCarga().getBtnAccederInicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getLogin());
				// Ocultamos el label de error al entrar a la pagina en caso de que este visible
				vista.getLogin().getLblErrorDeRegistro().setVisible(false);
			}
		});

		// Cuando estas en la pantalla login, te lleva a la pantalla de carga 1
		vista.getLogin().getBtnCancelarLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getPantCarga());
				resetLogin();
			}
		});

		// Te lleva a la pantalla de registro 1
		vista.getPantCarga().getBtnRegistrarseInicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getRegistro());
			}
		});
		// Te lleva a la pantalla de carga 1
		vista.getRegistro().getBtnCancelarRegistro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getLineas());
				resetRegistro();
			}
		});

		// Te lleva a la pantalla de carga, habiendo creado el usuario 1
		vista.getRegistro().getBtnAceptarRegistro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String value = (String) vista.getRegistro().getcBSexoRegistro().getSelectedItem();
				vista.getRegistro().getcBSexoRegistro().setSelectedItem(value);

				// recogemos los datos del usuario
				Cliente c1 = cogerdatosregistroUsuario();
				modelo.metodos.insertarUsuario(c1);
				resetRegistro();
				vista.mostrarPantalla(vista.getPantCarga());
			}
		});

		// Te lleva a la pantalla de lineas 1

		vista.getLogin().getBtnAceptarLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = vista.getLogin().gettFLogin().getText();
				String password = String.valueOf(vista.getLogin().getPasswordField().getPassword());

				boolean validarLogin = modelo.metodos.comprobarLogin(user, password);

				if (validarLogin == true) {
					// Pasamos el nombre al ticket
					vista.getTicket().getTxtNombreTicket().setText(modelo.metodos.obtenerNombreUsuario(user));

					vista.mostrarPantalla(vista.getLineas());

				} else {
					// mostramos el error pero borramos los campos para hacer un intendo de nuevo
					vista.getLogin().getLblErrorDeRegistro().setVisible(true);
					resetLogin();
				}
				// cargamos el combobox de lineas solo si es nulo de esta forma no habra
				// redundancia de datos
				if (vista.getLineas().getLineascB().getItemCount() <= 0) {
					rellenarComboLineas();
				}

			}
		});

		// Boton que cancela la seleccion de la Linea 1
		vista.getLineas().getBtnCancelarLineas().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getLogin());

				// reiniciamos los valores de las pantallas

				resetLineas();
			}
		});

		// Boton que acepta las paradas y nos pasa a seleccion de fecha 1
		vista.getParadas().getBtnAceptarParadas().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getSeleccionFecha());
				vista.getTicket().gettFOrigenTicket()
						.setText(vista.getParadas().getcBOrigenParadas().getSelectedItem().toString());
				vista.getTicket().gettFDestinoTicket()
						.setText(vista.getParadas().getcBDestinoParadas().getSelectedItem().toString());
				if (vista.getParadas().getChckIdaVuelta().isSelected()) {
					vista.getSeleccionFecha().getDateChooser_1().setEnabled(true);
				}

			}
		});

		// Boton que cancela la seleccion de paradas 1
		vista.getParadas().getBtnCancelarParadas().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getLineas());
				resetParadas();
			}
		});

		// Boton que cancela la seleccion de la fecha 1
		vista.getSeleccionFecha().getBtnCancelarSeleccionFecha().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getLineas());
				resetSeleccionFecha();
			}
		});

		// Boton que acepta la seleccion de la fecha y pasa al resumen del ticket 1
		vista.getSeleccionFecha().getBtnAceptarSeleccionFecha().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				Date fechaIdaSelec = (Date) vista.getSeleccionFecha().getDateChooser().getDate();
				Date fechaVueltaSelec = (Date) vista.getSeleccionFecha().getDateChooser_1().getDate();
				// Si la vuelta esta activada probaremos que la fecha de vuelta es valida

				
					if (vista.getSeleccionFecha().getDateChooser_1().isEnabled()) {
						vista.getTicket().getLblFechaVuelta().setVisible(true);
						vista.getTicket().getTxtFechaVuelta().setVisible(true);
						vista.getTicket().gettFFechaTicket().setText(fechaIdaSelec.toString());
						vista.getTicket().getTxtFechaVuelta().setText(fechaVueltaSelec.toString());
						// Si la seleccion de la fecha es anterior a la fecha de ida, no podremos
						// avanzar de pantalla
						if (fechaIdaSelec.before(fechaVueltaSelec)) {
							vista.getSeleccionFecha().getLblErrorFecha().setVisible(true);
							
						}
						
					}else {
						
						if(comprobarFechaActual(fechaIdaSelec)==true) {
						vista.getSeleccionFecha().getLblErrorFecha().setVisible(true);
						}else {
							vista.getTicket().gettFFechaTicket().setText(fechaIdaSelec.toString());
						}
						
					}
					
				
			}
		});

		// Boton que acepta la linea seleccionada y te lleva a la pantalla paradas 1
		vista.getLineas().getBtnaceptarLineas().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreLineaSelecc = vista.getLineas().getLineascB().getSelectedItem().toString();

				// Obtenemos el autobus que usaremos durante el viaje segun la linea que hemos
				// seleccionado
				bus = modelo.metodos.obtenerBusLinea(nombreLineaSelecc);
				vista.mostrarPantalla(vista.getParadas());

				// vaciamos los combos de origen y destino antes de llenarlo para evitar la
				// redundancia de datos
				resetcomboBox(vista.getParadas().getcBOrigenParadas());
				resetcomboBox(vista.getParadas().getcBDestinoParadas());

				if (vista.getParadas().getcBOrigenParadas().getItemCount() <= 1
						|| vista.getParadas().getcBDestinoParadas().getItemCount() <= 1) {
					rellenarComboParadasInicio(nombreLineaSelecc);
					rellenarComboParadasDestino(nombreLineaSelecc);
				}

				vista.getTicket().gettFLineaTicket().setText(nombreLineaSelecc);

			}
		});

		// Boton para aceptar la compra de nuestro ticket 1
		vista.getTicket().getBtnPagarTicket().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getPagar());
				resetTicket();
			}
		});

		// Boton para cancelar nuestro resumen del ticket y volver al inicio 1
		vista.getTicket().getBtnCancelarTicket().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getPantCarga());
				resetTicket();
			}
		});

		// Boton para finalizar el pago de nuestra compra 1
		vista.getPagar().getBtnFinalizar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se ha finalizado la compra
				vista.getVueltas().setVisible(true);
				resetPagar();

			}
		});

		// Boton para cancelar el pago del ticket 1
		vista.getPagar().getBtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.getPantCarga());
				resetPagar();
			}
		});

		// Botón para cerrar la pantalla de Vueltas
		vista.getVueltas().getCancelButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				vista.mostrarPantalla(vista.getPantCarga());
				vista.getVueltas().setVisible(false);
				resetVueltas();
			}
		});

		// Boton para Guardar el fichero del ticket al haber pagado
		vista.getPagar().getBtnGuardar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Guarda los datos en un archivo y vuelve al inicio

				vista.mostrarPantalla(vista.getPantCarga());
			}
		});

		// Para que cada vez que le des a un boton de pagar, vaya restando de el precio
		vista.getPagar().getBtn50Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(50);

			}
		});

		vista.getPagar().getBtn20Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(20);
			}
		});

		vista.getPagar().getBtn10Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(10);
			}
		});

		vista.getPagar().getBtn5Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(5);
			}
		});

		vista.getPagar().getBtn2Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(2);
			}
		});

		vista.getPagar().getBtn1Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(1);
			}
		});

		vista.getPagar().getBtn05Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(0.5);
			}
		});

		vista.getPagar().getBtn02Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(0.2);
			}
		});
		vista.getPagar().getBtn01Pagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar_cantidad(0.1);
			}
		});

	}

	private void rellenarComboLineas() {
		// Sacar las lineas de la BBDD y rellenar el combobox
		// 1.Sacar datos de la BBDD

		ArrayList<String> lineas = modelo.metodos.cargarLineas();

		// 2.Rellenar combo de lineas

		for (int i = 0; i < lineas.size(); i++) {
			vista.getLineas().getLineascB().addItem(lineas.get(i));
		}

	}

	// Rellena el combo con las paradas de inicio que haya en esa linea
	private void rellenarComboParadasInicio(String nombreLineaP) {

		ArrayList<String> nombreParadas = modelo.metodos.cargarParadas(nombreLineaP);

		// Rellenar las paradas
		for (int i = 0; i < nombreParadas.size(); i++) {
			vista.getParadas().getcBOrigenParadas().addItem(nombreParadas.get(i));
		}
	}

	// Rellena el combo con las paradas de destino que haya en esa linea
	private void rellenarComboParadasDestino(String nombreLineaP) {

		ArrayList<String> nombreParadas = modelo.metodos.cargarParadas(nombreLineaP);

		// Rellenar las paradas
		for (int i = 0; i < nombreParadas.size(); i++) {
			vista.getParadas().getcBDestinoParadas().addItem(nombreParadas.get(i));
		}

	}

	// Para guardar los datos del usuario en el registro
	private Cliente cogerdatosregistroUsuario() {

		// Al darle al boton registrar, Guardas los datos de la pantalla y los guarda en
		// un objeto usuario

		if (vista.getRegistro().getpFContrasenyaRegistro().getPassword() == vista.getRegistro()
				.getpFRegistroContrasenya1().getPassword()) {

			Cliente c1 = new Cliente();

			c1.setNombre(vista.getRegistro().gettFNombreRegistro().getText());
			c1.setDni(vista.getRegistro().getTfDNIRegistro().getText());

			c1.setContrasenya(String.valueOf(vista.getRegistro().getpFContrasenyaRegistro().getPassword()));
			c1.setContrasenya(String.valueOf(vista.getRegistro().getpFRegistroContrasenya1().getPassword()));
			if (vista.getRegistro().getcBSexoRegistro().getSelectedItem().equals("Masculino")) {
				c1.setSexo("M");
			} else {
				c1.setSexo("F");
			}
			return c1;
		}
		return null;

	}

	/**
	 * Este metodo se encarga de calcular la cantidad de monedas que se nos
	 * devolverá cuando ingresamos una cantidad mayor a la que se nos pide pagar
	 * 
	 * @param txtDevolver
	 * @param devolver
	 */
	public static void devolver(JTextArea txtDevolver, double[] devolver) {
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
			if (devolver[i] != 0) {
				txtDevolver
						.append("\n Te devolvemos " + devolver[i] + " monedas o billetes de: " + dineros[i] + " Euros");
			}
		}

	}

	// Método para resetear valores de pantalla login
	private static void resetLogin() {

		vista.getLogin().gettFLogin().setText(null);
		vista.getLogin().getPasswordField().setText(null);

	}

	// Método para resetear valores de la pantalla Registro
	private static void resetRegistro() {
		vista.getRegistro().gettFNombreRegistro().setText(null);
		vista.getRegistro().getTfDNIRegistro().setText(null);
		vista.getRegistro().getcBSexoRegistro().setSelectedIndex(0);
		vista.getRegistro().getpFContrasenyaRegistro().setText(null);
		vista.getRegistro().getpFRegistroContrasenya1().setText(null);
	}

	// Método para resetear valores de la pantalla Lineas
	private static void resetLineas() {
		vista.getLineas().getLineascB().setSelectedIndex(0);
	}

	// Método para resetear valores de la pantalla Paradas
	private static void resetParadas() {
		vista.getParadas().getcBOrigenParadas().setSelectedIndex(0);
		vista.getParadas().getcBDestinoParadas().setSelectedIndex(0);
		vista.getParadas().getChckIdaVuelta().setSelected(false);
	}

	// Método para resetear valores de la pantalla SeleccionFecha
	private static void resetSeleccionFecha() {
		vista.getSeleccionFecha().getDateChooser().setCalendar(null);
		vista.getSeleccionFecha().getDateChooser_1().setCalendar(null);
		vista.getSeleccionFecha().getDateChooser_1().setEnabled(false);
		vista.getSeleccionFecha().getLblErrorFecha().setVisible(false);
	}

	// Método para resetear los valores de la pantalla Ticket
	private static void resetTicket() {
		vista.getTicket().getTxtFechaVuelta().setText(null);
		vista.getTicket().getTxtFechaVuelta().setVisible(false);
		vista.getTicket().getLblFechaVuelta().setVisible(false);
		vista.getTicket().getTxtNombreTicket().setText(null);
		vista.getTicket().gettFDestinoTicket().setText(null);
		vista.getTicket().gettFFechaTicket().setText(null);
		vista.getTicket().gettFLineaTicket().setText(null);
		vista.getTicket().gettFNbilleteTicket().setText(null);
		vista.getTicket().gettFOrigenTicket().setText(null);
		vista.getTicket().gettFPrecioTicket().setText(null);
	}

	// Método para resetear los valores de la pantalla Pagar
	private static void resetPagar() {
		vista.getPagar().gettFAdevolverPagar().setText(null);
		vista.getPagar().gettFIntroducidoPagar().setText(null);

	}

	// Método para resetera los valores de la pantalla Vueltas
	private static void resetVueltas() {
		vista.getVueltas().getTxtDevolver().setText(null);
	}

	// Método para vaciar un comboBox
	private static void resetcomboBox(JComboBox<String> combo) {
		combo.removeAllItems();

	}

	// Metodo para comprobar que la fecha seleccionada no sea mayor que la del dia
	// actual
	private static boolean comprobarFechaActual(Date fechaSelec) {
		Date fechaActual = new Date();
		System.out.println(fechaActual);
		if (fechaSelec.before(fechaActual)) {
			return false;
		} else {
			return true;
		}
	}

	private static void pagar_cantidad(double cantidad) {
		if (pagar > 0) {
			pagar = pagar - cantidad;
			pagar = Math.round(pagar * 100.0) / 100.0;
			vista.getPagar().gettFAdevolverPagar().setText(Double.toString(pagar));
		} else if (pagar < 0) {
			vueltas = pagar * -1;
			vista.getPagar().gettFAdevolverPagar().setText(Double.toString(vueltas));
		}
	}

}
