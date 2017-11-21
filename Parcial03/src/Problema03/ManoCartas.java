/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema03;

import java.util.Random;

/**
 *
 * @author Sara
 */
public class ManoCartas {
    LinkedPositionalList lps = new LinkedPositionalList();
    Random rnd = new Random(); // instancio la clase random para poder escoguer una posición aleatoria
     public void agregarCarta(int valor, String categoria) {
         lps.addFirst(categoria); // agrego la carta 
     }
     public void jugar (String categoria){
         if(lps.isEmpty()!= true){
             lps.remove(lps.last()); // si la lista no esta vacía elimino su ultima posición
         }else{
            lps.remove((Position) rnd); // de estar vacia elemino cuanquiel posicion 
         }
     }
}
