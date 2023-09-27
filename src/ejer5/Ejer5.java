package ejer5;

import java.util.Scanner;
import java.util.Locale;

/*
 * Dado el siguiente polinomio de segundo grado: y=ax2+bx+c
 * Crea un programa que pida los coeficientes a, b y c,
 * así como el valor de x, y calcula el valor correspondiente de y.
 */

public class Ejer5 {
	public static void main(String[] args) {
		// Variable para coeficiente a
		float a;
		// Variable para coeficiente b
		float b;
		// Variable para coeficiente c
		float c;
		// Variable para coeficiente x
		float x;
		// Variable para guardar el resultado
		float y;
		// Variable del scanner para leer dator
		Scanner sc = new Scanner(System.in);
		// Cambiamos el locale del scanner a US
		sc.useLocale(Locale.US);

		// Mostrar al usuario el polinomio
		System.out.println("Para el siguiente polinomio: \ny=ax2+bx+c");

		// Preguntar el coeficiente a
		System.out.print("Introduce el coeficiente a: ");
		// Guardar el coeficiente a
		a = sc.nextFloat();

		// Preguntar el coeficiente b
		System.out.print("Introduce el coeficiente b: ");
		// Guardar el coeficiente b
		b = sc.nextFloat();

		// Preguntar el coeficiente c
		System.out.print("Introduce el coeficiente c: ");
		// Guardar el coeficiente c
		c = sc.nextFloat();

		// Preguntar el coeficiente x
		System.out.print("Introduce el coeficiente x: ");
		// Guardar el coeficiente x
		x = sc.nextFloat();

		// Calcular el resultado
		// y=ax2+bx+c
		y = a * x * x + b * x + c;

		// Imprimir el resultado
		System.out.println("y = " + a + " * " + x + "^2 + " + b + " * " + x + " + " + c + " = " + y);

		// Cerramos el scanner
		sc.close();
	}
}
