package Ejercicios;

public class Diez {
	/*
	 * Utiliza el método replaceAll() para modificar una cadena i.p.t. en la que
	 * reemplazo una cadena por otra tantas veces como aparezca.
	 */
	
	public static void main(String[] args) {
		
		String cadenaIntro="Hola no soy no jose";
		String cadenaCambio="si";
		
		System.out.println(cadenaIntro.replaceAll("no", cadenaCambio)); 
		
	}
	
	
	
}
