
/*Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) e imprima seu nome e sua idade.*/ 
class Main {
  public static void main(String[] args) {
	  Pessoa alfred = new Pessoa("alf", 1997);
	  alfred.setAno_atual(2022);
	  System.out.printf("sou o %s e agora tenho %d anos\n", alfred.getNome() ,(alfred.ano_atual-alfred.getAno()));
	  alfred.Aniversario();
	  System.out.printf("sou o %s e agora tenho %d anos\n", alfred.getNome() ,(alfred.ano_atual-alfred.getAno()));
	  alfred.Aniversario();
	  System.out.printf("sou o %s e agora tenho %d anos\n", alfred.getNome() ,(alfred.ano_atual-alfred.getAno()));
	  alfred.Aniversario();
	  System.out.printf("sou o %s e agora tenho %d anos\n", alfred.getNome() ,(alfred.ano_atual-alfred.getAno()));
	  alfred.Aniversario();
	  
  }
}
