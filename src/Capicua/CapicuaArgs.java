package Capicua;

public class CapicuaArgs {

	/*
	 * IMPORTANTE: Para probar este algoritmo directamente pulsaremos sobre esta clase
	 * con el bot�n derecho del rat�n y en el men� emergente iremos a "Run As" y
	 * "Run Configurations...", despu�s en la pesta�a Arguments -> TextArea: Program
	 * arguments introduciremos el n�mero para analizar si es capicua o no.
	 */

	public static void main(String[] args) {

		if (args.length > 0) {

			String n1 = args[0];
			boolean cap = true;

			for (int i = 0; i < n1.length(); i++) {

				if (n1.charAt(i) != n1.charAt(n1.length() - 1 - i)) {
					cap = false;
				}
			}

			if (cap && !n1.isBlank()) {// Si capicua es verdadero y n1 no est� en blanco
				System.out.println("Es capicua");
			} else if (cap == false) {// Si capicua es falso
				System.out.println("No es capicua");
			} else if (n1.isBlank()) {// Si n1 est� en blanco
				System.out.println("No se ha introducido ning�n n�mero o est� en blanco");
			}

		} else {
			// Esta l�nea solo saldr� si el tercer par�metro de ProcessBuilder del archivo
			// LlamaCapicuaArgs no existe:
			// ProcessBuilder pb = new ProcessBuilder("java", "Capicua.CapicuaArgs");
			// Aqu� vemos que si existe el tercer par�metro aunque le dejemos en blanco:
			// ProcessBuilder pb = new ProcessBuilder("java", "Capicua.CapicuaArgs", " ");
			System.out.println("No hay parametros");
		}
	}
}
