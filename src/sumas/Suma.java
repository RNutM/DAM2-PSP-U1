package sumas;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {

		int n1, n2, suma;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce un número");
			n1 = sc.nextInt();
			System.out.println("Introduce otro número");
			n2 = sc.nextInt();
		}
		suma = n1 + n2;
		System.out.println("La suma de " + n1 + " + " + n2 + " es: " + suma);
	}
}
