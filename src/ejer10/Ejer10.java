package ejer10;

import java.util.Scanner;
import java.util.Locale;

/*
 * La FILA (Federación Internacional de Lanzamiento de Algoritmo)
 * realiza una competición donde cada participante escribe un algoritmo
 * en un papel y lo lanza, ganando quien consiga lanzarlo más lejos.
 * La peculiaridad del concurso es que la longitud del lanzamiento se
 * mide en metros (con tantos decimales como se desee), pero para el 
 * ranking solo se tiene en cuenta la longitud en centímetros (sin decimales).
 * Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm
 * solo se contabilizan 1234 cm.
 * 
 * Realiza un programa que solicite la longitud (en metros) 
 * de un lanzamiento y muestre la parte entera correspondiente
 * en centímetros. Utiliza la conversión de tipos.
 */

public class Ejer10 {
	public static void main(String[] args) {
		// Varaible para guardar los metros
		double metros;		
		// Variable del scanner para guardar el input por consola
		Scanner sc = new Scanner(System.in);
		// Cambiar el locale del scanner
		sc.useLocale(Locale.US);
		
		// Preguntar al usuario por los metros
		System.out.print("Introduce los metros recorrigos: ");
		// Guardamos los metros
		metros = sc.nextDouble();
		
		// imprimimos los centimetros
		System.out.println(metros + " es quivalente a " + (int)(metros*100) + " centimetros.");

		// Cerrar scanner
		sc.close();
	}
}
