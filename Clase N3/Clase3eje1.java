package Mex;

/*. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
el String*/

import java.util.Scanner;

public class Clase3eje1 {
	public static void main(String[] args) {

		int Cuantas = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la letra ");
		char letra;
		letra = entrada.next().charAt(0);

		String cadena = " Ayer gano river";

		for (int i = 0; i < cadena.length(); i++) {

			char actual = cadena.toLowerCase().charAt(i);

			if (actual == letra) {

				Cuantas++;
			}
		}

		System.out.println("la cantidad de letras son " + Cuantas);
	}

}
