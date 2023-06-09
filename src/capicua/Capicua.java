package capicua;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

		String n1 = "";
		boolean cap = true;

		try (Scanner sc = new Scanner(System.in)) {
			// Solicito un n�mero al usuario
			System.out.println("Introduce un n�mero");
			n1 = sc.nextLine();// Lo almaceno en n1
		}

		// Ejecuto el bucle mientras que i sea menor que el tama�o de n1 aumento i
		for (int i = 0; i < n1.length(); i++) {

			// Si el primer caracter de n1 es distinto del �ltimo caracter de n1 disminuyo i
			if (n1.charAt(i) != n1.charAt(n1.length() - 1 - i)) {
				cap = false;// capicua es falso
			}
		}

		if (cap && !n1.isBlank()) {// Si capicua es verdadero y n1 no est� en blanco
			System.out.println("Es capicua");
		} else if (cap == false) {// Si capicua es falso
			System.out.println("No es capicua");
		} else if (n1.isBlank()) {// Si n1 est� en blanco
			System.out.println("No se ha introducido ning�n n�mero o est� en blanco");
		}

	}
}
