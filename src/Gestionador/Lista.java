package Gestionador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Lista {  
   Nodo  cab, ult;
   Lista (){  cab=null;  ult=null;}
   public String Adiciona(Producto V)
           {    Nodo N = new Nodo();
                N.dato=V;
                N.sig= null;
                if(cab==null) cab = N;
                else ult.sig= N;
                ult= N;
                
                return N+"   "+V ;
                
                
                
           }
   
   public String Recorrer()
           {    Nodo P = cab;
           String msj= "";
               while(P  != null)
                 {  msj= msj +  P.dato +" ";
                     P=P.sig;
                 
                 }
                
                return "recorrido " +msj;
                
                
                
           }
    
}
