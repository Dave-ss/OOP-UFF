
public class Celular {

    private double imei;
    private int capacidade_bateria;

    public Celular(){

    }

    Celular(int bateria){
        capacidade_bateria = bateria;
    }

    public void ligacao(int tempo_ligacao){
        capacidade_bateria -= (tempo_ligacao/5);
    }

    public void mensagem(int qtd_msg){
        capacidade_bateria -= qtd_msg;
    }

    public int getCarga(){
        return capacidade_bateria;
    }

    public void setCarga(int tempo_carga){
        capacidade_bateria += tempo_carga;
    }
    
}
