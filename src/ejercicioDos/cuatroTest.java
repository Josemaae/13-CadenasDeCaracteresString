package ejercicioDos;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cuatroTest extends cuatro{

	/*@Test
	void testPonerMaysculas() {
		cuatro frase = new cuatro();
		StringBuffer cadena= new StringBuffer("Hola soy tonto");
		char letra='o';
		StringBuffer cadenaEsperada = new StringBuffer("HOla sOy tOntO");
		assertEquals(cadenaEsperada, frase.ponerMayusculas(cadena, letra)); 
	}*/
	/*public static void main(String[] args) {
		StringBuffer cadena = new StringBuffer("Hola me llamo jose");
		char letra = 'o';
		cuatro ejemplo = new cuatro();
		System.out.println(ejemplo.ponerMayusculas(cadena, letra)); 
	}*/
	public static void main(String[] args) {
		char letra='a';
		cuatro uno = new cuatro();
		System.out.println(uno.mayuscula(letra));
	}
}
