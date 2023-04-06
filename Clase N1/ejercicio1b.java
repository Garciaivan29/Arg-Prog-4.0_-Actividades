package DanMex;

public class ejercicio1b {

 public static void main(String[] args){
   int numeroInicio = 5;
   int numeroFin = 14;
   //Se deberan mostrar los numeros:
   //5,6,7,8,9,10,11,12,13,14
         while(numeroInicio<=numeroFin) {
           if ((numeroInicio % 2 ) == 0) {
            System.out.println(numeroInicio);
           }
           numeroInicio=numeroInicio+1;
         }
 }


}
