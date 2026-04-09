package recursion;

public class RecursionConEnterosMoodle {

	static int sumaDesdeUnoHasta(int n) {
		if (n == 1) {
			return 1;
		} else
			return n + sumaDesdeUnoHasta(n - 1);

	}

	public static int sumaEntre(int n, int m) {
		if (n == m) {
			return m;
		} else
			return n + sumaEntre(n + 1, m);

	}

	static void imprimirHasta(int n){
		 if(n == 1)
			 System.out.println(n);
		 else {
			 imprimirHasta(n-1);
			 System.out.println(n);
		 }
	 }
	 
	 static void imprimirDesde(int n){
		 if(n == 1)
			 System.out.println(n);
		 else{
			 System.out.println(n);
			 imprimirDesde(n-1);
		 }
		 
	 }

	public static void main(String[] args) {
//		imprimirHasta(5);
//		System.out.println(" ");
//		imprimirDesde(5);
//		System.out.println(sumaDesdeUnoHasta(5));
	}
}
