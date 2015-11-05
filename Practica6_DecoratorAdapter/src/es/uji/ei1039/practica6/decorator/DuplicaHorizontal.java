package es.uji.ei1039.practica6.decorator;

public class DuplicaHorizontal extends AsciiArtDecorator {
	
	private AsciiArt asciiArt;
	
	public DuplicaHorizontal( AsciiArt asciiArt ) {
		this.asciiArt = asciiArt;
		this.duplicaHorizontal();
	}
	
	private void duplicaHorizontal() {
		String[] lineas = this.getLineas();
		for (int i = 0; i < lineas.length; i++) {
			lineas[i] = lineas[i] + lineas[i]; 
		}
		this.setLineas( lineas );
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
