/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



/**
 *
 * @author davi2
 */
public class Agenda {
    private final ArrayList <Compromisso> compromissos = new ArrayList<>();
    private Calendar data = Calendar.getInstance();
    private String idioma;
    
    
    /*
    imprimir compromissos de um dia
    escolher tipo de saida de data
    escolher imprimir*/
    Agenda(){
        
    }
    
    public void addCompromisso(Compromisso c){
        this.compromissos.add(c);
    }
    
    public void setData(int dia, int mes, int ano){
        data.set(dia, mes, ano);
    }
    
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }
    
    public void printaCompromissos(String tipodata){
        for(Compromisso c: compromissos){
            if(c.getData() == this.data){
            System.out.println("Titulo: " + c.getTitulo());
            System.out.println("Descricao: " + c.getDescricao());
            System.out.println("Local: " + c.getLocal());
            /*
            SimpleDateFormat formata = tipo(tipodata);
            String aux = formata.format(c.getData());
            System.out.println("Data: " + aux);
            */
        
            }
            
        }
    }
    
    private SimpleDateFormat tipo(String s){
        if("extenso".equals(s)){
            return formataDataExt(this.idioma);
        }
        else {
            return formataDataNormal(this.idioma);
        }

    }
    
    private SimpleDateFormat formataDataExt(String idioma){
        if("pt".equals(idioma)){
                SimpleDateFormat d = new SimpleDateFormat("E, dd MMM yyyy");
                return d;
            }
        else if("en".equals(idioma)){
                SimpleDateFormat d = new SimpleDateFormat("E, MMM dd yyyy");    
                return d;
            }
        return null;
    }
    
    private SimpleDateFormat formataDataNormal(String idioma){
        if("pt".equals(idioma)){
                SimpleDateFormat d = new SimpleDateFormat("MM/dd/yyyy");
                return d;
            }
        else if("en".equals(idioma)){
                SimpleDateFormat d = new SimpleDateFormat("MM/dd/yyyy");    
                return d;
            }
        return null;
    }
    
    public void printaTodosCompromissos(String tipodata){
        for(Compromisso c: compromissos){
            System.out.println("Titulo: " + c.getTitulo());
            System.out.println("Descricao: " + c.getDescricao());
            System.out.println("Local: " + c.getLocal());
            /*
            SimpleDateFormat formata = tipo(tipodata);
            Calendar aux2 = c.getData();
            formata.setCalendar(aux2);
            
            System.out.println("Data: " + formata.format(aux2));
        */
            }
            
        }
}
