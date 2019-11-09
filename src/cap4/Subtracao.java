package cap4;

public class Subtracao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	
	}

	@Override
	public int avalia() {
		int valoDaEsquerda = this.esquerda.avalia();
		int valorDaDireita = this.direita.avalia();
		return valoDaEsquerda - valorDaDireita ;
	}
	
}
