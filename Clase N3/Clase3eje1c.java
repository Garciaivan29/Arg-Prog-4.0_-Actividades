package Mex;


/*c. dado un vector de numeros, y un numero X, que sume todos los numeros > X y retorne el resultado */

import java.util.Scanner;

public class Clase3eje1c{

	public static void main(String[] args) {
		
		int y[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		int resultado = 0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el numero x  ");
		int x=entrada.nextInt();
		
		for (int i=0 ; i<y.length ; i++) {    
		
		if (y[i]>x) {
		
		   resultado=resultado+y[i];
     	}
	
	
}
		
		System.out.println("el resultado de la suma de los numeros mayores a x es " + resultado);
		
	}
}
