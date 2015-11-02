package es.uji.ei1039.practica6.decorator;

public abstract class AsciiArtDecorator extends AsciiArt {
	
	protected AsciiArt asciiArt;
	
	public AsciiArtDecorator( AsciiArt asciiArt ) {
		super.lineas = asciiArt.getLineas();
		this.asciiArt = asciiArt;
	}
	
}
