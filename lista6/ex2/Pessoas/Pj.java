/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author davi2
 */
public class Pj extends Pessoa {

    private double faturamento;
    
    public Pj(){
        super();
    }
    
    public Pj(String razao_social, String cnpj){
        super(razao_social, cnpj);
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public double getFaturamento() {
        return faturamento;
    }
    
    @Override
    public void printaPessoa(){
        super.printaPessoa();
        System.out.println("Faturamento: " + faturamento);
        System.out.println();
    } 
    
}
