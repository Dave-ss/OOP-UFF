/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometric;

/**
 *
 * @author davi2
 */
public class FiguraGeometrica {
    protected double area = 0;
    protected String tipo;
    
    public FiguraGeometrica(){
        
    }
    //quadrado A=b*b ok
    //circulo A=pi*r*r ok
    //retangulo A=b*h ok
    //triangulo A=(b*h)/2 ok
    
    public void getArea(){
        System.out.println("Area = " + area);
    }
    public void getTipo(){
        System.out.println("Tipo = " + tipo);
    }
}
