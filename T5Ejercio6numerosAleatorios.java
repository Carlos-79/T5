import java.util.Scanner;

public class T5Ejercio6numerosAleatorios {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("resource")

		double [] num = new double [10];
		int cont, cont2;

		for	(cont = 0; cont < num.length; cont=cont+1){

			num[cont] = (double) (Math.random()*10+1);;
		}
		
		for	(cont2 = 0; cont2 < num.length; cont2=cont2+1){
			System.out.println("El número aleatorio guardado en la posición v[" +cont2+"] = " +num[cont2]);

		}
}
}