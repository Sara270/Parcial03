/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema02;

/**
 *
 * @author Sara
 */
public class Cuadrilatero implements Poligono {

    @Override
    public int area(int b, int a) {
       return a*b;
    }

    @Override
    public int perimetro(int a, int b, int c) {
        return 2*a + 2*b;
    }
    
}
