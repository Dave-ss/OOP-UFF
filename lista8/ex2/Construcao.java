/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author davi2
 */
public class Construcao implements CarbonFootPrint {
    private int numPessoas;
    private int numLampadas;
    private boolean usoArCondicionado;
    private boolean usoEnergiaRenovavel;
    
    public Construcao(){
        
    }
    
    public Construcao(int a, int b, boolean c, boolean d){
        this.numPessoas = a;
        this.numLampadas = b;
        this.usoArCondicionado = c;
        this.usoEnergiaRenovavel = d;
    }
    
    public void setNumLampadas(int i){
        this.numLampadas = i;
    }
    
    public void setNumPessoas(int i){
        this.numPessoas = i;
    }
    
    public void setUsoArCondicionado(boolean i){
        this.usoArCondicionado = i;
    }
    
    public void setUsoEnergiaRenovavel(boolean i){
        this.usoEnergiaRenovavel = i;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public int getNumLampadas() {
        return numLampadas;
    }

    public boolean isUsoArCondicionado() {
        return usoArCondicionado;
    }

    public boolean isUsoEnergiaRenovavel() {
        return usoEnergiaRenovavel;
    }

    @Override
    public float getCarbonFootPrint() {
        float a = 1;
        if (this.usoArCondicionado){
            a = (float) 1.5;
        }
        if (this.usoEnergiaRenovavel){
            a = (float) (a-0.2);
        }
        return (float)(this.numPessoas * a * this.numLampadas * 105);
    }
    
}


//reference https://justenergy.com/blog/how-to-calculate-your-carbon-footprint/