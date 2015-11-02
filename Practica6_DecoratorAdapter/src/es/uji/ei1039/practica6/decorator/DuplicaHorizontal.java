package es.uji.ei1039.practica6.decorator;

public class DuplicaHorizontal extends AsciiArtDecorator {
		
	public DuplicaHorizontal( AsciiArt asciiArt ) {
		super( asciiArt );
		this.duplicaHorizontal();
	}
	
	private void duplicaHorizontal() {
		for (int i = 0; i < super.getLineas().length; i++) {
			lineas[i] = lineas[i] + lineas[i]; 
		}
	}

}
