package OperacionesBasicas;

public class Ejercicio1B {

	public static void main(String[] args) {
		
		
		//b. A lo anterior, solo muestre los números pares
		int numeroInicio = 5;
		int numeroFin = 14;
		
		
		
		while (numeroInicio <= numeroFin ) {
								
			if (numeroInicio % 2 == 0) {
						System.out.println("Las impresiones pares son: " + numeroInicio);
			}

			numeroInicio ++;
		}
				
	}
}

