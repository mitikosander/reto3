package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista {

	public  Contenedor ventana;
	public Inicio pantCarga;
	public Lineas lineas;
	public Login login;
	public Pagar pagar;
	public Paradas paradas;
	public Registro registro;
	public SeleccionFecha seleccionFecha;
	public Ticket ticket;
	public Vueltas vueltas;
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
		 vueltas = new Vueltas();
		
		
	}
	//metodo para 
	public  void mostrarPantalla(JPanel panel) {
		ventana.setContentPane(panel);
		ventana.setVisible(true);
		
	}
	//metodo para poner un String en un label
	public void setStringLabel(JLabel etiqueta, String txt) {
		etiqueta.setText(txt);
	}
	//metodo para poner double en un label que le pasemos
	public void setDoubleLabel(JLabel etiqueta, double d) {
		etiqueta.setText(Double.toString(d));
	}
	
	//metodo para poner ints en un label que le pasemos
	public void setIntLabel(JLabel etiqueta, int n) {
		etiqueta.setText(Integer.toString(n));
	}

}
