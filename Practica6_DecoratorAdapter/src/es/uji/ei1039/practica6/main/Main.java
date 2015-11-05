package es.uji.ei1039.practica6.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uji.ei1039.practica6.adapter.Murcielago;
import es.uji.ei1039.practica6.adapter.Rana;
import es.uji.ei1039.practica6.adapter.StringArt;
import es.uji.ei1039.practica6.adapter.StringArt2AsciiArt;
import es.uji.ei1039.practica6.decorator.AsciiArt;
import es.uji.ei1039.practica6.decorator.AsciiArtDecorator;
import es.uji.ei1039.practica6.decorator.Cuadrado;
import es.uji.ei1039.practica6.decorator.DuplicaHorizontal;
import es.uji.ei1039.practica6.decorator.Marco;
import es.uji.ei1039.practica6.decorator.Triangulo;

public class Main {
	
	public static void main(String[] args) {
		
		//PRIMER MAIN
		List<AsciiArt> cosas = new ArrayList<AsciiArt>(); 
		cosas.add( new Cuadrado( 3, 'o' ) ); 
		cosas.add( new Triangulo( 5, 't' ) ); 
		for ( AsciiArt cosa : cosas ) {
			Dibuja( new Marco( new DuplicaHorizontal( cosa ), '·' ) );
		}
		
		//SEGUNDO MAIN
		List<StringArt> animales = new ArrayList<StringArt>();
		animales.add( new Rana() );
		animales.add( new Murcielago() );
		for ( StringArt animal : animales ) {
			Dibuja( new Marco( new DuplicaHorizontal( new StringArt2AsciiArt(animal) ), '#') );
		}
		
	}
	
	public static void Dibuja( AsciiArt asciiArt ) {
		for( String linea: asciiArt.getLineas() ) {
			System.out.println( linea );
		}
	}
	
}
