package cap4;

public class RaizQuadrada implements Expressao {

	private Expressao radicando;

	public RaizQuadrada(Expressao numero) {
		this.radicando = numero;
	}
	
	@Override
	public int avalia() {
		int radicandoValor = this.radicando.avalia();
		return (int) Math.sqrt(radicandoValor);
	}

}
