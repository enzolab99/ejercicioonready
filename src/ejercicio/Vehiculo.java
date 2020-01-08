package ejercicio;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	
private double precio;
private String marca, modelo;

			public Vehiculo(double precio, String marca, String modelo) {
				this.precio=precio;
				this.marca=marca;
				this.modelo=modelo;
				
			}
			
			public int  compareTo(Vehiculo v) {
				if(this.precio>v.precio) {
					return 1;
				}else if(this.precio<v.precio) {
					return -1;
				}else {
					return 0;
				}
				
			}
			
			public double damePrecio() {
				return precio;
			}
			public String  stringPrecio() {
				return "$"+String.format("%.2f",this.damePrecio());
			}
			
			
			public String dameMarca() {
				return marca;
			}
			
			public String dameModelo() {
				return modelo;
			}
			public String toString() {
				return this.dameMarca()+" "+this.dameModelo();
				
			}
			public abstract String dameDatos() ;
			

}
