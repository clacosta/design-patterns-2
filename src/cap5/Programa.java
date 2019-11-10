package cap5;

public class Programa {

	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		
		int resultado = esquerda.avalia();
		
		System.out.println(resultado);
		
		Visitor impressora = new ImpressoraVisitor();
		esquerda.aceita(impressora);
		
		System.out.println();
		
		PreFixaVisitor preFixa = new PreFixaVisitor();
		esquerda.aceita(preFixa);
		
	}
	
}
