package Capicua;

public class CapicuaArgs {

	/*
	 * IMPORTANTE: Para probar este algoritmo directamente pulsaremos sobre esta clase
	 * con el botón derecho del ratón y en el menú emergente iremos a "Run As" y
	 * "Run Configurations...", después en la pestaña Arguments -> TextArea: Program
	 * arguments introduciremos el número para analizar si es capicua o no.
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

			if (cap && !n1.isBlank()) {// Si capicua es verdadero y n1 no está en blanco
				System.out.println("Es capicua");
			} else if (cap == false) {// Si capicua es falso
				System.out.println("No es capicua");
			} else if (n1.isBlank()) {// Si n1 está en blanco
				System.out.println("No se ha introducido ningún número o está en blanco");
			}

		} else {
			// Esta línea solo saldrá si el tercer parámetro de ProcessBuilder del archivo
			// LlamaCapicuaArgs no existe:
			// ProcessBuilder pb = new ProcessBuilder("java", "Capicua.CapicuaArgs");
			// Aquí vemos que si existe el tercer parámetro aunque le dejemos en blanco:
			// ProcessBuilder pb = new ProcessBuilder("java", "Capicua.CapicuaArgs", " ");
			System.out.println("No hay parametros");
		}
	}
}
