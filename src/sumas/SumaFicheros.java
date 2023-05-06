package sumas;

import java.io.File;
import java.io.IOException;

public class SumaFicheros {

	public static void main(String[] args) throws IOException {
		
		String w = System.getProperty("user.dir");
		System.out.println("Mi ruta es: " + w);
		ProcessBuilder pb = new ProcessBuilder("java","sumas.Suma");
		
		pb.directory(new File(".\\bin"));
		
		pb.redirectInput(new File("./ficheros/sumas/suma.txt"));
		pb.redirectOutput(new File("./ficheros/sumas/salidasuma.txt"));
		pb.redirectError(new File("./ficheros/sumas/errorsuma.txt"));
		
		pb.start();
		System.out.println("\nFicheros escritos correctamente!!!");
	}

}
