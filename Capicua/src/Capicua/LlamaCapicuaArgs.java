package Capicua;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LlamaCapicuaArgs {

	public static void main(String[] args) throws IOException {

		File directorio = new File(".\\bin");

		ProcessBuilder pb = new ProcessBuilder("java", "Capicua.CapicuaArgs", "101");
		// Indicar donde estan los .class
		pb.directory(directorio);
		Process p = pb.start();

		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1)
			System.out.print((char) c);

		is.close();

		// Leemos del flujo de error

		InputStream error = p.getErrorStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(error));
		String linea = null;

		while ((linea = br.readLine()) != null) {// Para leer del flujo linea a linea(null por que es linea a linea)
			System.out.println("ERROR: " + linea);
		}
	}
}
