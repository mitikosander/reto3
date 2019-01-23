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

	}
	
}
