/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex1;

import java.util.ArrayList;
import Geometric.Circulo;
import Geometric.FiguraGeometrica;
import Geometric.Quadrado;
import Geometric.Triangulo;
 

/**
 *
 * @author davi2
 */
public class Ex1 {

    public static void main(String[] args) {

        ArrayList <FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Triangulo(12.0, 8.0));
        figuras.add(new Quadrado(4));
        figuras.add(new Quadrado(4, 2));
        figuras.add(new Circulo(3));
        
        for(FiguraGeometrica figura : figuras){
            figura.getTipo();
            figura.getArea();
        }
    }
}
