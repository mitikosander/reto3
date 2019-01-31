package modelo;

import vista.Paradas;

public class Modelo {
	public Metodos metodos;
	public Conexion conexion;
	public Punto punto;
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
    punto = new Punto();
		
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
		
		//ACCEDER A LA BBDD
		//select * from lineas;
		
		return lineas;

	}

	public Parada[] obtenerParadas(int codLinea) {
		//select todas las poblaciones, despues select de lineas de todas la poblaciones, comparar y seleccionar 
		//solo las poblaciones de la linea que tu quieres
		Parada paradas[] = new Parada[3];
		Parada p1 = new Parada();
		Parada p2 = new Parada();
		Parada p3 = new Parada();
		//He tenido que cambiar los setters de parada a public para que me dejase usarlo, si hay que cambiarlo solo hay que ponerlos en private
		p1.setCodigoParada(12);
		p1.setNombreParada("koldo");
		p2.setCodigoParada(22);
		p2.setNombreParada("derio");
		p3.setCodigoParada(32);
		p3.setNombreParada("sanma");
		
		paradas[0]=p1;
		paradas[1]=p2;
		paradas[2]=p3;
		
		//ACCEDER A LA BBDD
		//select * from paradas where Linea = codLinea;
		
		return paradas;
}
}
