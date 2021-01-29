import java.util.Scanner;

public class T5Ejercio5sueldoAlto {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[] nombre = new String[10];
		int[] sueldo = new int[10];

		int cont, cont2, sueldoMaximo = 0;

		for (cont = 0; cont < nombre.length; cont = cont + 1) {

			System.out.println("Nombre " + cont + ": ");
			nombre[cont] = teclado.next();
			System.out.println("sueldo " + cont + ": ");
			sueldo[cont] = teclado.nextInt();
		}

		for (cont2 = 0; cont2 < nombre.length; cont2 = cont2 + 1) {
			if (sueldoMaximo < sueldo[cont2]) {
				sueldoMaximo = sueldo[cont2];
			}
		}
		for (int cont3 = 0; cont3 < nombre[cont3].length(); cont3 = cont3 + 1) {
			if (sueldo[cont3] == sueldoMaximo) {
				System.out.println("nombre: " + nombre[cont3] + " sueldo: " + sueldo[cont3] + "€");
			}
		}
	}
}
