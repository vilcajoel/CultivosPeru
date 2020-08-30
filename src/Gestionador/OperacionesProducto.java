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
public class OperacionesProducto {
    int i=-1;
    Producto CrearProducto(String noe,String coe,String cla,String ren,String hum){
    Producto Productos = new Producto();
    Productos.noe = noe; //nombre
    Productos.coe = coe; //codigo    
    Productos.cla = cla; //clima
    Productos.ren = ren; //region
    Productos.hum = hum; //humedad
    //Productos[i].qh = qh;   //quintales por hecatrea
        
    //avanzamos al siguiente producto
    return Productos;
    }
    String MostrarProducto(Producto P){
        return "Se adiciono el producto con: \n" + " Nombre: "+P.noe + " Codigo: " + P.coe + " Clima: " + P.cla +" Region: "+ P.ren +" Humedad: "+ P.hum;
        
    }
    String MostrarDatos(Producto P){
        return P.noe + "  " + P.coe + "  " + P.cla +"  "+ P.ren +"  "+ P.hum;
    }
}
