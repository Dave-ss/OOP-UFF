
class Porta{
	private boolean estado=false;
	
	public Porta(){
		
	}

	Porta(boolean estado){
		this.estado = estado;
		
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
}
