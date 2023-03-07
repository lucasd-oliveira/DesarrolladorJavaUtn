package OperacionesBasicas;

public class Ejercicio2D {

	public static void main(String[] args) {
		
	
	/*2D. Determinar si una
	persona pertenece al segmento de ingresos altos */	
		
		/*“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
	todas y todos los convivientes:
	● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
	(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
	● Tener 3 o más vehículos con una antigüedad menor a 5 años.
	● Tener 3 o más inmuebles.
	● Poseer una embarcación, una aeronave de lujo o ser titular de activos
	societarios que demuestren capacidad económica plena.”*/
	
		
		double ingresosMensuales = 500.000;
		int vehiculos = 4;
		int inmuebles = 3;
		boolean economiaPlena = true ;
		
		
		if ((ingresosMensuales >= 489.083) && (vehiculos >= 3) && (inmuebles >=3) && (economiaPlena == true)) {
			
			System.out.println("Este Hogar pertenece al segmento de Ingresos altos");
		}
		
		else  {
			System.out.println("Esta Hogar NO pertenece al segmento de Ingresos altos");
		}
		
		
	}

}
