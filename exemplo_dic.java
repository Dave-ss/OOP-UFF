/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex4;

import  java.util.HashMap;

/**
 *
 * @author davi2
 */
public class Meses {
    private final HashMap<Integer, String> mes = new HashMap<>();
    
    public Meses(){
        
    }
    
    public void criaMeses(){
        this.mes.put(1, "Janeiro");
        this.mes.put(2, "Fevereiro");
        this.mes.put(3, "Março");
        this.mes.put(4, "Abril");
        this.mes.put(5, "Maio");
        this.mes.put(6, "Junho");
        this.mes.put(7, "Julho");
        this.mes.put(8, "Agosto");
        this.mes.put(9, "Setembro");
        this.mes.put(10, "outubro");
        this.mes.put(11, "Novembro");
        this.mes.put(12, "Dezembro");
    }
    
    public String getMes(Integer i){
        return mes.get(i);
    }
}
