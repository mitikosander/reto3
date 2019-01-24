package modelo;

public class Municipio {
	// ATRIBUTOS
		private String nombre = "";
		private String CodigoPostal = "";
		private String relacionParada = "";

		// CONSTRUCTORES
		public Municipio() {
		}

		public Municipio(String nombre, String codigoPostal, String relacionParada) {
			super();
			this.nombre = nombre;
			CodigoPostal = codigoPostal;
			this.relacionParada = relacionParada;
		}

		// GETTERS Y SETTERS
		private String getNombre() {
			return nombre;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}

		private String getCodigoPostal() {
			return CodigoPostal;
		}

		private void setCodigoPostal(String codigoPostal) {
			CodigoPostal = codigoPostal;
		}

		private String getRelacionParada() {
			return relacionParada;
		}

		private void setRelacionParada(String relacionParada) {
			this.relacionParada = relacionParada;
		}


}
