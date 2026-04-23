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
				
				//Agrandar
				Persona[] contactosAux = new Persona[this.contactos.length+1];
				String[] telefonosAux = new String[this.telefonos.length+1];
				
				//Copiar contactos y telefonos
				for (int j = 0; j < contactos.length; j++) {
					contactosAux[j] = contactos[j];
					telefonosAux[j] = telefonos[j];
				}
				
				//guardar
				contactosAux[contactos.length] = contacto;
				telefonosAux[telefonos.length] = telefono;
				
				//sobreescribir
				this.contactos = contactosAux;
				this.telefonos = telefonosAux;
				
				return;
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
