package objetos;

public class Main {

	public static void main(String[] args) {

		Fecha f = new Fecha(15, 5, 1999);
		
		int a = f.getDia();
		a++;
		
		f.imprimir();
		
		System.out.println(f.getDia());
		
	}

}
