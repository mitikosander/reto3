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
	}
	
	private void InitializeEvents() {
		//Nos conectamos a la base de datos
		modelo.conexion.conectarBase();
		//Cargamos la pantalla de inicio en la ventana contenedora
		vista.ventana.frame.setContentPane(vista.pantCarga);
		//Añadimos la funcion que cambia de pantalla al pulsar el boton login
		vista.pantCarga.btnAccederInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.login, vista.ventana.frame);
			}
		});
		
		vista.pantCarga.btnRegistrarseInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.registro, vista.ventana.frame);
			}
		});
		vista.registro.btnCancelarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.pantCarga, vista.ventana.frame);
			}
		});
		vista.registro.btnAceptarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.pantCarga, vista.ventana.frame);
			}
		});
		vista.pantCarga.btnAccederInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.lineas, vista.ventana.frame);
			}
		});
		vista.lineas.btnLineasLinea1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.paradas, vista.ventana.frame);
			}
		});
		vista.lineas.btnLineasLinea2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.paradas, vista.ventana.frame);
			}
		});
		vista.lineas.btnLineasLinea3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.paradas, vista.ventana.frame);
			}
		});
		vista.lineas.btnLineasLinea4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.paradas, vista.ventana.frame);
			}
		});
		vista.lineas.btnCancelarLineas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.pantCarga, vista.ventana.frame);
			}
		});
		vista.paradas.btnAceptarParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.ticket, vista.ventana.frame);
			}
		});
		vista.paradas.btnCancelarParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.lineas, vista.ventana.frame);
			}
		});
		vista.ticket.btnCancelarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.paradas, vista.ventana.frame);
			}
		});
		vista.ticket.btnPagarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.pagar, vista.ventana.frame);
			}
		});
		vista.pagar.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.metodos.mostrarPantalla(vista.ticket, vista.ventana.frame);
			}
		});
		vista.pagar.btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Falta un metodo que borre todos los datos al volver al inicio
				modelo.metodos.mostrarPantalla(vista.pantCarga, vista.ventana.frame);
			}
		});
		vista.pagar.btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Guarda los datos en un archivo y vuelve al inicio 
				modelo.metodos.mostrarPantalla(vista.pantCarga, vista.ventana.frame);
			}
		});
		
		
		
	}
	
}
