package OperacionesBasicas;

public class Ejercicio1D {

	public static void main(String[] args) {
		
		//d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		
		
		int numeroFin = 5;
		
		for (int numeroInicio = 14; numeroInicio >=  numeroFin ; numeroInicio--) {
			
			if (numeroInicio % 2 == 0) {
				
				System.out.println("Las impresiones pares son: " + numeroInicio);
				
				}				
			}
		}

}
