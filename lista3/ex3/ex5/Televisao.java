
class Televisao{
	
	private boolean estado = false;
	private boolean silencioso = false;
	private int volume = 0;
	private int canal = 0;

	public Televisao(){
		
	}	

	Televisao(boolean estado, boolean silencioso, int volume, int canal){
		this.silencioso = silencioso;
		this.estado = estado;
		this.volume = volume;
		this.canal = canal;
	}

	public void estadoTelevisao(boolean button){
		if (button && this.estado==false) this.estado = true;
		else this.estado = false;
	}

	public void silenciaTelevisao(boolean button){
		if (button && this.silencioso==false) this.silencioso = true;
		else this.silencioso = false;
	}

	public void getSilencio(){
		if(this.silencioso) System.out.println("a tv ta silenciada");
		else System.out.println("a tv não ta silenciada");
	}

	public void mudaVolume(boolean cima, boolean baixo){
		if (this.silencioso==false){
			if(0<=this.volume && this.volume<=10){
				if (cima) this.volume++;
				else if (baixo) this.volume--;
			}
			else System.out.println("O limite de som ja foi atingido.");
		}
	}

	public void getVolume(){
		System.out.printf("O volume da tv é: %d\n", this.volume);
	}

	public void mudaCanal(boolean cima, boolean baixo, int valor){
		if (this.estado){
			if(0<=this.canal && this.canal<=99 && cima) this.canal++;
			else if(0<=this.canal && this.canal<=99 && baixo) this.canal--;
			else if(0<=valor && valor<=99) this.canal = valor;
			else System.out.println("esse canal nao pode ser alcançado");
		}
	}
	public int getCanal(){
		return this.canal;
	}

	public void getEstado(){
		if (this.estado){
			System.out.println("a tv ta ligada");
		}
		else System.out.println("a tv ta desligada");
	}
	
}