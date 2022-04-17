/*Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.*/

class Main {
  public static void main(String[] args) {
	Casa casa = new Casa();
	casa.pintaCasa("verde");
	  
	Porta p1 = new Porta(false);
	Porta p2 = new Porta(true);
	Porta p3 = new Porta(false);

	casa.addPorta(p1);
	casa.addPorta(p2);
	casa.addPorta(p3);

	p1.abrirPorta();
	p2.abrirPorta();
	p3.abrirPorta();

	p2.fecharPorta();
	
	
	System.out.printf("A casa de cor %s esta com %d portas abertas.", casa.getCor(), casa.quantasPortasEstaoAbertas());
  }
}
