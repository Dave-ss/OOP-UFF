/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex2;
import Pessoas.Pessoa;
import Pessoas.Pf;
import Pessoas.Pj;


/**
 *
 * @author davi2
 */
public class Ex2 {

    public static void main(String[] args) {
        Pf pf1 = new Pf("dave", 1234567890);
        pf1.setAniversario("7/12/9999");
        pf1.setLocal("Brazil", "Rj", "niteroi");
        
        Pj pj1 = new Pj("c", "456-5458-45");
        pj1.setLocal("Brazil", "Sp", "zsul");
        pj1.setFaturamento(9999);
        
        Pessoa qq = new Pessoa("bobo");
        qq.setLocal("bobolandia", "babado", "bo");
        
        Agenda a = new Agenda();
        
        a.addPessoa(pf1);
        a.addPessoa(pj1);
        a.addPessoa(qq);
        

        
        a.printaPessoas();
        System.out.println();
        System.out.println();
        a.busca("1234567890");

    }
}
