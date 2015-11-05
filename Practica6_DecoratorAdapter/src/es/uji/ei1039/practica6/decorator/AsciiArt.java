package es.uji.ei1039.practica6.decorator;

public abstract class AsciiArt {
	
	protected String [] lineas = { "XX", "XX" };
	
	public int getAncho() {
		return lineas[0].length();
	}
	
	public int getAlto() {
		return lineas.length;
	}
	
	public String[] getLineas() {
		return lineas;
	}
	
	public void setLineas( String[] lineas ) {
		this.lineas = lineas;
	}

}
