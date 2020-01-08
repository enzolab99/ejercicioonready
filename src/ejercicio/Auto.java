package ejercicio;

public class Auto extends Vehiculo {
private int puertas;	
		public  Auto(double precio, String marca, String modelo, int puertas) {
			super(precio, marca, modelo);
			this.puertas=puertas;
		}
		@Override
		public String dameDatos() {
			// TODO Auto-generated method stub
			return "Marca: "+this.dameMarca()+" // Modelo: "   +this.dameModelo()+" // Puertas: "+this.damePuertas()+" // Precio: "+this.stringPrecio();
		}
		
		public int damePuertas() {
			return puertas;
		}
	

}
