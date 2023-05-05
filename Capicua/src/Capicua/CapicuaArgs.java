package Capicua;

public class CapicuaArgs {

	public static void main(String[] args) {

		if (args.length > 0) {

			String n1 = args[0];
			boolean cap = true;

			for (int i = 0; i < n1.length(); i++) {

				if (n1.charAt(i) != n1.charAt(n1.length() - 1 - i)) {
					cap = false;
				}
			}

			if (cap) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}

		} else {
			System.out.println("No hay parametros");
		}
	}
}
