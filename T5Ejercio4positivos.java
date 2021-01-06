import java.util.Scanner;

public class T5Ejercio4positivos {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("resource")

		int [] num = new int [10];
		int cont, cont3 = 0,cont4 = 0,cont5 = 0;

		for	(cont = 0; cont < num.length; cont=cont+1){

			System.out.println("numero " +cont + ": ");
			num[cont] = teclado.nextInt();
		}
		for (int cont2=0; cont2 < num.length ;cont2=cont2+1) {
			if (0 == num[cont2]) {
				cont5=cont5 + 1;
			}
			if (0 <num[cont2]){
				cont3=cont3 + 1;
			}
			if (0 > num[cont2]) {
				cont4=cont4 + 1;
			}

		}
		System.out.println("numero positivo " +cont3);
		System.out.println("numero negativo " +cont4);
		System.out.println("numero cero " +cont5);

	}
}