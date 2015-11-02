package es.uji.ei1039.practica6.decorator;

public class Cuadrado extends AsciiArt {
	
	public Cuadrado( int longitudLado, char caracterRelleno ) {
		
		String [] nuevoLineas = new String[ longitudLado ];
		for( int i = 0; i < longitudLado; i++ ) {
			nuevoLineas[i] = new String();
			for( int j = 0; j < longitudLado; j++ ) {
				nuevoLineas[i] += caracterRelleno;
			}
		}
		
		super.lineas = nuevoLineas;
	}

}
