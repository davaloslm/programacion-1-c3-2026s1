package agenda;

public class Agenda {
	
	private Persona[] contactos;
	private String[] telefonos;
	
	
	//constructor
	public Agenda(int tamanio) {
		
		contactos = new Persona[tamanio];
		telefonos = new String[tamanio];
		
	}
	
	//b
	
	public void guardar(Persona contacto, String telefono) {
		
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) { // si hay lugar en la agenda
				contactos[i] = contacto;
				telefonos[i] = telefono;
				return;
			}else { // si no hay lugar en la agenda
				
			
			}
		}
		
	}
	
	public void imprimir() {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null) {
				System.out.println(contactos[i].nombre + " " + telefonos[i]);
			}
		}
	}

	


}
