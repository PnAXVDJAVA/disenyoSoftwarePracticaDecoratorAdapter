package es.uji.ei1039.practica6.decorator;

public class Marco extends AsciiArtDecorator {
	
	private AsciiArt asciiArt;
	
	public Marco( AsciiArt asciiArt, char caracter ) {
		this.asciiArt = asciiArt;
		this.creaMarco( caracter );
	}
	
	private void creaMarco( char caracter ) {
		String[] lineaAntigua = this.getLineas();
		String[] nuevoLinea = new String[ this.getAlto() + 2 ];
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
		
		this.setLineas( nuevoLinea );
	}
	
	@Override
	public String[] getLineas() {
		return this.asciiArt.getLineas();
	}
	
	@Override
	public int getAlto() {
		return this.asciiArt.getAlto();
	}
	
	@Override
	public int getAncho() {
		return this.asciiArt.getAncho();
	}
	
	@Override
	public void setLineas( String[] lineas ) {
		this.asciiArt.setLineas( lineas );
	}
}
