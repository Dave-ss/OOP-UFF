/*Escreva uma classe Televisao sabendo que o estado de uma televisão se caracteriza por estar ligada ou desligada, pelo volume (que está entre 0 e 10), pelo canal (que está entre 0 e 99) e pelo fato de estar em modo silencioso ou não. Crie métodos para ligar/desligar a televisão, mudar o canal (canal específico, canal anterior, próximo canal) e silenciar a televisão. Instancie um objeto dessa classe, utilize seus métodos para mudar de canal, ligar e desligar a TV, silenciar ou dessilenciar a TV e, por último, imprima o estado da TV.
*/

class Main {
  public static void main(String[] args) {
	  Televisao tv = new Televisao();
	  
	  tv.estadoTelevisao(true);
	  tv.silenciaTelevisao(true);
	  tv.silenciaTelevisao(false);
	  tv.silenciaTelevisao(true);
	  tv.getSilencio();
	  tv.silenciaTelevisao(false);
	  tv.mudaVolume(true,false);
	  tv.mudaVolume(true,false);
	  tv.mudaVolume(true,false);
	  tv.mudaVolume(true,false);
	  tv.mudaVolume(false,true);
	  tv.getVolume();
	  tv.mudaCanal(true, false, 0);
	  tv.mudaCanal(true, false, 0);
	  tv.mudaCanal(true, false, 0);
	  tv.mudaCanal(true, false, 0);
	  tv.mudaCanal(true, false, 0);
	  tv.mudaCanal(false, true, 0);
	  System.out.printf("a tv ta no canal %d\n", tv.getCanal());
	  tv.mudaCanal(false, false, 100);
	  tv.mudaCanal(false, false, 15);
	  System.out.printf("a tv ta no canal %d\n", tv.getCanal());
	  tv.getEstado();
  }
}
