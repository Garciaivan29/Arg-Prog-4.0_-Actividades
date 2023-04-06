package Mex;

public class Clase3eje2 {

	public static void main(String[] args) {

	int pos;
	String cadena1,cadena2;
	
	cadena1="hola que tal";
	
	cadena2="abcdefghijklmnñopqrstuvwxyz";
	
	
	for (int i = 0; i < cadena1.length(); i++) {
		
		 char actual=cadena1.toLowerCase().charAt(i);
		 
	   	pos=cadena2.indexOf(actual);
	   	
	   
	   	char actual2=cadena2.toLowerCase().charAt(pos+2);  //Con desplazamiento 2 es pos+2
		
	   	System.out.print(actual2);
	   	
	   	
	   	 
	}
	 
	
	
}

}	

