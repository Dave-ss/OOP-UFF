
class Pagamento{
	private String cartao[] = new String[4];
	private String cheque[] = new String[3];
	private String dinheiro[] = new String[3];

	public Pagamento(){
		
	}

	public void pagCartao(String numero, String cvv, String validade, String nome){
		cartao[0] = numero;
		cartao[1] = validade;
		cartao[2] = cvv;
		cartao[3] = nome;
	}

	public void pagCheque(String nome, String numero, String data){
		cheque[0] = numero;
		cheque[1] = data;
		cheque[2] = nome;
	}

	public void pagDinheiro(String valor, String data, String nome){
		dinheiro[0] = nome;
		dinheiro[1] = data;
		dinheiro[2] = valor;	
	}
}
