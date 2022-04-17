/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
public class Contato {
    private String nome;
    private String email;
    private String numero;
    
    public Contato(){
        
    }
    
    Contato(String nome, String email, String numero){
        this.email = email;
        this.nome = nome;
        this.numero = numero;
    }
    
    public void set_nome(String nome){
        this.nome = nome;
    }
    
    public String get_nome(){
        return nome;
    }
    public void set_email(String email){
        this.email = email;
    }
    
    public String get_email(){
        return email;
    }

    public void set_numero(String numero){
        this.numero = numero;
    }
    
    public String get_numero(){
        return numero;
    }

}
