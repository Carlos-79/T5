import java.util.Scanner;

public class Tema5Ejercicio2Notamedia {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("resource")

		double[] num = new double[10];
		int cont, cont3 = 0,cont4;
		double  result = 0;

		for	(cont = 0; cont < num.length; cont=cont+1){

			System.out.println("Nota de Alumno " +cont + ": ");
			num[cont] = teclado.nextInt();
		} 

		for (int cont2=0; cont2 < num.length ;cont2=cont2+1) {

			result = (result + num[cont2]);	

			cont3 = cont3 + 1;
		}


		result = result /cont3;
		for (cont4=0; cont4 < num.length ;cont4=cont4+1) {
			if (result <num[cont4]){

				System.out.println("alumno " +cont4+"  que supera la media: "+num[cont4]);
			}
		}
		System.out.println("nota media del alumno: "+result);

	}
}


