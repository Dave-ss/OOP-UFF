/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
public class Teste {
    private int soma;
    private String nome;
    
    public Teste(){
        
    }
    
   

    public int getSoma() {
        return soma;
    }

    public void setSoma(String a, String b){
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        this.soma = x+y;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
    }
    
    
}
