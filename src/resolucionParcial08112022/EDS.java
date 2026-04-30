package resolucionParcial08112022;


public class EDS {
	Proyecto[] proyectos;
	
	//b)
	public Software elaboradoPorExpertos() {
		Software software = null;
		int cantMaxExpertos = 0;
		
		for (Proyecto p : proyectos) {
			int contadorExpertos = 0;
			
			//contamos expertos
			for (Desarrollador d : p.desarrolladores) {
				if (d.experiencia >= 10) {
					contadorExpertos++;
				}
			}
			
			//hallamos el sw con mas expertos
			if (contadorExpertos >= cantMaxExpertos) {
				cantMaxExpertos = contadorExpertos;
				software = p.producto;
			}
		}
		
		return software;
	}
}
