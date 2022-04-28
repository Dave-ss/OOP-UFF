/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author davi2
 */

import java.util.*;

public class Fatura {
    private String cliente;
    private String data;
    private Integer valor;
    private ArrayList<Boleto> boletos;
    private ArrayList<Pagamento> pagamentos;

    Fatura(ArrayList<Boleto> boletos, Integer valor) {
        this.boletos = boletos;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
    }

    public Integer getValor() {
        return this.valor;
    }

    public ArrayList<Boleto> getBoletos() {
        return this.boletos;
    }

    public ArrayList<Pagamento> getPagamentos() {
        return this.pagamentos;
    }

    public void addPagamentos(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }
}