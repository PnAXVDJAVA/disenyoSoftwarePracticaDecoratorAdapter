package es.uji.ei1039.practica6.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uji.ei1039.practica6.clases.StringArt;
import es.uji.ei1039.practica6.decorator.AsciiArt;
import es.uji.ei1039.practica6.decorator.AsciiArtDecorator;
import es.uji.ei1039.practica6.decorator.Cuadrado;
import es.uji.ei1039.practica6.decorator.DuplicaHorizontal;
import es.uji.ei1039.practica6.decorator.Marco;
import es.uji.ei1039.practica6.decorator.Triangulo;
import es.uji.ei1039.practica6.objetos.Murcielago;
import es.uji.ei1039.practica6.objetos.Rana;

public class Main {
	public static void main(String[] args) {
		
		//PRIMER MAIN
		/*List<AsciiArt> cosas = new ArrayList<AsciiArt>(); 
		cosas.add(new Cuadrado(3, 'o')); 
		cosas.add(new Triangulo(5, 't')); 
		for (AsciiArt cosa : cosas) 
			cosa.dibuja(new Marco(new DuplicaHorizontal(cosa), '·'));
		
		
		//SEGUNDO MAIN
		List<StringArt> animales = new ArrayList<StringArt>();
		animales.add(new Rana());
		animales.add(new Murcielago());
		for (StringArt animal : animales)
			animal.dibuja(new Marco(new StringArt2AsciiArt(animal), '#'));*/
		
		AsciiArt triangulo = new Triangulo( 5 , 'x' );

		for (String linea : triangulo.getLineas()) {
			System.out.println(linea);
		}
		
		System.out.println();
		AsciiArtDecorator dec = new Marco( new DuplicaHorizontal( triangulo ), '#');

		for (String linea : dec.getLineas()) {
			System.out.println(linea);
		}
	}
}
