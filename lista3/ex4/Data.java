/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex4;


/**
 *
 * @author davi2
 */
public class Data {
    private int dia=0, mes=0, ano=0;
    private String mess;
    
    public Data(){
        
    }
    
    public void criaData(int mes, int dia, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    
    public void criaData(String mess, int dia, int ano){
        this.mess = mess;
        this.dia = dia;
        this.ano = ano;
    }
    
    public void criaData(int dia, int ano){
        this.dia = dia;
        this.ano = ano;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public String getMess() {
        return mess;
    }
    
    public int getAno() {
        return ano;
    }
}
