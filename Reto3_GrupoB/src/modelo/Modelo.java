package modelo;

public class Modelo {
	public Metodos metodos;
	public Conexion conexion;
	public Autobus autobus;
	public Billete billete;
	public Cliente cliente;
	public Datos datos;
	public Ficheros ficheros;
	public Lineasdeautobuses lineasdeautobuses;
	public Municipio municipio;
	public Parada parada;
	
	
	public Modelo() {

		metodos = new Metodos();
		conexion=new Conexion();
		autobus=new Autobus();
		billete=new Billete();
		cliente=new Cliente();
		datos=new Datos();
		ficheros=new Ficheros();
		lineasdeautobuses=new Lineasdeautobuses();
		municipio=new Municipio();
		parada=new Parada();
		
		//terminado
		
	}
	
	
}
