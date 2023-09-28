package ejer4;

import java.util.Scanner;
import java.util.Locale;

/*
 * Crea un programa que pida la base y la altura de
 * un triángulo y muestre su área. (AT = base*altura/2)
 */

public class Ejer4 {
	public static void main(String[] args) {
		// Variable para guardar la altura del triangulo
		float height;
		// Variable para guardar la base del triangulo
		float base;
		// Variable del scanner para leer dator
		Scanner sc = new Scanner(System.in);
		// Cambiar el locale al scanner
		sc.useLocale(Locale.US);
		
		// Pedimos la altura al usuario
		System.out.print("Introduce la altura del triangulo: ");
		// Guardamos la altura del triangulo
		height = sc.nextFloat();
		
		// Pedimos la base al usuario
		System.out.print("Introduce la base del triangulo: ");
		// Guardamos la base del triangulo
		base = sc.nextFloat();
		
		// Imprimimos el area del triangulo
		System.out.println("El area del triangulo es " + (base*height/2));
		
		// Cerrar el scanner
		sc.close();
	}
}
