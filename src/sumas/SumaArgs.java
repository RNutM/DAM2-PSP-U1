package sumas;

public class SumaArgs {

	/*
	 * IMPORTANTE: Para probar este algoritmo directamente pulsaremos sobre esta clase
	 * con el botón derecho del ratón y en el menú emergente iremos a "Run As" y
	 * "Run Configurations...", después en la pestaña Arguments -> TextArea: Program
	 * arguments introduciremos los números para sumar.
	 */
	
	public static void main(String[] args) {

		if (args.length > 0) {

			int suma = 0;
			for (int i = 0; i < args.length; i++) {
				suma = suma + Integer.parseInt(args[i]);
			}

			System.out.println("La suma de los números introducidos es: " + suma);

		} else {

			System.out.println("No hay parametros");

		}
	}
}
