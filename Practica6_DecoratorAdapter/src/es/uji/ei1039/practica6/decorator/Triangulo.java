package es.uji.ei1039.practica6.decorator;

public class Triangulo extends AsciiArt {
	
	public Triangulo( int longitudLado, char caracterRelleno ) {
		
		String[] nuevoLineas = new String[longitudLado];
		String temp = new String();
		String temp2 = new String();
		for (int i = 0; i < longitudLado; i++) {
			temp += caracterRelleno;
			temp2 += temp;
			for (int j = i+1; j < longitudLado; j++) {
				temp2 += " ";
			}
			nuevoLineas[i] = temp2;
			temp2 = new String();
		}
		
		super.lineas = nuevoLineas;
	}
}
