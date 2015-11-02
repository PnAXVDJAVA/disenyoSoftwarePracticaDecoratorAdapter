package es.uji.ei1039.practica6.decorator;

public class Marco extends AsciiArtDecorator {
		
	public Marco (AsciiArt asciiArt, char caracter) {
		super( asciiArt );
		this.creaMarco(caracter);
	}
	
	private void creaMarco ( char caracter ) {
		String[] lineaAntigua = super.getLineas();
		String[] nuevoLinea = new String[lineaAntigua.length+2];
		String lineaTemp = new String();
		
		
		
		for (int i = 0; i < nuevoLinea.length; i++) {
			for (int j = 0; j < super.getAncho(); j++) {
				if (i == 0 || i == super.getAlto()-1) {
					lineaTemp += caracter;
				} 
				else if ( (j == 0 && i != 0) || (j == super.getAncho()-1 && i != super.getAncho()-1) ) {
					lineaTemp += caracter;
				} 
				else {
					lineaTemp += lineaAntigua[i-1];
					j += super.getAlto()-1;
				}
			}
			nuevoLinea[i] = lineaTemp;
			lineaTemp = new String();
		}
		
		super.lineas = nuevoLinea;
	}
	
	private void crearMarcoPro( char caracter ) {
		String[] lineaAntigua = super.getLineas();
		String[] nuevoLinea = new String[lineaAntigua.length + 2];
		String lineaTemp = new String();
		
		for (int i = 0; i < super.getAncho(); i++)
			nuevoLinea[0] += caracter;
		
		for (int i = 0; i < nuevoLinea.length; i++) {
			for (int j = 0; j < super.getAncho(); j++) {
				if (i == 0 || i == super.getAlto()-1) {
					lineaTemp += caracter;
				} 
				else if ( (j == 0 && i != 0) || (j == super.getAncho()-1 && i != super.getAncho()-1) ) {
					lineaTemp += caracter;
				} 
				else {
					lineaTemp += lineaAntigua[i-1];
					j += lineaAntigua.length-1;
				}
			}
			nuevoLinea[i] = lineaTemp;
			lineaTemp = new String();
		}
		
		for (int i = 0; i < super.getAncho(); i++)
			nuevoLinea[nuevoLinea.length-1] += caracter;
		
		super.lineas = nuevoLinea;
	}
}
