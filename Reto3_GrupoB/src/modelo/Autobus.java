package modelo;

public class Autobus {
	// ATRIBUTOS
		private int codigoAutobus = 0;
		private int numeroDePlazas = 0;
		private double consummo = 0;
		private String color = "";

		// CONSTRUCTORES
		public Autobus() {
		}

		public Autobus(int codigoAutobus, int numeroDePlazas, double consummo, String color) {
			super();
			this.codigoAutobus = codigoAutobus;
			this.numeroDePlazas = numeroDePlazas;
			this.consummo = consummo;
			this.color = color;
		}

		// GETTERS Y SETTERS
		public int getCodigoAutobus() {
			return codigoAutobus;
		}

		public void setCodigoAutobus(int codigoAutobus) {
			this.codigoAutobus = codigoAutobus;
		}

		public int getNumeroDePlazas() {
			return numeroDePlazas;
		}

		public void setNumeroDePlazas(int numeroDePlazas) {
			this.numeroDePlazas = numeroDePlazas;
		}

		public double getConsummo() {
			return consummo;
		}

		public void setConsummo(double consummo) {
			this.consummo = consummo;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}


}
