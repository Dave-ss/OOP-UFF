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
    private String aniversario;
    private Integer cpf;
    
    
    public Pf(){
        super();
    }
    
    public Pf(String nome, Integer cpf){
        super(nome);
        this.cpf = cpf;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    
    public String getAniversario() {
        return aniversario;
    }

    public Integer getCpf() {
        return cpf;
    }
    
    
    @Override
    public void printaPessoa() {
        super.printaPessoa();
        System.out.println("Aniversario: " + this.aniversario);
        System.out.println("Cpf: " + this.cpf);
    }
    
    @Override
    public boolean buscaCpf(String id){
        return (this.cpf.equals(Integer.valueOf(id)));
    }
     
}
