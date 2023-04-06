package Logistica_estrategica;


public class Ronda { 
      
     private String nro; 
     private Partido partdio; 
      
     public Ronda(String nro, Partido partdio) { 
         this.nro = nro; 
         this.partdio = partdio; 
     } 
  
     public String getNro() { 
         return nro; 
     } 
  
     public void setNro(String nro) { 
         this.nro = nro; 
     } 
  
     public Partido getPartdio() { 
         return partdio; 
     } 
  
     public void setPartdio(Partido partdio) { 
         this.partdio = partdio; 
     } 
         
      
 }