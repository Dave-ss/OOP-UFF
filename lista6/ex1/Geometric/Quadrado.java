/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometric;

/**
 *
 * @author davi2
 */
public class Quadrado extends FiguraGeometrica {
    
    public Quadrado(){
        
    }
    
    public Quadrado(double base){
        this.tipo = "Quadrado";
        this.area = base*base;
    }
    
    public Quadrado(double base, double altura){
        this.tipo = "Retangulo";
        this.area = base*altura;
    }
}
