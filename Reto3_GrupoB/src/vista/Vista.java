package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista {

	private  Contenedor ventana;
	private Inicio pantCarga;
	private Lineas lineas;
	private Login login;
	private Pagar pagar;
	private Paradas paradas;
	private Registro registro;
	private SeleccionFecha seleccionFecha;
	private Ticket ticket;
	private Vueltas vueltas;
	private Vista() {
		
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
	public Contenedor getVentana() {
		return ventana;
	}
	public void setVentana(Contenedor ventana) {
		this.ventana = ventana;
	}
	public Inicio getPantCarga() {
		return pantCarga;
	}
	public void setPantCarga(Inicio pantCarga) {
		this.pantCarga = pantCarga;
	}
	public Lineas getLineas() {
		return lineas;
	}
	public void setLineas(Lineas lineas) {
		this.lineas = lineas;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Pagar getPagar() {
		return pagar;
	}
	public void setPagar(Pagar pagar) {
		this.pagar = pagar;
	}
	public Paradas getParadas() {
		return paradas;
	}
	public void setParadas(Paradas paradas) {
		this.paradas = paradas;
	}
	public Registro getRegistro() {
		return registro;
	}
	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	public SeleccionFecha getSeleccionFecha() {
		return seleccionFecha;
	}
	public void setSeleccionFecha(SeleccionFecha seleccionFecha) {
		this.seleccionFecha = seleccionFecha;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Vueltas getVueltas() {
		return vueltas;
	}
	public void setVueltas(Vueltas vueltas) {
		this.vueltas = vueltas;
	}

}
