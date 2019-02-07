package modelo;

public class Parada {
	// ATRIBUTOS
		private double codigoParada ;
		private String calle ;
		private String nombreParada;
		private double latitud ;
		private double longitud;
		// CONSTRUCTORES
		public Parada() {
		}

		public Parada(double codigoParada, String calle, String nombreParada, double latitud,double longitud) {
			this.codigoParada = codigoParada;
			this.calle = calle;
			this.nombreParada = nombreParada;
			this.latitud = latitud;
			this.longitud=longitud;
		}

		// GETTERS Y SETTERS
		public double getCodigoParada() {
			return codigoParada;
		}

		public void setCodigoParada(double codigoParada) {
			this.codigoParada = codigoParada;
		}

		public String getCalle() {
			return calle;
		}

		public void setCalle(String calle) {
			this.calle = calle;
		}

		public String getNombreParada() {
			return nombreParada;
		}

		public void setNombreParada(String nombreParada) {
			this.nombreParada = nombreParada;
		}

		public double getLatitud() {
			return latitud;
		}

		public void setLatitud(double latitud) {
			this.latitud = latitud;
		}
		
		public double getLongitud() {
			return longitud;
		}
		
		public void setLongitud(double longitud) {
			this.longitud=longitud;
		}
}
