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
		
		

	}
	
}
