import java.util.Scanner;

public class T5Ejercicio81Stringcontarpalabras {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("El String introducido por el usuario es:");
		String c =  teclado.nextLine();
		String[] p = c.split(" ");
		
		System.out.println("El en el String introducido hay: "+p.length +" palabras");
	
	
}
}