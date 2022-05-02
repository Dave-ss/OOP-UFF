/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

import java.util.Date;


/**
 *
 * @author davi2
 */
public class Pf extends Pessoa {
   // private Date aniversario;
    private String aniversario;
    
    
    public Pf(){
        super();
    }
    
    public Pf(String nome, String cpf){
        super(nome, cpf);       
    }

//    public void setAniversario(int ano, int mes, int dia){
//        this.aniversario = new Date(ano, mes, dia);
//    }
//
//    public Date getAniversario() {
//        return aniversario;
//    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getAniversario() {
        return aniversario;
    }
    
    
    @Override
     public void printaPessoa() {
         super.printaPessoa();
         System.out.println("Aniversario: " + aniversario);
         System.out.println();
     }

}
