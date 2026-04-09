package recursion;

public class RecursionConStringsMoodle {

	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { // arranca en la posici�n 1 dejando afuera la posici�n 0
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}

	// ejercicio 1
	public static void imprimirEspaciado(String s) {
		if (s.length() <= 1) { // caso base
			System.out.println(s);
		} else {
			System.out.print(s.charAt(0) + " "); // caso recursivo
			imprimirEspaciado(s.substring(1));

		}
	}

	// ejercicio 3
	public static String reverso(String s) {
		if (s.length() <= 1) {
			return s;
		} else {
			return reverso(resto(s)) + s.charAt(0);
		}
	}
	
	public static void main(String[] args) {

		String miString = "hola";
		imprimirEspaciado(miString);
		System.out.println(reverso(miString));
	}
}
