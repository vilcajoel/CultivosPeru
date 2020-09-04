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
    public Producto CrearProducto(String noe,String coe,String cla,String ren,String hum,int qh,float tp){
    Producto Productos = new Producto();
    Productos.noe = noe; //nombre
    Productos.coe = coe; //codigo    
    Productos.cla = cla; //clima
    Productos.ren = ren; //region
    Productos.hum = hum; //humedad
    Productos.qh =qh;// quintales por hectarea
    Productos.tp =tp; //tamaño promedio
    
        
    //avanzamos al siguiente producto
    return Productos;
    }
    public String MostrarProducto(Producto P){
        return "Se adiciono el producto con: \n" + " Nombre: "+P.noe + " Codigo: " + P.coe + " Clima: " + P.cla +" Region: "+ P.ren +" Humedad: "+ P.hum+ " Quintales por hectarea: "+ P.qh +" Tamaño Promedio: "+P.tp + " cm" ;
        
    }
    public String MostrarDatos(Producto P){
        return "     "+P.coe + "             " + P.noe + "       " + P.cla +"       "+ P.ren +"       "+ P.hum + "                        " + P.qh + "        " + P.tp;
    }
}
