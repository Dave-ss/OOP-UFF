/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1.locadora;

/**
 *
 * @author davi2
 */
public class Carro {
    private boolean step;
    private int chassi;
    private int quilometragem;
    private float valor;
    private String condicao_geral;
    private String condicao_pneu;
    private String data;
    private String documento;
    private String modelo;
    private String marca;
    private String placa;
    private String nome_locador;
    
    public Carro(){
    
    }
    
    public void locacao(String condicao_geral, String data, String documento, String nome_locador, String modelo,String placa){
        
    }
    
    public void verifica_Carro(String condicao_geral, String condicao_pneu, String placa, String chassi, String step){
    
    }
    
    public float custo(String data, String modelo, String quilometragem){
        return valor;
//        o return é pra evitar erro do tipo do metodo
    }
}
