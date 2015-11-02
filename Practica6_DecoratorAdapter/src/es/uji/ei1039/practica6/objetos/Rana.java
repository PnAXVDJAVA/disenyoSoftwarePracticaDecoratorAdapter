package es.uji.ei1039.practica6.objetos;

import java.util.*;

import es.uji.ei1039.practica6.clases.StringArt;

public class Rana extends StringArt {
	
	@Override
	public String dibujo() {
		List<String> rana = new ArrayList<String>();
		rana.add("       __   __");
		rana.add("      /  \\ /  \\");
		rana.add("     | @) | @) |");
		rana.add("    /           \\");
		rana.add("    \\ \\____  __//");
		rana.add("     \\_    ||  /");
		rana.add("___   /    ||  \\  ___");
		rana.add("\\   \\|     ()   |/  /");
		rana.add(" \\   |          |  /");
		rana.add("  \\   \\  \\  /  /  /");
		rana.add("  /   /   \\/   \\  \\");
		rana.add("  UUU  UUU  UUU UUU"); 
		
		String ranaString = "";
		for (String s : rana)
			ranaString += s + "\n";

		return ranaString;
	}
}
