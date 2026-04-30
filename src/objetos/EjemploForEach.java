package objetos;

public class EjemploForEach {

	public static void main(String[] args) {
		int[] numeros = {1,25,65,84};
		
		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}
