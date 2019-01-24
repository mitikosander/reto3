package modelo;

public class Parada {
	// ATRIBUTOS
		private double codigoParada = 0;
		private String calle = "";
		private String nombreParada = "";
		private double coordenadas = 0;

		// CONSTRUCTORES
		public Parada() {
		}

		public Parada(double codigoParada, String calle, String nombreParada, double coordenadas) {
			this.codigoParada = codigoParada;
			this.calle = calle;
			this.nombreParada = nombreParada;
			this.coordenadas = coordenadas;
		}

		// GETTERS Y SETTERS
		private double getCodigoParada() {
			return codigoParada;
		}

		private void setCodigoParada(double codigoParada) {
			this.codigoParada = codigoParada;
		}

		private String getCalle() {
			return calle;
		}

		private void setCalle(String calle) {
			this.calle = calle;
		}

		private String getNombreParada() {
			return nombreParada;
		}

		private void setNombreParada(String nombreParada) {
			this.nombreParada = nombreParada;
		}

		private double getCoordenadas() {
			return coordenadas;
		}

		private void setCoordenadas(double coordenadas) {
			this.coordenadas = coordenadas;
		}

}
