/*
Pesquise na API Java os tipos de Exceção IllegalArgumentException e NumberFormatException.
O que causa essas exceções? (escreva como comentário em seu código). Implemente 
um programa em Java que faça o tratamento dessas exceções
 */


package com.mycompany.ex1;

import java.util.ArrayList;

/**
 *
 * @author davi2
 */
/*IllegalArgumentException: ao passar os argumentos a um metodo, se a condição dentro do
metodo não for cumprida entao o IllegalArgumentException é chamado, por exemplo 
o medodo aceita somente valores positivos e um valor negativo é inserido.
NumberFormatException: é causado por diversos fatores, por exemplo  Integer.parseInt(null);
Integer.parseInt("");, Integer.parseInt("123 ");, Long.parseLong("b2");.
*/


public class Ex1 {

    public static void main(String[] args) {
        Teste t = new Teste();
        try{
            t.setSoma("", "123");
        }
        catch(NumberFormatException a){
            System.out.println(a.getMessage());
        }
        finally{
            t.setSoma("123", "1");
            System.out.println(t.getSoma());
        }
        
        t.setNome("123");
        
    }
}

