/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometric;

/**
 *
 * @author davi2
 */
public class Triangulo extends FiguraGeometrica {
    
    
    public Triangulo(){
        
    }
    
    public Triangulo(double base, double altura){
        this.tipo = "Triangulo";
        this.area = (double)((base*altura)/2);
    }
    
}
