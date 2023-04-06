package KennyMcCormick;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Realiza un main donde por parametro envie la ruta de un archivo. Ese archivo debe contener numeros. El programa debe escribir por consola la suma de esos numeros
  Al programa anterior agreguele un parametro para que la operacion pueda ser suma o multiplicacion.
 * 
 * @Kenny 
 *
 */
public class Ejer2 {

public static void main(String[] args) throws IOException {

		String archivo = args[0];
		int resultado = 0;
		int l = 0;

		switch (args[1]) {

		case "suma":
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				l = Integer.parseInt(linea);
				resultado = resultado + l;
			}
			System.out.println("La sumatoria es: " + resultado);
			break;

		case "multiplicacion":
			resultado = 1;
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				l = Integer.parseInt(linea);
				resultado = resultado * l;
			}
			System.out.println("La multiplicacion es: " + resultado);
			break;

		}

	}

}
