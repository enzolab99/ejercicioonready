package ejercicio;

public class Moto extends Vehiculo {
	private int cilindrada;
		public Moto(double precio, String marca, String modelo, int cilindrada) {
			super(precio, marca, modelo);
			this.cilindrada=cilindrada;
		}
		
	public String dameCilindrada() {
		return cilindrada+"c";
	}

	@Override
	public String dameDatos() {
			return "Marca: "+this.dameMarca()+" // Modelo: "   +this.dameModelo()+" // Cilindrada: "+this.dameCilindrada()+" // Precio: "+this.stringPrecio();
	}
}
