/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*
 Escreva um programa de agenda de compromissos. Nesse programa, o usuário poderá
informar sua lista de compromissos em que cada compromisso contém título, 
descrição, local e data. O programa deverá permitir que o usuário imprima todos 
os compromissos de um determinado dia. Além disso, o usuário poderá escolher se
deseja imprimir a data em formato extenso ou não e, ainda, poderá escolher 
imprimir em português ou inglês. Dica: Pesquise sobre as classes Calendar, DataFormat e Locale.

agenda
lista de comprimissos
compromisso(titulo/descrição/local/data)
imprimir compromissos de um dia
escolher tipo de saida de data
escolher imprimir em ptbr ou ingles

*/

package com.mycompany.ex3;

/**
 *
 * @author davi2
 */
public class Ex3 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        Compromisso c1 = new Compromisso("compromisso 1", "teste 1 testando testando 123 testando");
        Compromisso c2 = new Compromisso("compromisso 2", "teste 2 testando testando 456 testando");
        Compromisso c3 = new Compromisso("compromisso 3", "ok, esse é o ultimo testando");
        
        c1.setLocal("BR", "RJ", "NITEROI");
        c2.setLocal("BR", "SP", "CAPAO");
        c3.setLocal("JP", "TOKYO", "NSEI");
        
        agenda.setData(7, 12, 2022);
        
        c1.setData(7, 12, 2022);
        c2.setData(7, 12, 2022);
        c3.setData(7, 12, 1998);
        
        agenda.addCompromisso(c1);
        agenda.addCompromisso(c2);
        agenda.addCompromisso(c3);
        
        
        agenda.setIdioma("pt");
        
        agenda.printaCompromissos("extenso");
        
        agenda.setIdioma("pt");
        
        System.out.println();
        
        agenda.printaTodosCompromissos("normal");
        
    }
}
