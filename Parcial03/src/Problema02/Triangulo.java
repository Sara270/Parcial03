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
public class Triangulo implements Poligono {

    @Override
    public int area(int a, int b) {
        int altura =a;
        int base =b;
        return (a*b)/2;
    }

    @Override
    public int perimetro(int a, int b, int c) {
        return a+b+c;
    }
    
}
