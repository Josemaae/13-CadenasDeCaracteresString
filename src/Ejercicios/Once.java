package Ejercicios;

public class Once {
	/*
	 * Usando el m�todo split() parte una cadena en dos. Para ello introduce una
	 * cadena que tenga la palabra �corte� en el medio. Ahora usa esa palabra como
	 * par�metro de split(). Observa que el retorno del m�todo es un String[].
	 * Muestra los dos strings y observa si la palabra �corte� aparece en alguna de
	 * ellas
	 */

	public static void main(String[] args) {
		
		String cadena="Hola no soy tu corte soy yo";
		String frases[]=cadena.split("corte "); 
		System.out.println(frases[0]);
		System.out.println(frases[1]);
	}
	
	
}
