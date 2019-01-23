package controlador;

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
		

	}
	
}
