package mazoYcarta;

import java.util.Random;

public class Mazo {

	Carta[] cartas;
	int primeraPos=0;

	public Mazo() {
		this.cartas = new Carta[40];
		int j = 0;
		for (int p = 0; p <= 3; p++) {
			for (int i = 1; i <= 7; i++) {
				cartas[j] = new Carta(p, i);
				j++;
			}
			for (int i = 10; i <= 12; i++) {
				cartas[j] = new Carta(p, i);
				j++;
			}
		}
		
	}

	public void mostrarMazo() {
		for (int i = 0; i < cartas.length; i++) {
			cartas[i].mostrarCarta();
		}
	}

	public void mezclarMazo() {
		for (int i = 0; i < cartas.length; i++) {
			Random r = new Random();
			int aux = r.nextInt(0,40);
			Carta a  = cartas[i];
			Carta b = cartas[aux];
			cartas[i]=b;
			cartas[aux]=a;
			
		}
	}

}