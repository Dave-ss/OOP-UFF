/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author davi2
 */
public class Carro implements CarbonFootPrint{
    private float combustivel;
    private float cilindrada;
    
    public Carro(){
        
    }
    
    public Carro(float a, float b){
        this.combustivel = a;
        this.cilindrada = b;
    }
    

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    @Override
    public float getCarbonFootPrint() {
        return (float)(this.combustivel * 0.82 * 0.75 * 3.7 * this.cilindrada);
    }
    
    
    
}


//reference https://esalqlastrop.com.br/capa.asp?pi=calculadora_emissoes#:~:text=Agora%2C%20se%20voc%C3%AA%20utiliza%20aproximadamente,kg%20CO2%2Deq%20por%20semana.