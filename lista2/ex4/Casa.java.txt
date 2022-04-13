
class Casa{
	private String cor="";
	private Porta portas[] = new Porta[10];

	public Casa(){
		
	}

	public void pintaCasa(String cor){
		this.cor = cor;		
	}

	public String getCor(){
		return cor;
	}

	public void addPorta(Porta p){
		
		for(int i=0; i<portas.length; i++){
			if (portas[i] == null){
				portas[i] = p;
				break;
			}
		}
	}

	public int quantasPortasEstaoAbertas(){
		int c = 0;
		for(int i=0; i<portas.length; i++){
			if(portas[i]!= null && portas[i].isOpen()){
				c++;
			}
		}
		return c;
	}
	
}