package agenda;

public class Main {

	public static void main(String[] args) {
		
		
		Agenda agenda = new Agenda(2);
		
		agenda.imprimir();
		
		Persona p1 = new Persona("Juan", 30);
		Persona p2 = new Persona("Maria", 25);
		Persona p3 = new Persona("Pedro", 40);
		
		agenda.guardar(p1, "123456789");
		agenda.guardar(p2, "987654321");
		agenda.guardar(p3, "555555555");
		
		agenda.imprimir();
	}

}
