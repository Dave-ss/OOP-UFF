
class Mercado{
	public Produto produto;
	public Produto pedido[] = new Produto[10];
	public int quantidadeProduto[] = new int[10];
	public String cliente="";
	public int valor=0;

	public Mercado(){
		
	}

	public void adcItem(Produto p, int quantidade){
		for(int i=0; i<pedido.length;i++){
			if(pedido[i]==null){
				pedido[i] = p;
			}
			else System.out.println("o carrinho esta cheio.");
		}
	}

	public int getPrecototal(){
		int k=0;
		for (int i=0; i<pedido.length;i++){
			k = pedido[i].preco * quantidadeProduto[i];
			valor += k;
		}
		return valor;
	}
	
}
