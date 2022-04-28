/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;


import java.util.Locale;
import java.util.Calendar;


/**
 *
 * @author davi2
 */
public class Compromisso {
   private String titulo;
   private String descricao;
   Locale local;
   Calendar data = Calendar.getInstance();

   Compromisso(){
       
   }
   
   Compromisso(String titulo, String descricao){
       this.titulo = titulo;
       this.descricao = descricao;
   }
   
   public void setLocal(String pais, String estado, String local){
       this.local = new Locale(pais, estado, local);
   }
 
    public void setData(int dia, int mes, int ano){
       data.set(dia, mes, ano);
    } 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Locale getLocal() {
        return local;
    }

    public void setLocal(Locale local) {
        this.local = local;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
   
   
}