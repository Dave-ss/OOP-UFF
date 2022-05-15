/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
public class Triangulo extends FormaGeometrica {

    @Override
    public float getArea() {
        return this.area;
    }

    @Override
    public float getPerimetro() {
        return this.perimetro;
    }
    
    public void calculaArea(float b, float a){
        this.area = (float)((b*a)/2);
    }
    
    public void calculaPerimetro(float a, float b, float c){
        this.area = (float)(a+b+c);
    }
}
