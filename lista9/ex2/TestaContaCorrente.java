/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Aluno
 */
public class TestaContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ContaCorrente c = new ContaCorrente();
    
    try{
    c.depositar(); 
    } 
    catch(IllegalArgumentException a){
        System.out.println(a.getMessage());
    }
    finally{
        c.depositar((float)10);
        System.out.println("Saldo atual R$: "+c.getSaldo());
    }

    try{
        c.setLimite();
    }
    catch(IllegalArgumentException a){
        System.out.println(a.getMessage());
    }
    finally{
        c.setLimite((float)100);
        System.out.println("o seu novo limite é R$: " + c.getLimite());
    }
    
    try{
         c.sacar();
    }
    catch(IllegalArgumentException a){
        System.out.println(a.getMessage());
    }
    finally{
        c.sacar((float)20);
        c.sacar((float)5);
    }
    }
}
