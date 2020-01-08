package ejercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria implements Catalogo{
	
	private ArrayList<Vehiculo> catalogo;
	
	public Concesionaria() {
		
		crearCatalogo();
		
	}

	public void crearCatalogo() {
		catalogo=new ArrayList<Vehiculo>();
		catalogo.add(new Auto(200000, "Peugeot", "206", 4));
		catalogo.add(new Moto(60000, "Honda", "Titan", 125));
		catalogo.add(new Auto(250000, "Peugeot", "208", 5));
		catalogo.add(new Moto(80500.50, "Yamaha", "YBR", 160));
	}

	@Override
	public void visualizarCatalogo() {
		
		for(Vehiculo e: catalogo) {
			System.out.println(e. dameDatos());
		}
		System.out.println("=============================");
		mostrarMayor();
		mostrarMenor();
		contieneLetra();
		System.out.println("=============================");
		ordenar();
	}

	@Override
	public void mostrarMayor() {
	
		Vehiculo  mayor=catalogo.get(0);
		for(Vehiculo veh:catalogo) {
			if(veh.compareTo(mayor)==1) {
				mayor=veh;
			}
		}
		System.out.println("Vehículo más caro: "+mayor.toString());
		
	}
	

	@Override
	public void mostrarMenor() {
	
		Vehiculo menor=catalogo.get(0);
		for(Vehiculo veh:catalogo) {
			if(veh.compareTo(menor)==-1) {
				menor=veh;
			}
		}
		System.out.println("Vehículo más barato: "+menor.toString());
		
	}

	@Override
	public void contieneLetra() {
	ArrayList<Vehiculo> contienenLetra=new ArrayList<Vehiculo>();
		for(Vehiculo veh:catalogo) {
			String modelo=veh.dameModelo();
			for(int i=0;i<modelo.length();i++) {
				if(modelo.charAt(i)=='Y') {
					contienenLetra.add(veh);
				}
			}
		
		}
		if(!contienenLetra.isEmpty()) {
			if(contienenLetra.size()==1) {
				System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+contienenLetra.get(0).toString()+" "+contienenLetra.get(0).stringPrecio());
			}
						
		}
	}
	public void ordenar() {
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		Collections.sort(catalogo,Collections.reverseOrder());
		for(Vehiculo e:catalogo) {
			System.out.println(e.toString());
		}
	}

}
