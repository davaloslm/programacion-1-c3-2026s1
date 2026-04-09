package arreglos;

public class Ej3Moodle {
	public static void imprimir(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int[] agregarAtras(int[] a, int x) {
		int[] nuevo = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			nuevo[i] = a[i];
		}
		nuevo[nuevo.length-1] = x;
		return nuevo;
	}

	public static void main(String[] args) {
		int []a={1,5,9};
		System.out.println(a);
		imprimir(agregarAtras(a, 22));
	}

}
