package vista;

import javax.swing.JPanel;

public class Vista {

	public Vista() {
		
		//Instanciamos el panel como un objeto para acceder a sus atributos
		Contenedor ventana=new Contenedor();
		Inicio pantCarga=new Inicio();
		Lineas lineas = new Lineas();
		Login login = new Login();
		Pagar pagar = new Pagar();
		Paradas paradas= new Paradas();
		Registro registro = new Registro();
		SeleccionFecha seleccionFecha = new SeleccionFecha();
		Ticket ticket = new Ticket();
		
		
		
	}
	public static void mostrarventana(JPanel panel) {
		
		
	}
}
