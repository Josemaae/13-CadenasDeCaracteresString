package Ejercicios;

public class Ocho {

	/*
	 * Usa el método lastIndexOf() para repetir el ejercicio 5 y 6. El resultado,
	 * esta vez, debe ser que aparezcan las apariciones de letra y cadenas desde la
	 * última posición a la primera
	 */
	
	public static void main(String[] args) {
		
		String cadenaString="no por mucho madrugar se hace solo el cafe"+
		 "a menos que tengas una cafetera automatica ";
		char cadena='o';
		int posicion = 0;
		do {
			posicion=cadenaString.lastIndexOf(cadena, posicion);
			System.out.println(posicion);
			posicion++;
		}while(posicion<cadenaString.length()&&posicion!=0);
		System.out.println();
		
	}
	
}

