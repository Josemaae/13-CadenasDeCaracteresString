package Ejercicios;


import java.util.Scanner;

public class Tres {
	//Une dos cadenas i.p.t. usando el método concat()
	
public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String cadenaUno;
		String cadenaDos;
		
		System.out.println("Introduce una cadena");
		cadenaUno=leer.nextLine();
		System.out.println("Introduce otra cadena");
		cadenaDos=leer.nextLine();
		
		System.out.println(cadenaUno+" "+cadenaDos);
		System.out.println(cadenaUno.concat(" "+cadenaDos));
}
}
