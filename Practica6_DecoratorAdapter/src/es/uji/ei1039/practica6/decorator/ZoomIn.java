package es.uji.ei1039.practica6.decorator;

import java.util.HashMap;
import java.util.Map;

public class ZoomIn extends AsciiArtDecorator {

	private AsciiArt asciiArt;
	private Map<Character, String> characterMapping;
	
	public ZoomIn( AsciiArt asciiArt ) {
		this.asciiArt = asciiArt;
		this.characterMapping = new HashMap<>();
		createCharacterMapping();
		zoom();
	}
	
	private void createCharacterMapping() {
		this.characterMapping.put( ' ' , "         " );
		this.characterMapping.put( '_' , "      ___" );
		this.characterMapping.put( '/' , "  / / /  " );
		this.characterMapping.put( '\\' , "\\   \\   \\" );
		this.characterMapping.put( '@' , " _ /@\\\\_/" );
		this.characterMapping.put( '|' , " |  |  | " );
		this.characterMapping.put( '(' , " / (   \\ " );
		this.characterMapping.put( ')' , " \\   ) / " );
		this.characterMapping.put( 'U' , "| || |\\_/" );
		this.characterMapping.put( 'V' , "| |\\ / v " );
		this.characterMapping.put( 'v' , "| |\\ / v " );
		this.characterMapping.put( '-' , "   ___   " );
		this.characterMapping.put( '\'' , " '  '  ' " );
		this.characterMapping.put( '`' , " `  `  ` " );
		this.characterMapping.put( '#' , "#########" );
	}
	
	private void zoom() {
		int nuevoAlto = getAlto() * 3;
		String[] viejoLineas = getLineas();
		String[] nuevoLineas = new String[ nuevoAlto ];
		
		String mapping = "";
		char ch = ' ';
		
		int _i = 0;
		for( int i = 0; i < getAlto(); i++ ) {
			_i = i*3;
			for( int j = 0; j < getAncho(); j++ ) {
				ch = viejoLineas[i].charAt( j );
				mapping = this.characterMapping.get( ch );
				/*String firstThree = mapping.substring( 0 , 3 );
				String secondThree = mapping.substring( 3, 6 );
				String thirdThree = mapping.substring( 6, 9 );
				if( nuevoLineas[_i] == null ) {
					nuevoLineas[_i] = "";
				}
				nuevoLineas[_i] += firstThree;
				if( nuevoLineas[_i+1] == null ) {
					nuevoLineas[_i+1] = "";
				}
				nuevoLineas[_i+1] += secondThree;
				if( nuevoLineas[_i+2] == null ) {
					nuevoLineas[_i+2] = "";
				}
				nuevoLineas[_i+2] += thirdThree;*/
				for( int cont = 0; cont < 3; cont++ ) {
					String _cont_Three = mapping.substring( cont*3 , cont*3 + 3 );
					if( nuevoLineas[_i + cont] == null ) {
						nuevoLineas[_i + cont] = "";
					}
					nuevoLineas[_i + cont] += _cont_Three;
				}
			}
		}
		
		setLineas( nuevoLineas );
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
