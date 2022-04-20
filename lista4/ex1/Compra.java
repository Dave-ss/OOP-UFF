
import java.util.ArrayList;
import java.util.*;


public class Compra {
    private ArrayList<String> lista = new ArrayList();
    
    Compra(){
        
    } 
    
    public boolean adcProduto(String nome){
        if(!lista.contains(nome)){
            lista.add(nome);
            return true;
        }
        else{
            System.out.println("produto já está na lista");
            return false;
        }
    }
    
    private void ordena(ArrayList<String> lista){
        Collections.sort(lista);
    }
    
    
    public void printaProdutosOrd(){
        ordena(lista);
        lista.forEach((objeto) -> {
            System.out.println(objeto);
        });
    }
}
