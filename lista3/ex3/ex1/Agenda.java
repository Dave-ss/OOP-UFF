/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
// A agenda aceita 10 contatos.

public class Agenda {
    private final Contato contatos[] = new Contato[10];
    
    public Agenda(){
        
    }
    
    public void adc_contato(Contato contato, int i){
        this.contatos[i] = contato;
    }
    
    
    public void exibe_contatos(){
        for (Contato contato : contatos) {
            if (contato == null) break;
            System.out.printf("Nome: %s\n", contato.get_nome());
            System.out.printf("Numero: %s\n", contato.get_numero());
            System.out.printf("Email: %s\n", contato.get_email());
            System.out.println();
        }
    }
}
