package Kronk;

import java.util.Scanner;

/*Determinar si una persona pertenece al segmento de ingresos altos*/

public class Trabajo1eje2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				" Poseer una embarcacion, una aeronave de lujo o ser titular de activos societarios que demuestren capacidad economica plena. Ingresar si o no ");
		String activos = entrada.nextLine();

		System.out.println("Ingresos mensuales totales del hogar");
		float IngresosMensuales = entrada.nextInt();

		System.out.println(" Ingrese cuantos vehiculos tiene con una antig�edad menor a 5 años.");
		int Vehiculos = entrada.nextInt();

		System.out.println(" Ingrese  la cantidad de inmuebles que tenga");
		int Inmuebles = entrada.nextInt();

		// Si pertenece alguno de estas opciones entonces perteneceria al segmento de
		// ingresos altos
		if ((Inmuebles >= 3) || (IngresosMensuales >= 489.083) || (Vehiculos >= 3)
				|| (activos.equalsIgnoreCase(activos))) {

			System.out.println("Pertenece al segmento de ingresos altos");

		} else {
			System.out.println("NO Pertenece al segmento de ingresos altos");
		}
	}
}
