/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
public class Circulo extends FormaGeometrica {
    
    public Circulo(){
        
    }
    
    public void calcularArea(float raio){
        this.area = (float)(Math.pow(Math.PI*raio, 2));
    }
    
    public void calcularPerimetro(float raio){
        this.perimetro = (float)(Math.PI*2*raio);
    }
    
    @Override
    public float getArea() {
        return this.area;
    }

    @Override
    public float getPerimetro() {
        return this.perimetro;
    }
    
}
