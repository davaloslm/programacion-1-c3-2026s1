package objetos;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	//Constructor
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}

	public void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
	}

	static boolean bisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0)
			return true;
		else if (anio % 400 == 0)
			return true;
		else
			return false;
	}

	public static int diasDelMes(int mes, int anio) {
		if (bisiesto(anio) && mes == 2) {
			return 29;
		} else if (mes == 2) {
			return 28;
		} else if (mes == 4 || mes == 11 || mes == 6 || mes == 9) {
			return 30;
		}
		return 31;

	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	


}
