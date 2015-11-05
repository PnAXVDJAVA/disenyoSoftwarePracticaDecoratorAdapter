package es.uji.ei1039.practica6.decorator;

public class Marco extends AsciiArtDecorator {
	
	public Marco( AsciiArt asciiArt, char caracter ) {
		super( asciiArt );
		this.creaMarco( caracter );
	}
	
	private void creaMarco( char caracter ) {
		String[] lineaAntigua = getLineas();
		String[] nuevoLinea = new String[ lineaAntigua.length + 2 ];
		int nuevoAncho = getAncho() + 2;
		String lineaTemp = new String();
		
		//Creamos la cadena del marco de arriba y abajo (que será la misma)
		String marcoArribaYAbajo = "";
		for (int j = 0; j < nuevoAncho; j++) {
			marcoArribaYAbajo += caracter;
		}
		//Creamos el marco de arriba
		nuevoLinea[0] = marcoArribaYAbajo;
		
		//Creamos el marco de la derecha y de la izquierda
		for (int i = 1; i < nuevoLinea.length - 1; i++) {
			lineaTemp += caracter;
			lineaTemp += lineaAntigua[i-1];
			lineaTemp += caracter;
			nuevoLinea[i] = lineaTemp;
			lineaTemp = new String();
		}
		
		//Creamos el marco de abajo
		nuevoLinea[ nuevoLinea.length - 1 ] = marcoArribaYAbajo;
		
		super.setLineas( nuevoLinea );
	}
}
