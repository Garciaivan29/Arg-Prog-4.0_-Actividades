package Logistica_estrategica;
import java.io.BufferedReader; //hace lectura del texto
import java.io.FileReader; //hace la lectura del fichero
 
 import java.io.FileNotFoundException; 
 import java.io.IOException; 
 

public class PronosticoDeportivo {

public static void main(String[] args) throws FileNotFoundException, IOException { 
       //FileReader partidos = null; 
      // FileReader pronosticos = null;  
          
         try{ 
             BufferedReader lector1 = new BufferedReader(new FileReader("Storage\\emulated\\JavaNide\\TrabajoPracticoPronosticoDeportivo\\app\\src\\main\\java\\logistica_estrategica\\partido.txt"));
             BufferedReader lector2 = new BufferedReader(new FileReader("Storage\\emulated\\JavaNide\\TrabajoPracticoPronosticoDeportivo\\app\\src\\main\\java\\logistica_estrategica\\pronosticos.txt"));
              
             //en el primer txt...
             String line = lector1.readLine(); 
             String line2 = lector2.readLine(); 
             int puntaje=0; 
          
          
          
             while((line = lector1.readLine()) != null){ 
              
                 String[]parts=line.split(","); 
                 String equipo1 = parts[0]; 
  
                 int goles1 = Integer.parseInt(parts[1]); 
                 int goles2 = Integer.parseInt(parts[2]); 
  
                 String equipo2 = parts[3]; 
                 Equipo miequipo1=new Equipo(equipo1,"El mejor equipo..."); 
                 Equipo miequipo2=new Equipo(equipo1,"El peor equipo de todos..."); 
                 Partido partido = new Partido(miequipo1,miequipo2,goles1,goles2); 
  
  
                 //en el segundo txt...

                 line2=lector2.readLine(); 
                 String[]parts2 =line2.split(","); 
                 String linea1 = parts2[1]; 
                 String linea2 = parts2[2]; 
                 String linea3 = parts2[3]; 
  
                 if(linea1.equalsIgnoreCase("x")){ 
                     Pronostico pronostico = new Pronostico(partido,miequipo1,ResultadoEnum.ganador); 
                     puntaje=puntaje+pronostico.puntos(); 
  
                 } 
                 else{ 
                     if(linea2.equalsIgnoreCase(("x"))){ 
                         Pronostico pronostico=new Pronostico(partido,miequipo1,ResultadoEnum.Empate); 
                         puntaje=puntaje+pronostico.puntos(); 
                     } 
  
                 else{ 
                      if(linea3.equalsIgnoreCase(("x"))){ 
                         Pronostico pronostico=new Pronostico(partido,miequipo1,ResultadoEnum.Perdedor); 
                         puntaje=puntaje+pronostico.puntos(); 
                     }    
                 } 
                } 
             } 
  
                 System.out.println("Con su pronostico usted gano  " + puntaje+ "  puntos"); 
                 lector1.close(); 
                 lector2.close(); 
  
         }catch( Exception e ){ 
         System.out.println("Error al leer el archivo"); 
     } 
  
          
         } 
     }     
   
 //estructura para verificar errores 
 //        try { 
     
/Doy inicio al archivo y le coloco el txt a leer 
 //            partidos=new FileReader("Storage\\emulated\\JavaNide\\TrabajoPracticoPronosticoDeportivo\\app\\src\\main\\java\\logistica_estrategica\\partido.txt"));        

           // if para comprobar si existe                                    
           // if(partidos.ready()){ 
              lector1 = new BufferedReader(partidos); //le paso al BufferedReader el archivo txt 
                 String cadena1; //almacena los datos del txt 
 //                        
 //                System.out.println("TXT  " + "PARTIDOS"); 
 // ciclo q se ejecuta si hay info en el txt 
 // while ((cadena1 = lector1.readLine()) != null) { 
               
 //System.out.println(cadena1); 
 //     } 
 // partidos.close();     
 //                 
 //  }else{ 
 //   System.out.println("El archivo 'partidos.txt' no esta listo para ser leido" ); 
 //    } 
 // 
 //        } catch (Exception e) { 
 //             
 //            System.out.println("Error:  " + "NO EXISTE EL ARCHIVO partidos.txt"); 
 //         
 //        }finally{ 
 //            try{ 
 //                if(null != partidos){ 
 //                    partidos.close(); 
 //                } 
 //            }catch(Exception e){ 
 //                e.printStackTrace(); 
 //            } 
 //        } 
 //         
 //        //salto de linea 
 //       System.out.println(); 
 //       System.out.println(); 
 //       System.out.println(); 
 //         
 //        
 //        
 //        /*ARCHIVO N2*/ 
 //         
 //        //estructura para verificar errores 
 //        try { 
 //             
 //             
 //le doy inicio al archivo y le paso el txt a leer 
 //             
 //            pronosticos=new FileReader("Storage\\emulated\\JavaNide\\TrabajoPracticoPronosticoDeportivo\\app\\src\\main\\java\\logistica_estrategica\\pronostico.txt"));
 // 
 //            if( pronosticos.ready()){ 
 //                 
 //  lector2 = new BufferedReader(pronosticos);   
            String cadena2;  
             
   \\System.out.println("TXT  " + "PRONOSTICOS"); 

        while ((cadena2 = lector2.readLine()) != null) { 
       System.out.println(cadena2); 
 //                } 
 //            }else{ 
 //           System.out.println("El archivo 'pronosticos.txt' no esta listo para ser leido" ); 
 //            } 
 // 
 //        } catch (Exception e) { 
 //             
 //    System.out.println("Error:  " + "NO EXISTE EL ARCHIVO Pronosticos"); 
 //         
 //        } 
 //        finally{ 
 //            try{ 
 //                if(null != pronosticos){ 
 //                    pronosticos.close(); 
 //                } 
 //            }catch(Exception e){ 
 //                e.printStackTrace(); 
 //            } 
 //        }