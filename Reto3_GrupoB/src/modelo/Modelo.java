package modelo;

import vista.Paradas;

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
	public Lineasdeautobuses[] obtenerLineas() {
		
		//acceder a la BBDD y rellenar el Array de Lineas
		Lineasdeautobuses lineas[] = new Lineasdeautobuses[3];
		Lineasdeautobuses L1 = new Lineasdeautobuses();
		Lineasdeautobuses L2 = new Lineasdeautobuses();
		Lineasdeautobuses L3 = new Lineasdeautobuses();	
		
		L1.setAutobusrecorrerlinea("unox");
		L2.setAutobusrecorrerlinea("dosx");
		L3.setAutobusrecorrerlinea("trex");		
		
		lineas[0]=L1;
		lineas[1]=L2;
		lineas[2]=L3;
		
		return lineas;

	}
	//metodo que obtiene las paradas de la linea que le pases
	public Lineasdeautobuses[] obtenerParadas(Lineasdeautobuses linea) {
		//select todas las poblaciones, despues select de lineas de todas la poblaciones, comparar y seleccionar 
		//solo las poblaciones de la linea que tu quieres
		Lineasdeautobuses lineas[] = new Lineasdeautobuses[3];
		Lineasdeautobuses L1 = new Lineasdeautobuses();
		Lineasdeautobuses L2 = new Lineasdeautobuses();
		Lineasdeautobuses L3 = new Lineasdeautobuses();	
		
		
		
		L1.setCodlinea(1);
		L2.setCodlinea(4);
		L3.setCodlinea(2);
		
		return ;
		
		
	}
	
}
