/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

//import Pessoas.Pessoa;
import Pessoas.Pf;
import Pessoas.Pj;
import java.util.ArrayList;

/**
 *
 * @author davi2
 */
public class Agenda2 {
    //private final ArrayList<Pessoa> pessoas = new ArrayList<>();
    private final ArrayList<Pf> pf = new ArrayList<>();
    private final ArrayList<Pj> pj = new ArrayList<>();

     // todos os contatos da agenda/ buscar por cpf se pf e buscar por cnpj se pj
    
    public Agenda2(){
        //pessoas.add(pf);
        //pessoas.add(pj);         
    }
    
    public Agenda2(Pf p){
        pf.add(p);
    }
    
    public Agenda2(Pj p){
        pj.add(p);
    }
    
    public void addPf(Pf p){
        pf.add(p);
    }
    
    public void addPj(Pj p){
        pj.add(p);
    }
    
    public void buscaPf(String id){
        for(Pf p : pf){
            if(p.getCpf().equals(Integer.valueOf(id))){
                System.out.println("Nome: " + p.getNome());
                System.out.println("Cpf: " + id);
                System.out.println("Local: " + p.getLocal());
                System.out.println("Aniversario: " + p.getAniversario());
            }
        }
    }
    
    public void buscaPj(String id){
        for(Pj p : pj){
            if(p.getCnpj().equals(id)){
                System.out.println("Nome: " + p.getNome());
                System.out.println("cnpj: " + id);
                System.out.println("Local: " + p.getLocal());
                System.out.println("Faturamento: " + p.getFaturamento());
            }
        }
    }
    
    public void printaTudo(){

        System.out.println("Pessoa Fisica: ");
        for(Pf p : pf){
            System.out.println("Nome: " + p.getNome());
            System.out.println("Cpf: " + p.getCpf());
            System.out.println("Local: " + p.getLocal());
            System.out.println("Aniversario: " + p.getAniversario());
        }
        
        System.out.println("Pessoa Juridica: ");
        for(Pj p : pj){
            System.out.println("Nome: " + p.getNome());
            System.out.println("Cpf: " + p.getCnpj());
            System.out.println("Local: " + p.getLocal());
            System.out.println("Faturamento: " + p.getFaturamento());
        }
        
    }
    
}
