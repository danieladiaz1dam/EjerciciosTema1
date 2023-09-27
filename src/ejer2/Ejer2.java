package ejer2;

import java.util.Locale;
import java.util.Scanner;

/*
 * Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que
 * sumarle para que sea múltiplo de 7. Por ejemplo, a 2 hay que sumarle 5 para que
 * sea múltiplo de 7. En el caso de 13 habría que sumarle 1.
 * Usa el operador módulo (%) para calcularlo.
*/

public class Ejer2 {
	public static void main(String[] args) {
		// Variable para guardar un numero entero
		int num;
		// Variable para guardar la diferencia
		int difference = 0;
		// Variable para guardar el siguiente multiplo
		int multiplo;
		// Variable del scanner para el user input
		Scanner sc = new Scanner(System.in);
		// Cambiar el locale al scanner
		sc.useLocale(Locale.US);

		// Pedirle un numero entero al usuario
		System.out.print("Introduce un numero entero: ");
		// guardamos el user input en la variable num
		num = sc.nextInt();

		// Calculamos el multiplo mas cercano con ese numero, y le sumamo 1 para que sea
		// el siguiente
		multiplo = num / 7 + 1;

		// La diferencia se calcula restando el numero al multiplo de 7
		difference = 7 * multiplo - num;

		// Imprimimos la diferencia
		System.out.println("La diferencia hasta el siguiente multiplo de 7 es: " + difference);

		// Cerramos el scanner
		sc.close();
	}
}
