package ejer1;

import java.util.Locale;
import java.util.Scanner;

/*
 * Realizar un programa que pida como entrada un número con decimales 
 * y lo muestre redondeado al entero más próximo.
 * (SIN UTILIZAR Math.round())
*/

public class Ejer1 {
	public static void main(String[] args) {
		// Variable para guardar el numero con decimales
		float num;
		// Variable para guardar la parte entera
		int parteEntera;
		// Variable para redondear o truncar
		boolean truncar;
		// Variable del scanner para el user input
		Scanner sc = new Scanner(System.in);
		// Cambiar el locale al scanner
		sc.useLocale(Locale.US);

		// Pedir el numero al user
		System.out.print("Introduce un numero con decimales: ");
		// Guardar el user input en la variable num
		num = sc.nextFloat();

		// Guardamos la parte entera del float
		// Ej: 3.45 ==> 3
		parteEntera = (int) num;

		// Si el numero es mas pequeño que la parteEntera + 0.5, lo truncamos
		// Ej: 3.45 < 3.5, truncar = true
		truncar = num < (float) (parteEntera + 0.5f);

		// Usamos el operador ternario apra imprimir el la parte entera o la parte
		// entera + 1, segun nuestra variable truncar
		System.out.println("El numero redondeado es: " + (truncar ? parteEntera : parteEntera + 1));

		// Cerramos el scanner
		sc.close();
	}
}
