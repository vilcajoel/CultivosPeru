package Gestionador;

import javax.swing.JOptionPane;

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
   public Lista (){  cab=null;  ult=null;}
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
       public String editar (String nombre){
        Nodo P = new Nodo();
        P= cab;
        String msj;
        while(P != null){
            if(P.dato.noe.equalsIgnoreCase(nombre)){
                msj = JOptionPane.showInputDialog("Los kg que editaras");
                P.dato.noe = msj;
                
            }
            P = P.sig;
        }
        if (P != null){
            return "no se encontro el dato";
        }
        return "Kg editados";
    }
    
    public String eliminar(String nombre){
        
        if(cab==null){
            return "Lista vacia";
        }
        if(cab==ult && nombre.equalsIgnoreCase(cab.dato.noe)){
            cab=ult=null;
        } else if(nombre.equalsIgnoreCase(cab.dato.noe)){
            cab=cab.sig;
        }else{
            Nodo ant, temp;
            ant=cab;
            temp=cab.sig;
            while(temp!=null && !temp.dato.noe.equalsIgnoreCase(nombre) ){
                ant=ant.sig;
                temp=temp.sig;
            }
            if(temp!=null){
                ant.sig=temp.sig;
                if(temp==ult){
                    ult=ant;
                }
            }else{
                return "No se encontro el producto";
            }
        }
        
        return nombre+" Eliminado";
    }
 
    
}
