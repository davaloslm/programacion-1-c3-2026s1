package strings;

public class Ej3Moodle {

	public static boolean sonIguales(String s1, String s2) { // declaramos nuestra funcion fuera del main

		if (s1.length() != s2.length()) { // comparamos la longitud de las cadenas, si son distintas, no pueden ser
											// iguales, por lo tanto devolvemos false
			return false;
		}

		for (int i = 0; i < s1.length(); i++) { // recorremos cada caracter de las cadenas, si encontramos al menos un
												// caracter distinto, devolvemos false
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}

		return true; // noten que la funcion RETORNA un valor booleano. No lo imprime
	}



	public static void main(String[] args) { // en main vamos a llamar a la funcion que declaramos

		String string1 = "hola";
		String string2 = "HOLA";

		System.out.println(sonIguales(string1, string2)); // Para imprimirlo necesitamos hacer el llamado dentro del
															// System.out.println()
	}

}
