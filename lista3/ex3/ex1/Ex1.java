/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
public class Ex1 {

    public static void main(String[] args) {
        Contato c1 = new Contato("alpha", "a@id.uff.br", "123456");
        Contato c2 = new Contato("bravo", "b@gmail.com", "654321");
        Contato c3 = new Contato("charlie", "c@hotmail.com", "785213");
        
        Agenda agenda = new Agenda();
        
        agenda.adc_contato(c1, 0);
        agenda.adc_contato(c2, 1);
        agenda.adc_contato(c3,2);
        
        agenda.exibe_contatos();
        
    }
}
