package Ejercicios;


import java.util.Scanner;

public class Cuatro {
	/*Sobre el primer ejercicio haz que el programa, en caso de que las cadenas no sean
	iguales, nos diga si la segunda está contenida en la primera, usa el método contains()*/
	
public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String cadenaUno;
		String cadenaDos;
		
		System.out.println("Introduce una cadena");
		cadenaUno=leer.nextLine();
		System.out.println("Introduce otra cadena");
		cadenaDos=leer.nextLine();
		
		if (cadenaUno.compareTo(cadenaDos)==0) {
			System.out.println("Las cadenas son iguales");	
		} else if (cadenaUno.contains(cadenaDos)) {
			System.out.println("la segunda cadena esta contenida en la primera");
			
		}else {
			System.out.println("la segunda cadena NO esta en la primera ");
		}
			
		
			
		}
	
	
	
	
	
	
}

