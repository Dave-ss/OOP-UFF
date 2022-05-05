/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

import java.util.Locale;

/**
 *
 * @author davi2
 */
public class Pessoa {
    protected String nome;
    protected Locale local;
//    protected String id;
    
    public Pessoa(){
        this("");
    }

    public Pessoa(String nome){
        this.nome = nome;
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setLocal(String pais, String estado, String local){
       this.local = new Locale(pais, estado, local);
    } 

    public boolean buscaCpf(String id){
        return false;
    }

    public boolean buscaCnpj(String id){
        return false;
    }    
    
    public void printaPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Local: " + local);
        
    }
    
    public String getNome(){
        return nome;
    }

    public Locale getLocal(){
        return local;
    }   

   
}
