package Capicua;

import java.io.File;
import java.io.IOException;

public class CapicuaFicheros {

	public static void main(String[] args) throws IOException {

		ProcessBuilder pb = new ProcessBuilder("java", "Capicua.Capicua");

		pb.directory(new File(".\\bin"));

		pb.redirectInput(new File("capicua.txt"));
		pb.redirectOutput(new File("salidacapicua.txt"));
		pb.redirectError(new File("errorcapicua.txt"));

		pb.start();
	}
}
