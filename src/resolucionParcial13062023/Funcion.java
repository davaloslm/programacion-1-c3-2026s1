package resolucionParcial13062023;

import java.util.Date;


public class Funcion {
	Date fecha;
	Date horaInicio; //La consigna dice Time horaInicio, pero Java no tiene ese tipo de dato. Cambio a Date solo para que compile.
	Sector[] sectores;
	
	

	//metodo auxiliar para el punto b
	public boolean estaAgotada() {
		for (Sector sector : sectores) {
			for (Asiento asiento : sector.asientos) {
				if (asiento.usuario == null) { //si encuentro un asiento libre, ya sabemos que no esta agotada. retorno false
					return false;
				}
			}
		}
		return true; //si recorro todos los asientos y no encuentro ninguno libre, esta agotada. retorno true
	}
}
