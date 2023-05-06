package sumas;

public class SumaArgs {

	/*
	 * IMPORTANTE: Para probar este algoritmo directamente pulsaremos sobre esta clase
	 * con el bot�n derecho del rat�n y en el men� emergente iremos a "Run As" y
	 * "Run Configurations...", despu�s en la pesta�a Arguments -> TextArea: Program
	 * arguments introduciremos los n�meros para sumar.
	 */
	
	public static void main(String[] args) {

		if (args.length > 0) {

			int suma = 0;
			for (int i = 0; i < args.length; i++) {
				suma = suma + Integer.parseInt(args[i]);
			}

			System.out.println("La suma de los n�meros introducidos es: " + suma);

		} else {

			System.out.println("No hay parametros");

		}
	}
}
