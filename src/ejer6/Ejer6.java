package ejer6;

import java.util.Scanner;
import java.util.Locale;

/*
 * Diseña una aplicación que solicite al usuario 
 * que introduzca una cantidad de segundos.
 * La aplicación debe mostrar cuántas horas,
 * minutos y segundos hay en el número de segundos 
 * introducidos por el usuario.
 */

public class Ejer6 {
	public static void main(String[] args) {
		// Variable para guardar la cantidad de horas
		int hours;
		// Variable para guardar la cantidad de minutos
		int minutes;
		// Variable para guardar la cantidad de segundos
		int seconds;
		// Variable para guardar el tiempo introducido por el user
		int time;
		// Variable del scanner para el user input
		Scanner sc = new Scanner(System.in);
		// Cambiar el locale al scanner
		sc.useLocale(Locale.US);

		// Preguntar al usuario por una cantidad de segundos
		System.out.print("Introduce una cantidad de segundos: ");
		// Guardamos el user input en time
		time = sc.nextInt();
		
		// Calcular el numero de horas
		hours = time / 3600;
		// Calcular la cantidad de minutos
		minutes = (time / 60) - hours*60;
		// Calcular la cantidad de segundos
		seconds = time - minutes*60 - hours*3600;

		System.out.print(time + " segundos es igual a " + hours + "h " + minutes + "m " + seconds + "s.");

		// Cerrar el scanner
		sc.close();
	}
}
