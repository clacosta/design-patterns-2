package cap4;

public class Programa {

	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new RaizQuadrada(new Numero(4)), new Numero(10));
		Expressao soma = new Soma(new Multiplicacao(new Divisao(new Numero(10), new Numero(5)), new Numero(2)), direita);
		
		int resultado = soma.avalia();
		
		System.out.println(resultado);
		
	}
	
}
