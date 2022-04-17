/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex4;

/**
 *
 * @author davi2
 */
public class Ex4 {

    public static void main(String[] args) {
        Data d0 = new Data();
        d0.criaData(01, 10, 1998);
        System.out.printf("%d/%d/%d\n", d0.getDia(),d0.getMes(),d0.getAno());
        
        Data d1 = new Data();
        d1.criaData("december", 07, 1998);
        System.out.printf("%s %d, %d\n", d1.getMess(), d1.getDia(), d1.getAno());
        
        Data d2 = new Data();
        d2.criaData(7, 1999);
        System.out.printf("%d %d\n", d2.getDia(), d2.getAno());
    }
}
