package es.uji.ei1039.practica6.adapter;

import es.uji.ei1039.practica6.decorator.AsciiArt;

public class StringArt2AsciiArt extends AsciiArt {
	
	private StringArt stringArt;
	
	public StringArt2AsciiArt( StringArt stringArt ) {
		this.stringArt = stringArt;
		super.setLineas( getLineasFromStringArt() );
	}
	
	private String[] getLineasFromStringArt() {
		String dibujo = this.stringArt.Dibujo();
		String [] lineas = adaptaLineas( dibujo.split( "\n" ) );
		return lineas;
	}

	private String[] adaptaLineas( String[] lineas ) {
		int maxLen = 0;
		for( String linea: lineas ) {
			if( linea.length() > maxLen ) {
				maxLen = linea.length();
			}
		}
		
		for( int i = 0; i < lineas.length; i++ ) {
			int len = lineas[i].length();
			for( int j = len; j < maxLen; j++ ) {
				lineas[i] += ' ';
			}
		}
		
		return lineas;
	}

}
