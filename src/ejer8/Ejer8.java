package ejer8;

import java.util.Scanner;
import java.util.Locale;

/*
 * Una empresa que gestiona un parque acuático
 * te solicita una aplicación que les ayude a
 * calcular el importe que hay que cobrar en la
 * taquilla por la compra de una serie de entradas
 * (cuyo número será introducido por el usuario).
 * Existen dos tipos de entradas: infantiles,
 * que cuestan 15,50€; y de adultos, que cuestan 20€.
 * En el caso de que el importe total sea igual o
 * superior a 100€, se aplicará automáticamente un
 * bono descuento del 5%.
 */

public class Ejer8 {
	public static void main(String[] args) {
		// Precio entradas infantiles
		final float PRECIO_ENTRDAS_INFANTILES = 15.5F;
		// Precio entradas de adultos
		final float PRECIO_ENTRADAS_ADULTOS = 20F;
		// Numero de entradas infantiles
		int numEntradasInfantiles;
		// Numero de entradas de adultos
		int numEntradasAdultos;
		// Total a pagar
		float total;
		// Variable del scanner para el user input
		Scanner sc = new Scanner(System.in);
		// Cambiar el locale al scanner
		sc.useLocale(Locale.US);

		// Preguntar al usuario cuantas entradas infantiles quiere
		System.out.print("Cuantas entradas infantiles quiere?: ");
		// Guardar el user input en numEntradasInfantiles
		numEntradasInfantiles = sc.nextInt();

		// Preguntar al usuario cuantas entradas de adultos quiere
		System.out.print("Cuantas entradas de adultos quiere?: ");
		// Guardar el user input en numEntradasAdultos
		numEntradasAdultos = sc.nextInt();

		// Calculamos el total multiplicando el numero de entradas por su precio
		total = numEntradasInfantiles * PRECIO_ENTRDAS_INFANTILES + numEntradasAdultos * PRECIO_ENTRADAS_ADULTOS;
		// Si el total es mayor a 100 euros, lo multiplicamos por .95f para hacer el
		// descuento del 5%
		total = total >= 100 ? total * 0.95f : total;
		
		// Imprimimos el resultado
		System.out.println("El precio total a pagar es: " + total + " euros");

		// Cerrar el scanner
		sc.close();
	}
}
