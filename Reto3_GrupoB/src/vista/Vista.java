package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Vista {

	public Contenedor ventana;
	public Inicio pantCarga;
	public Lineas lineas;
	public Login login;
	public Pagar pagar;
	public Paradas paradas;
	public Registro registro;
	public SeleccionFecha seleccionFecha;
	public Ticket ticket;
	
	public Vista() {
		
		//Instanciamos el panel como un objeto para acceder a sus atributos
		ventana=new Contenedor();
		 pantCarga=new Inicio();
		 
		 
		 lineas = new Lineas();
		 login = new Login();
		 pagar = new Pagar();
		 paradas= new Paradas();
		 registro = new Registro();
		 seleccionFecha = new SeleccionFecha();
		 ticket = new Ticket();
		
		
		
	}
	
	public void mostrarPantalla(JPanel panel ) {
		ventana.setContentPane(panel);
		ventana.setVisible(true);
	}
}