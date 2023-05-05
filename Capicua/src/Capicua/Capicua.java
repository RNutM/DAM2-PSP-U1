package Capicua;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

		String n1 = "";
		boolean cap = true;

		try (Scanner sc = new Scanner(System.in)) {
			// Solicito un número al usuario
			System.out.println("Introduce un número");
			n1 = sc.nextLine();// Lo almaceno en n1
		}

		// Ejecuto el bucle mientras que i sea menor que el tamaño de n1 aumento i
		for (int i = 0; i < n1.length(); i++) {

			// Si el primer caracter de n1 es distinto del último caracter de n1 disminuyo i
			if (n1.charAt(i) != n1.charAt(n1.length() - 1 - i)) {
				cap = false;// capicua es falso
			}
		}

		if (cap) {// Si capicua es verdadero
			System.out.println("Es capicua");
		} else {// En caso contrario
			System.out.println("No es capicua");
		}
	}
}
