package modelo;

import java.util.ArrayList;

public class Datos {

	//En esta clase tendremos de forma mas accesible los datos para cargar la base y otros datos que puedan cambiar y sea posible facilitar el acceso a ellos
	
	//datos de la conexión de la BBDD
	static String pass_BBDD="admin";
	static String user_BBDD="admin";
	static String nombre_BBDD="reto3";
	static String server_BBDD="127.0.0.1";
	static String URL_BBDD="jdbc:mysql://"+server_BBDD+":3306/"+nombre_BBDD+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	//datos para la URL del fichero y la ruta de destino para guardar el ticket
	static String URL_Fichero="";
	static String URL_destino_ticket="";
	
	
	//Arrays que vamos a cargar con los datos de la BBDD
	private ArrayList<Lineasdeautobuses> lineas=Metodos.cargarArrLineas();
	private ArrayList<Municipio> municipios=Metodos.cargarArrMunicipios();
	private ArrayList<Cliente> clientes=Metodos.cargarArrClientes();
	private ArrayList<Parada> paradas=Metodos.cargarArrParadas();
	private ArrayList<Autobus> autobuses=Metodos.cargarArrAutobuses();
	public ArrayList<Lineasdeautobuses> getLineas() {
		return lineas;
	}
	public void setLineas(ArrayList<Lineasdeautobuses> lineas) {
		this.lineas = lineas;
	}
	public ArrayList<Municipio> getMunicipios() {
		return municipios;
	}
	public void setMunicipios(ArrayList<Municipio> municipios) {
		this.municipios = municipios;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<Parada> getParadas() {
		return paradas;
	}
	public void setParadas(ArrayList<Parada> paradas) {
		this.paradas = paradas;
	}
	public ArrayList<Autobus> getAutobuses() {
		return autobuses;
	}
	public void setAutobuses(ArrayList<Autobus> autobuses) {
		this.autobuses = autobuses;
	}
	
	
}
