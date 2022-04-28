/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author davi2
 */
public class Pagamento {
    private Integer valorPago;
    private String data;
    private String tipoPagamento;

    Pagamento(Integer valorPago, String data, String tipoPagamento) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipoPagamento = tipoPagamento;
    }

    public String getData() {
        return this.data;
    }

    public String getTipoPagamento() {
        return this.tipoPagamento;
    }
}