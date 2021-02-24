package ejercicioDos;

/*Implementa un programa que reciba una cadena S y una letra X, y coloca en mayúsculas
cada ocurrencia de X en S. (la función debe modificar la variable S).(StringBuffer)*/

public class cuatro {
	
	public StringBuffer ponerMayusculas(StringBuffer cadena, char letra) {

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				cadena.setCharAt(i, mayuscula(cadena.charAt(i)));
				

			}
		}

		return cadena;

	}

	public char mayuscula(char letra) {
		String letraCambiada = Character.toString(letra);
		letraCambiada.toUpperCase();
		System.out.println(letraCambiada);
		char letraCambiadaDos = letraCambiada.charAt(0);
		return letraCambiadaDos;
	}
}

