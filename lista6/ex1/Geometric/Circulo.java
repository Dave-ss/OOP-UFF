/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometric;

/**
 *
 * @author davi2
 */
public class Circulo extends FiguraGeometrica {
    private final float pi;
    
    public Circulo(){
        this.pi = (float) 3.14159265359;
    }
    
    public Circulo(double raio){
        this.pi = (float) 3.14159265359;
        this.tipo = "Circulo";
        this.area = (double)(pi*(raio*raio));     
    }
    
}
