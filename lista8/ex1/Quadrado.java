/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
public class Quadrado extends FormaGeometrica implements umLado{
    
    public Quadrado(){
        
    }

    @Override
    public float getArea() {
        return this.area;
    }

    @Override
    public float getPerimetro() {
        return this.perimetro;
    }

    @Override
    public void calculaArea(float i) {
        this.area = (float)(i*i);
    }

    @Override
    public void calculaPerimetro(float i) {
        this.perimetro = (float)(i*4);
    }
    
    
}
