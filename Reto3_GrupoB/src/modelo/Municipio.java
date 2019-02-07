package modelo;

public class Municipio {
	// ATRIBUTOS
		private String nombre;
		private int CodigoPostal;
		private int relacionParada;

		// CONSTRUCTORES
		public Municipio() {
		}

		public Municipio(String nombre, int codigoPostal, int relacionParada) {
			super();
			this.nombre = nombre;
			CodigoPostal = codigoPostal;
			this.relacionParada = relacionParada;
		}

		// GETTERS Y SETTERS
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getCodigoPostal() {
			return CodigoPostal;
		}

		public void setCodigoPostal(int codigoPostal) {
			CodigoPostal = codigoPostal;
		}

		public int getRelacionParada() {
			return relacionParada;
		}

		public void setRelacionParada(int relacionParada) {
			this.relacionParada = relacionParada;
		}


}
