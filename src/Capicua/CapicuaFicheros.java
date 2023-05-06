package Capicua;

import java.io.File;
import java.io.IOException;

public class CapicuaFicheros {

	public static void main(String[] args) throws IOException {

		String w = System.getProperty("user.dir");
		System.out.println("Mi ruta es: " + w);
		ProcessBuilder pb = new ProcessBuilder("java", "Capicua.Capicua");

		pb.directory(new File(".\\bin"));

		pb.redirectInput(new File("./ficheros/capicua/capicua.txt"));
		pb.redirectOutput(new File("./ficheros/capicua/salidacapicua.txt"));
		pb.redirectError(new File("./ficheros/capicua/errorcapicua.txt"));

		pb.start();
		System.out.println("\nFicheros escritos correctamente!!!");
	}
}
