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
		private int getCodigoAutobus() {
			return codigoAutobus;
		}

		private void setCodigoAutobus(int codigoAutobus) {
			this.codigoAutobus = codigoAutobus;
		}

		private int getNumeroDePlazas() {
			return numeroDePlazas;
		}

		private void setNumeroDePlazas(int numeroDePlazas) {
			this.numeroDePlazas = numeroDePlazas;
		}

		private double getConsummo() {
			return consummo;
		}

		private void setConsummo(double consummo) {
			this.consummo = consummo;
		}

		private String getColor() {
			return color;
		}

		private void setColor(String color) {
			this.color = color;
		}


}
