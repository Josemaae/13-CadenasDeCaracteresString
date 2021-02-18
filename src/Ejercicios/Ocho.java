package Ejercicios;

public class Ocho {

	/*
	 * Usa el método lastIndexOf() para repetir el ejercicio 5 y 6. El resultado,
	 * esta vez, debe ser que aparezcan las apariciones de letra y cadenas desde la
	 * última posición a la primera
	 */

	public static void main(String[] args) {

		String cadenaString = "Hola, me llamo jose";
		char cadena = 'o';
		int posicion = cadenaString.lastIndexOf(cadena);
		while (posicion != -1) {
			System.out.println(posicion);
			posicion = cadenaString.lastIndexOf(cadena, posicion - 1);
		}
	}
}