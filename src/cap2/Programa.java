package cap2;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
				
		List<Nota> musica = Arrays.asList(
				notas.pega("do"), 
				notas.pega("re"), 
				notas.pega("mi"),
				notas.pega("fa"), 
				notas.pega("fa"), 
				notas.pega("fa")
		);
		
		System.out.println(musica);
		
		Piano piano = new Piano();
		piano.toca(musica);
		
		NotasMusicaisUsandoRefexao notasUsandoReflexao = new NotasMusicaisUsandoRefexao();
		
		List<Nota> musicaUsandoReflexao = Arrays.asList(
				notasUsandoReflexao.pega("do"), 
				notasUsandoReflexao.pega("re"), 
				notasUsandoReflexao.pega("mi"),
				notasUsandoReflexao.pega("fa"), 
				notasUsandoReflexao.pega("fa"), 
				notasUsandoReflexao.pega("fa")
		);
		
		Flauta flauta = new Flauta();
		flauta.toca(musicaUsandoReflexao);
		
	}
	
}
