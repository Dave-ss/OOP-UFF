/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex2;

import java.util.ArrayList;

/**
 *
 * @author davi2
 */
public class Ex2 {

    public static void main(String[] args) {
        Construcao contrucao0 = new Construcao(10, 10, true, true);
        Construcao contrucao1 = new Construcao(100, 1000, true, false);
        Construcao contrucao2 = new Construcao(1000, 100, false, true);
        Carro carro0 = new Carro(100, (float)1.5);
        Carro carro1 = new Carro(1000, (float)1);
        Carro carro2 = new Carro(10000, (float)3.0);
        
        ArrayList <CarbonFootPrint> array = new ArrayList<>();
        
        array.add(contrucao0);
        array.add(contrucao1);
        array.add(contrucao2);
        array.add(carro0);
        array.add(carro1);
        array.add(carro2);
        
        for(CarbonFootPrint c : array){
            System.out.println(c.getCarbonFootPrint());
        }
    }
}
