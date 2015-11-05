package es.uji.ei1039.practica6.decorator;

public abstract class AsciiArtDecorator extends AsciiArt {
	
	public AsciiArtDecorator( AsciiArt asciiArt ) {
		super.setLineas( asciiArt.getLineas() );
	}
	
}
