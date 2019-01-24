package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

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
		//Connection conectar=modelo.conexion.conectarBase();
		//Cargamos la pantalla de inicio en la ventana contenedora
		vista.ventana.setContentPane(vista.pantCarga);
		vista.ventana.setVisible(true);
	}
	
	private void InitializeEvents() {
	
		//Añadimos la funcion que cambia de pantalla al pulsar el boton login
		vista.pantCarga.btnAccederInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.login);
			}
		});
		
		vista.pantCarga.btnRegistrarseInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);
			}
		});
		vista.registro.btnCancelarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);
			}
		});
		vista.registro.btnAceptarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.pantCarga.btnAccederInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.lineas.btnLineasLinea1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.lineas.btnLineasLinea2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.lineas.btnLineasLinea3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.lineas.btnLineasLinea4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.lineas.btnCancelarLineas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.paradas.btnAceptarParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.paradas.btnCancelarParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.ticket.btnCancelarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.ticket.btnPagarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.pagar.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.pagar.btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Falta un metodo que borre todos los datos al volver al inicio
				vista.mostrarPantalla(vista.registro);			}
		});
		vista.pagar.btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Guarda los datos en un archivo y vuelve al inicio 
				vista.mostrarPantalla(vista.registro);			}
		});
		
		
	}
	
}
