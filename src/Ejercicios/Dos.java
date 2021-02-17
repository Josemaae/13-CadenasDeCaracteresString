package Ejercicios;


import java.util.Scanner;

public class Dos {
	//Repite el ejercicio anterior pero sin discriminar las mayúsculas.compareToIgnoreCase()
	
public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String cadenaUno;
		String cadenaDos;
		
		System.out.println("Introduce una cadena");
		cadenaUno=leer.nextLine();
		System.out.println("Introduce otra cadena");
		cadenaDos=leer.nextLine();
		
		if (cadenaUno.compareToIgnoreCase(cadenaDos)==0) {
			System.out.println("Las cadenas son iguales");	
		} else {
			System.out.println("Las cadenas son diferentes");
		}
			
		
			
		}
	
}
