/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */

public interface doc
{
   
   // 

    /**
     * Devuelve el contenido del archivo tras insertar la linea line en la linea
     * numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi 
     * sucesivamente.
     * @param x Numero de la linea donde se quiere insertar el contenido de la linea
     * @param line Es la informacionq ue hay que insertar en x
     * @param file Aqui guardaremos el contenido
     * @return String con el contenido modificado
     * @see  String
     */
   public abstract String escribirLinea(int x, String line, String file);
   
   
}

