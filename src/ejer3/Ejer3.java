package ejer3;

import java.util.Scanner;
import java.util.Locale;

/*
 * Modifica el ejercicio anterior para que, indicando dos números,
 * por ejemplo, num1 y num2, diga qué cantidad hay que sumarle a
 * num1 para que sea múltiplo de num2.
 */

public class Ejer3 {
	public static void main(String[] args) {
		// Variable para guardar un numero entero
		int num1;
		// Variable para guardar el numero del que vamos a sacar los multiplos
		int num2;
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
		// guardamos el user input en la variable num1
		num1 = sc.nextInt();

		// Pedirle un numero entero al usuario
		System.out.print("Introduce un numero entero para calcular sus multiplos: ");
		// guardamos el user input en la variable num2
		num2 = sc.nextInt();

		// Calculamos el multiplo mas cercano con ese numero, y le sumamo 1 para que sea
		// el siguiente
		multiplo = num1 / num2 + 1;

		// La diferencia se calcula restando el numero al multiplo de 7
		difference = num2 * multiplo - num1;

		// Imprimimos la diferencia
		System.out.println("La diferencia hasta el siguiente multiplo de " + num2 + " es: " + difference);

		// Cerrar el scanner
		sc.close();
	}
}
