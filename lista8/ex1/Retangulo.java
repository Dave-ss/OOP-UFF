/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
public class Retangulo extends FormaGeometrica {

    
    public Retangulo(){
        
    }
    
    public void calculaArea(float b, float a){
        this.area = (float)(b*a);
    }
    
    public void calculaPerimetro(float b, float a){
        this.perimetro = (float)((b*2)+(a*2));
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
