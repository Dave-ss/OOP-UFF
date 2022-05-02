/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

import Pessoas.Pessoa;
//import Pessoas.Pf;
//import Pessoas.Pj;
import java.util.ArrayList;


/**
 *
 * @author davi2
 */
public class Agenda {
    private final ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    
    public Agenda(){
    
    }
    
    public Agenda(Pessoa p){
        this.pessoas.add(p);
    }

    public void addPessoa(Pessoa p) {
        this.pessoas.add(p);
    }
    
    public void printaPessoas(){
        for(Pessoa p : pessoas){
            p.printaPessoa();
        }
    }
    
    public void busca(String id){
        for(Pessoa p : pessoas){
            if(p.getId().equals(id)){
                p.printaPessoa();
                break;
            }
        }
    }
    
}
