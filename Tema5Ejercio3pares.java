import java.util.Scanner;

public class Tema5Ejercio3pares {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("resource")

		int[] pares = new int[20];
		int cont, cont2 = 0,cont3;
		for	(cont = 0; cont < pares.length; cont=cont+1){

			if (cont2 %2==0) {

				pares[cont] = cont2;
			}
			else {
				cont =cont -1;
			}
			cont2=cont2+1;
		}

		for	(cont3 = 0; cont3 < pares.length; cont3=cont3+1){
			System.out.println("numeros pares " +pares[cont3]);

		}

	}
}