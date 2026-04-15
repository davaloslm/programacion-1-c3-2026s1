package objetos;

import java.awt.*;

public class ClasePointRectangle {

	double distancia(Point p1, Point p2) {
		int x1 = p1.x;
		int y1 = p1.y;
		int x2 = p2.x;
		int y2 = p2.y;
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return distancia;
	}

	double diagonal(Rectangle r) {
		Point p = new Point(r.x, r.y);
		Point q = new Point(r.x + r.width, r.y + r.height);
		double diagonal = distancia(p, q);
		return diagonal;
	}

	public static void main(String[] args) {

	}

}
