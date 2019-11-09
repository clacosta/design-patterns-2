package cap2;

import java.util.List;

import org.jfugue.player.Player;

public class Flauta {

public void toca(List<Nota> notas) {
		
		Player player = new Player();
		
		StringBuffer musicaEmNotas	 = new StringBuffer();
		
		for (Nota nota : notas) {
			
			musicaEmNotas.append(nota.simbolo() + " ");
			
		}
		
		System.out.println(musicaEmNotas);
		
		player.play("V1 I[Flute] ! " + musicaEmNotas.toString());
		
	}
	
}