package modelo;

public class Modelo {
	public Metodos metodos;
	public Conexion conexion;
	public Punto punto;

	public Modelo() {

		metodos = new Metodos();
		conexion = new Conexion();

		punto = new Punto();

	}

}
