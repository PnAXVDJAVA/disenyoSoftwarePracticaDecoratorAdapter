package es.uji.ei1039.practica6.decorator;

public class MainDuplica {
	
	public static void main(String[] args) {
		
		AsciiArt cuadrado = new Cuadrado( 3 ,  '#' );
		for( String linea: cuadrado.getLineas() ) {
			System.out.println( linea );
		}
		
		cuadrado = new DuplicaHorizontal( cuadrado );
		
		System.out.println( "------------" );
		
		for( String linea: cuadrado.getLineas() ) {
			System.out.println( linea );
		}
		
		AsciiArt triangulo = new Triangulo( 3 , '+' );
		
		System.out.println( "------------" );
		
		for( String linea: triangulo.getLineas() ) {
			System.out.println( linea );
		}
		
		triangulo = new DuplicaHorizontal( triangulo );
		
		System.out.println( "------------" );
		
		for( String linea: triangulo.getLineas() ) {
			System.out.println( linea );
		}
		
	}

}
