package Ejercicios;

public class Seis {
 
	//Repite el ejercicio anterior para una cadena en vez de una letra
	
	public static void main(String[] args) {
	
		String cadenaString="no por mucho madrugar se hace solo el cafe"+
		 "a menos que tengas una cafetera automatica ";
		String cadena="por";
		int posicion = 0;
		do {
			posicion=cadenaString.indexOf(cadena,posicion);
			System.out.println(posicion);
			posicion++;
		}while(posicion<cadenaString.length()&&posicion!=0);
		System.out.println();
		
	}

	
}
