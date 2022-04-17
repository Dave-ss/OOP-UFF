
class Porta{
	private String cor="";
	private String dimensao;
	private boolean estado=false;
	

	public Porta(){
		
	}

	Porta(String cor, boolean estado, String dimensao){
		this.cor = cor;
		this.estado = estado;
		this.dimensao = dimensao;
	}

	public void abrirPorta(){
		this.estado = true;
	}

	public void fecharPorta(){
		this.estado = false;
	}

	public boolean isOpen(){
		return estado;	
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public String getCor(){
		return cor;
	}

	public void setDimensao(String dimensao){
		this.dimensao = dimensao;	
	}

	public String getDimenso(){
		return dimensao;
	}
}