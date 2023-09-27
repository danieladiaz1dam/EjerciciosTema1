package ejer9;

import java.util.Scanner;
import java.util.Locale;

/* 
 * Pide dos números al usuario.
 * Deberá mostrarse true si ambos 
 * números son iguales y false en caso contrario.
 */

public class Ejer9 {
	public static void main(String[] args) {
		// Variable para guardar el primer numero
		float num1;
		// Variable para guardar el segundo numero
		float num2;
		// Variable del scanner para guardar el input por consola
		Scanner sc = new Scanner(System.in);
		// Cambiar el locale del scanner
		sc.useLocale(Locale.US);

		// Preguntar por el primer numero
		System.out.print("Introduce el primer numero: ");
		// Guardar el primer numero
		num1 = sc.nextFloat();
		
		// Preguntar por el segundo numero
		System.out.print("Introduce el segundo numero: ");
		// Guardar el segundo numero
		num2 = sc.nextFloat();
		
		// Mostrar si son iguales
		System.out.println(num1 == num2);

		// Cerrar el scanner
		sc.close();
	}
}
