package ejer7;

import java.util.Scanner;
import java.util.Locale;

/*
 * Solicita al usuario tres distancias:
 * La primera, medida en milímetros.
 * La segunda, medida en centímetros.
 * La última, medida en metros.
 * Diseña un programa que muestre la suma de las tres
 * longitudes floatroducidas (medida en centímetros).
 */

public class Ejer7 {
	public static void main(String[] args) {
		// Variable para guardar los milimetros
		float mm;
		// Variable para guardar los centimtros
		float cm;
		// Varaiable para guardar los metros
		float m;
		// Variable del scanner para el user input
		Scanner sc = new Scanner(System.in);
		// Cambiar el locale al scanner
		sc.useLocale(Locale.US);

		// Pedir al usuario los milimetros
		System.out.print("floatroduce la cantidad de milimetros: ");
		// Guardar los milimetros
		mm = sc.nextFloat();

		// Pedir al usuario los centimetros
		System.out.print("floatroduce la cantidad de centimetros: ");
		// Guardar los centimetros
		cm = sc.nextFloat();

		// Pedir al usuario los metros
		System.out.print("floatroduce la cantidad de metros: ");
		// Guardar los metros
		m = sc.nextFloat();

		// calculamos los centimetros e imprimimos
		System.out.println("El total son " +  (m * 100 + cm + mm / 10) + "cms.");

		// Cerrar el scanner
		sc.close();
	}
}
