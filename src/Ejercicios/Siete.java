package Ejercicios;

import java.util.Scanner;

public class Siete {
	/*
	 * Usa el m�todo isEmpty() para comprobar si una cadena est� vac�a. Para ello
	 * crea una cadena vac�a y luego ll�nala.
	 */

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String cadena;

		System.out.println("Introduce una cadena");
		cadena = leer.nextLine();
		
		if (cadena.isEmpty()) {
			System.out.println("Esta vacia");
			
			System.out.println(cadena="cadena ahora vale estas letras");
		}
		
	}
}