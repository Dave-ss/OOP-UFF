/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author davi2
 */
public class DiaDaSemana {
    private DiaSemana d;
    public enum DiaSemana{
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
    }
    
    public boolean ehDiaUtil(){
        return d != DiaSemana.DOMINGO && d != DiaSemana.SABADO;
    }

    public void setD(DiaSemana d) {
        this.d = d;
    }

    public DiaSemana getD() {
        return d;
    }
    
}
