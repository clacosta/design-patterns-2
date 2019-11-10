package cap6;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		
		// regra de negocio
		
			Mapa mapa = new GoogleMaps();
			mapa.devolveMapa("rua vergueiro");
			
		// ...
		
		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.hoje();
		
	}
	
}
