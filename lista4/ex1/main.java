/*1 - Escreva um programa que crie uma lista de compras com nomes de produtos que 
serão informados pelo usuário. A lista de compras não poderá ter elementos repetidos.
Implemente também o método imprimirListaDeCompras() que imprime os produtos 
informados em ordem alfabética. Dica: Pesquise sobre Collections.sort()
e o método contains da classe ArrayList.
*/

package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        Compra carrinho = new Compra();
        int c=1;
        String entrada;
        
        do{
            
            System.out.printf("insira o %d° produto: ", c);
            entrada = ler.next();
            if(!"stop".equals(entrada)){
            if(carrinho.adcProduto(entrada)) c++;
            }
          
        }while(!"stop".equals(entrada));
        carrinho.printaProdutosOrd();
    }
    
}
