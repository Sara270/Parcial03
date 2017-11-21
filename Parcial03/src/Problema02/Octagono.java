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
public class Octagono implements Poligono {

    @Override
    public int area(int a, int b) {
        int apotema = a;
        int lados =b;
        return 4*b*a;
    }

    @Override
    public int perimetro(int a, int b, int c) {
        return b*8;
    }
    
}
